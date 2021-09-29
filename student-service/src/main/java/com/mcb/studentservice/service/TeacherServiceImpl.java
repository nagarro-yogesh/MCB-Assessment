package com.mcb.studentservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcb.studentservice.dto.StudentDetailsDto;
import com.mcb.studentservice.dto.TeacherDetailsDto;
import com.mcb.studentservice.repository.StudentsRepository;
import com.mcb.studentservice.repository.TeacherRepository;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository	teacherRepository	= null;

	@Autowired
	private StudentsRepository	studentsRepository	= null;

	@Override
	public TeacherDetailsDto findTeacherDetailsById(Integer teacherId) {
		TeacherDetailsDto	teacherDetailsVO	= teacherRepository.findTeacherDetailsById(teacherId);
		Integer				groupId				= teacherDetailsVO.getGroupId();
		if (teacherDetailsVO != null && groupId != null) {
			List<StudentDetailsDto> studentDetailsVOList = studentsRepository.findStudentDetailsByGroupId(groupId);
			teacherDetailsVO.setStudentDetailsVOList(studentDetailsVOList);
		}
		return teacherDetailsVO;
	}

}
