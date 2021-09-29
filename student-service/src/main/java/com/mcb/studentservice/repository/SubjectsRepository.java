package com.mcb.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mcb.studentservice.dao.Queries;
import com.mcb.studentservice.dto.SubjectDetailsDto;
import com.mcb.studentservice.entity.Subjects;

@Repository
public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {

	@Query(Queries.GET_SUBJECT_DETAILS_BY_ID)
	public SubjectDetailsDto findSubjectDetailsById(Integer subjectId);

}
