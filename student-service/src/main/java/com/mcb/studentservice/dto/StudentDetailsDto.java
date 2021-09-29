package com.mcb.studentservice.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class StudentDetailsDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer studentId = null;
	private String studentFirstName = null;
	private String studentLastName = null;
	private Integer groupId = null;
	private List<MarksDetailsDto> markDetailsVOList = null;

	public StudentDetailsDto() {
		super();
	}

	public StudentDetailsDto(Integer studentId, String studentFirstName, String studentLastName) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public List<MarksDetailsDto> getSubjectDetailsVOList() {
		return markDetailsVOList;
	}

	public void setSubjectDetailsVOList(List<MarksDetailsDto> markDetailsVOList) {
		this.markDetailsVOList = markDetailsVOList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupId, markDetailsVOList, studentFirstName, studentId, studentLastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		StudentDetailsDto other = (StudentDetailsDto) obj;
		return Objects.equals(groupId, other.groupId) && Objects.equals(markDetailsVOList, other.markDetailsVOList)
				&& Objects.equals(studentFirstName, other.studentFirstName)
				&& Objects.equals(studentId, other.studentId) && Objects.equals(studentLastName, other.studentLastName);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentDetailsVO [studentId=").append(studentId).append(", studentFirstName=")
				.append(studentFirstName).append(", studentLastName=").append(studentLastName)
				.append(", groupDetailsVO=").append(groupId).append(", markDetailsVOList=").append(markDetailsVOList)
				.append("]");
		return builder.toString();
	}

}
