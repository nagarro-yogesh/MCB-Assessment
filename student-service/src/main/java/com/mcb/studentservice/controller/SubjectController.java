package com.mcb.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mcb.studentservice.dto.SubjectDetailsDto;
import com.mcb.studentservice.service.SubjectService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "/subject")
@RequestMapping(value = "/subject")
public class SubjectController {

	@Autowired
	private SubjectService subjectService = null;

	@ApiOperation(value = "Get subject details by id", response = SubjectDetailsDto.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = SubjectDetailsDto.class),
			@ApiResponse(code = 404, message = "Subject Id Not Found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@PostMapping(value = "/subject-details")
	public SubjectDetailsDto findStudentDetailsById(@RequestParam Integer subjectId) {
		return subjectService.findSubjectDetailsById(subjectId);
	}
}
