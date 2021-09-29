package com.mcb.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mcb.studentservice.dto.TeacherDetailsDto;
import com.mcb.studentservice.service.TeacherService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "/teacher")
@RequestMapping(value = "/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService = null;

	@ApiOperation(value = "Get teacher details by id", response = TeacherDetailsDto.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = TeacherDetailsDto.class),
			@ApiResponse(code = 404, message = "Teacher Id Not Found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@PostMapping(value = "/teacher-details")
	public TeacherDetailsDto findTeacherDetailsById(@RequestParam Integer teacherId) {
		return teacherService.findTeacherDetailsById(teacherId);
	}
}
