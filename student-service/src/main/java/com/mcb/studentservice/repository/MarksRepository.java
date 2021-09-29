package com.mcb.studentservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mcb.studentservice.dao.Queries;
import com.mcb.studentservice.dto.MarksDetailsDto;
import com.mcb.studentservice.entity.Marks;

@Repository
public interface MarksRepository extends JpaRepository<Marks, Integer> {

	@Query(Queries.GET_MARK_DETAILS_BY_STUDENT_ID)
	public List<MarksDetailsDto> findMarkDetailsByStudentId(Integer studentId);

	@Query(Queries.GET_MARK_DETAILS_BY_SUBEJCT_ID)
	public List<MarksDetailsDto> findMarkDetailsBySubjectId(Integer subjectId);

}
