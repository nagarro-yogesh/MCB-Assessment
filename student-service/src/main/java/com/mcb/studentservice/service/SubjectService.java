package com.mcb.studentservice.service;

import com.mcb.studentservice.dto.SubjectDetailsDto;

public interface SubjectService {

	/**
	 * @param subjectId
	 * @return {@link SubjectDetailsDto}
	 */
	public SubjectDetailsDto findSubjectDetailsById(Integer subjectId);
}
