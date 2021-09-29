package com.mcb.studentservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mcb.studentservice.dao.Queries;
import com.mcb.studentservice.dto.StudentDetailsDto;
import com.mcb.studentservice.entity.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {

	@Query(Queries.GET_STUDENT_DETAILS_BY_ID)
	public StudentDetailsDto findStudentDetailsById(Integer studentId);

	@Query(Queries.GET_STUDENT_BY_GROUP_ID)
	public List<StudentDetailsDto> findStudentDetailsByGroupId(Integer groupId);

	@Modifying
	@Query(Queries.DELETE_STUDENT_DETAILS_BY_ID)
	public void deleteStudentDetails(Integer studentId, Integer isDeleted);
}
