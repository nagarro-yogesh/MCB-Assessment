package com.mcb.studentservice.service;

import com.mcb.studentservice.dto.StudentDetailsDto;

public interface StudentService {

	/**
	 * @param studentDetailsVO
	 */
	public void addStudentDetails(StudentDetailsDto studentDetailsVO);

	/**
	 * @param studentDetailsVO
	 */
	public void updateStudentDetails(StudentDetailsDto studentDetailsVO);

	/**
	 * @param studentId
	 */
	public void deleteStudentDetailsById(Integer studentId);

	/**
	 * @param studentId
	 * @return {@link StudentDetailsDto}
	 */
	public StudentDetailsDto findStudentDetailsById(Integer studentId);

}
