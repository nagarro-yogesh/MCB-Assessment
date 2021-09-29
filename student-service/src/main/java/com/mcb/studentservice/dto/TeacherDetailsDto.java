package com.mcb.studentservice.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class TeacherDetailsDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer teacherId = null;
	private String teacherFirstName = null;
	private String teacherLastName = null;
	private Integer groupId = null;
	private List<StudentDetailsDto> studentDetailsVOList = null;

	public TeacherDetailsDto() {
		super();
	}

	public TeacherDetailsDto(Integer teacherId, String teacherFirstName, String teacherLastName, Integer groupId) {
		super();
		this.teacherId = teacherId;
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
		this.groupId = groupId;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherFirstName() {
		return teacherFirstName;
	}

	public void setTeacherFirstName(String teacherFirstName) {
		this.teacherFirstName = teacherFirstName;
	}

	public String getTeacherLastName() {
		return teacherLastName;
	}

	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public List<StudentDetailsDto> getStudentDetailsVOList() {
		return studentDetailsVOList;
	}

	public void setStudentDetailsVOList(List<StudentDetailsDto> studentDetailsVOList) {
		this.studentDetailsVOList = studentDetailsVOList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupId, studentDetailsVOList, teacherFirstName, teacherId, teacherLastName);
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
		TeacherDetailsDto other = (TeacherDetailsDto) obj;
		return Objects.equals(groupId, other.groupId)
				&& Objects.equals(studentDetailsVOList, other.studentDetailsVOList)
				&& Objects.equals(teacherFirstName, other.teacherFirstName)
				&& Objects.equals(teacherId, other.teacherId) && Objects.equals(teacherLastName, other.teacherLastName);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TeacherDetailsVO [teacherId=").append(teacherId).append(", teacherFirstName=")
				.append(teacherFirstName).append(", teacherLastName=").append(teacherLastName).append(", groupId=")
				.append(groupId).append(", studentDetailsVOList=").append(studentDetailsVOList).append("]");
		return builder.toString();
	}

}
