package com.mcb.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mcb.studentservice.dao.Queries;
import com.mcb.studentservice.dto.TeacherDetailsDto;
import com.mcb.studentservice.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

	@Query(Queries.GET_TEACHER_DETAILS_BY_ID)
	public TeacherDetailsDto findTeacherDetailsById(Integer teacherId);

}
