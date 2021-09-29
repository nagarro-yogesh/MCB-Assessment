package com.mcb.studentservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcb.studentservice.dto.MarksDetailsDto;
import com.mcb.studentservice.dto.SubjectDetailsDto;
import com.mcb.studentservice.repository.MarksRepository;
import com.mcb.studentservice.repository.SubjectsRepository;

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectsRepository	subjectMasterRepository	= null;

	@Autowired
	private MarksRepository		markMasterRepository	= null;

	@Override
	public SubjectDetailsDto findSubjectDetailsById(Integer subjectId) {
		SubjectDetailsDto	subjectDetailsVO	= subjectMasterRepository.findSubjectDetailsById(subjectId);
		List<MarksDetailsDto>	markDetailsVOList	= markMasterRepository.findMarkDetailsBySubjectId(subjectId);
		subjectDetailsVO.setMarkDetailsVOList(markDetailsVOList);
		return subjectDetailsVO;
	}

}
