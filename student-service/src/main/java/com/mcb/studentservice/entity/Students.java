package com.mcb.studentservice.entity;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id", unique = true, nullable = false)
	private Integer studentId = null;

	@Column(name = "first_name")
	private String firstName = null;

	@Column(name = "last_name")
	private String lastName = null;

	@Column(name = "group_id")
	private Integer groupId = null;

	@Column(name = "created_by")
	private String createdBy = null;

	@Column(name = "created_date")
	private Date createdDate = null;

	@Column(name = "updated_by")
	private String updatedBy = null;

	@Column(name = "updated_date")
	private Date updatedDate = null;

	@Column(name = "is_deleted")
	private Integer isDeleted = null;

	@OneToMany(mappedBy = "students", fetch = FetchType.LAZY)
	private Set<Marks> marks = null;

	@ManyToOne
	@JoinColumn(name = "group_id", nullable = false, insertable = false, updatable = false)
	private Groups groups = null;

	public Students() {
		super();
	}

	public Students(Integer studentId, String firstName, String lastName, Integer groupId, String createdBy,
			Date createdDate, String updatedBy, Date updatedDate, Integer isDeleted, Set<Marks> marks,
			Groups groups) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.groupId = groupId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.isDeleted = isDeleted;
		this.marks = marks;
		this.groups = groups;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
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

	public Set<Marks> getMarks() {
		return marks;
	}

	public void setMarks(Set<Marks> marks) {
		this.marks = marks;
	}

	public Groups getGroups() {
		return groups;
	}

	public void setGroups(Groups groups) {
		this.groups = groups;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdBy, firstName, groupId, groups, isDeleted, lastName, marks, studentId,
				updatedBy);
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
		Students other = (Students) obj;
		return Objects.equals(createdBy, other.createdBy) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(groupId, other.groupId) && Objects.equals(groups, other.groups)
				&& Objects.equals(isDeleted, other.isDeleted) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(marks, other.marks) && Objects.equals(studentId, other.studentId)
				&& Objects.equals(updatedBy, other.updatedBy);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentMaster [studentId=").append(studentId).append(", firstName=").append(firstName)
				.append(", lastName=").append(lastName).append(", groupId=").append(groupId).append(", createdBy=")
				.append(createdBy).append(", createdDate=").append(createdDate).append(", updatedBy=").append(updatedBy)
				.append(", updatedDate=").append(updatedDate).append(", isDeleted=").append(isDeleted)
				.append(", markMaster=").append(marks).append(", groupMaster=").append(groups).append("]");
		return builder.toString();
	}

}
