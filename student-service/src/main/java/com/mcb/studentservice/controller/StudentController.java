package com.mcb.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mcb.studentservice.dto.StudentDetailsDto;
import com.mcb.studentservice.service.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "/student")
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StudentService studentService = null;

	@ApiOperation(value = "Add new student details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@PostMapping(value = "/student-details")
	public void addStudentDetails(@RequestBody StudentDetailsDto studentDetailsVO) {
		studentService.addStudentDetails(studentDetailsVO);
	}

	@ApiOperation(value = "Update student details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@PutMapping(value = "/student-details")
	public void updateStudentDetails(@RequestBody StudentDetailsDto studentDetailsVO) {
		studentService.updateStudentDetails(studentDetailsVO);
	}

	@ApiOperation(value = "Delete student details by id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@DeleteMapping(value = "/student-details")
	public void deleteStudentDetailsById(@RequestParam Integer studentId) {
		studentService.deleteStudentDetailsById(studentId);
	}

	@ApiOperation(value = "Get student details by id", response = StudentDetailsDto.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = StudentDetailsDto.class),
			@ApiResponse(code = 404, message = "Student Id Not Found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@PostMapping(value = "/load-student-details")
	public StudentDetailsDto findStudentDetailsById(@RequestParam Integer studentId) {
		return studentService.findStudentDetailsById(studentId);
	}

}
