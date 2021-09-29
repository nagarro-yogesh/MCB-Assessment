package com.mcb.studentservice.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class SubjectDetailsDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer subjectId = null;
	private String subjectTitle = null;
	private String createdBy = null;
	private Date createdDate = null;
	private String updatedBy = null;
	private Date updatedDate = null;
	private Integer isDeleted = null;
	private List<MarksDetailsDto> markDetailsVOList = null;

	public SubjectDetailsDto() {
		super();
	}

	public SubjectDetailsDto(Integer subjectId, String subjectTitle, String createdBy, Date createdDate,
			String updatedBy, Date updatedDate, Integer isDeleted) {
		super();
		this.subjectId = subjectId;
		this.subjectTitle = subjectTitle;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.isDeleted = isDeleted;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectTitle() {
		return subjectTitle;
	}

	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public List<MarksDetailsDto> getMarkDetailsVOList() {
		return markDetailsVOList;
	}

	public void setMarkDetailsVOList(List<MarksDetailsDto> markDetailsVOList) {
		this.markDetailsVOList = markDetailsVOList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdBy, isDeleted, markDetailsVOList, subjectId, subjectTitle, updatedBy);
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
		SubjectDetailsDto other = (SubjectDetailsDto) obj;
		return Objects.equals(createdBy, other.createdBy) && Objects.equals(isDeleted, other.isDeleted)
				&& Objects.equals(markDetailsVOList, other.markDetailsVOList)
				&& Objects.equals(subjectId, other.subjectId) && Objects.equals(subjectTitle, other.subjectTitle)
				&& Objects.equals(updatedBy, other.updatedBy);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SubjectDetailsVO [subjectId=").append(subjectId).append(", subjectTitle=").append(subjectTitle)
				.append(", createdBy=").append(createdBy).append(", createdDate=").append(createdDate)
				.append(", updatedBy=").append(updatedBy).append(", updatedDate=").append(updatedDate)
				.append(", isDeleted=").append(isDeleted).append(", markDetailsVOList=").append(markDetailsVOList)
				.append("]");
		return builder.toString();
	}

}
