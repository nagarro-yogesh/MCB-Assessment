package com.mcb.studentservice.dto;

import java.io.Serializable;
import java.util.Date;

public class MarksDetailsDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer markId = null;
	private Integer studentId = null;
	private Integer subjectId = null;
	private Date examDate = null;
	private Integer mark = null;

	public MarksDetailsDto() {
		super();
	}

	public MarksDetailsDto(Integer markId, Integer studentId, Integer subjectId, Date examDate, Integer mark) {
		super();
		this.markId = markId;
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.examDate = examDate;
		this.mark = mark;
	}

	public Integer getMarkId() {
		return markId;
	}

	public void setMarkId(Integer markId) {
		this.markId = markId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MarkDetailsVO [markId=").append(markId).append(", studentId=").append(studentId)
				.append(", subjectId=").append(subjectId).append(", examDate=").append(examDate).append(", mark=")
				.append(mark).append("]");
		return builder.toString();
	}

}
