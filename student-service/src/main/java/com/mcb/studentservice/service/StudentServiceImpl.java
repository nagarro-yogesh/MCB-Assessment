package com.mcb.studentservice.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcb.studentservice.constants.Constant;
import com.mcb.studentservice.dto.MarksDetailsDto;
import com.mcb.studentservice.dto.StudentDetailsDto;
import com.mcb.studentservice.entity.Students;
import com.mcb.studentservice.repository.MarksRepository;
import com.mcb.studentservice.repository.StudentsRepository;
import com.mcb.studentservice.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentsRepository	studentsRepository	= null;

	@Autowired
	private MarksRepository		markMasterRepository	= null;

	@Override
	public void addStudentDetails(StudentDetailsDto studentDetailsVO) {
		Students studentMaster = convertStudentDetailsVOToEntity(studentDetailsVO, false);
		studentsRepository.save(studentMaster);
	}

	@Override
	public void updateStudentDetails(StudentDetailsDto studentDetailsVO) {
		Students studentMaster = convertStudentDetailsVOToEntity(studentDetailsVO, true);
		if (studentMaster != null) {
			studentsRepository.save(studentMaster);
		}
	}

	@Override
	public void deleteStudentDetailsById(Integer studentId) {
		studentsRepository.deleteStudentDetails(studentId, Constant.IS_DELETED);
	}

	@Override
	public StudentDetailsDto findStudentDetailsById(Integer studentId) {
		StudentDetailsDto	studentDetailsVO	= studentsRepository.findStudentDetailsById(studentId);
		List<MarksDetailsDto>	markDetailsVOList	= markMasterRepository.findMarkDetailsByStudentId(studentId);
		studentDetailsVO.setSubjectDetailsVOList(markDetailsVOList);
		return studentDetailsVO;
	}

	private Students convertStudentDetailsVOToEntity(StudentDetailsDto studentDetailsVO, Boolean isUpdate) {
		Optional<Students>	studentMasterOp	= studentsRepository.findById(studentDetailsVO.getStudentId());
		Students			studentMaster	= new Students();
		if (studentMasterOp.isPresent() == true) {
			studentMaster = studentMasterOp.get();
		} else if (Boolean.TRUE.equals(isUpdate)) {
			return null;
		}
		studentMaster.setFirstName(studentDetailsVO.getStudentFirstName());
		studentMaster.setLastName(studentDetailsVO.getStudentLastName());
		studentMaster.setGroupId(studentDetailsVO.getGroupId());
		studentMaster.setUpdatedBy("admin@mcb.com");
		studentMaster.setUpdatedDate(new Date());
		studentMaster.setIsDeleted(Constant.IS_NOT_DELETED);
		return studentMaster;
	}

}
