package com.mcb.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcb.studentservice.entity.StudentTeacherAssociation;

@Repository
public interface StudentTeacherAssociationRepository extends JpaRepository<StudentTeacherAssociation, String> {

}
