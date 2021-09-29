package com.mcb.studentservice.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class GroupDetailsDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer groupId = null;
	private String groupName = null;
	private String createdBy = null;
	private Date createdDate = null;
	private String updatedBy = null;
	private Date updatedDate = null;

	public GroupDetailsDto() {
		super();
	}

	public GroupDetailsDto(Integer groupId, String groupName, String createdBy, Date createdDate, String updatedBy,
			Date updatedDate) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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

	@Override
	public int hashCode() {
		return Objects.hash(createdBy, groupId, groupName, updatedBy);
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
		GroupDetailsDto other = (GroupDetailsDto) obj;
		return Objects.equals(createdBy, other.createdBy) && Objects.equals(groupId, other.groupId)
				&& Objects.equals(groupName, other.groupName) && Objects.equals(updatedBy, other.updatedBy);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GroupDetailsVO [groupId=").append(groupId).append(", groupName=").append(groupName)
				.append(", createdBy=").append(createdBy).append(", createdDate=").append(createdDate)
				.append(", updatedBy=").append(updatedBy).append(", updatedDate=").append(updatedDate).append("]");
		return builder.toString();
	}
}
