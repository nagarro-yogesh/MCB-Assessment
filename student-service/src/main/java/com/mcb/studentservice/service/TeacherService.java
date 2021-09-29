package com.mcb.studentservice.service;

import com.mcb.studentservice.dto.TeacherDetailsDto;

public interface TeacherService {

	/**
	 * @param teacherId
	 * @return {@link TeacherDetailsDto}
	 */
	public TeacherDetailsDto findTeacherDetailsById(Integer teacherId);
}
