package com.mcb.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcb.studentservice.entity.Groups;

@Repository
public interface GroupsRepository extends JpaRepository<Groups, Integer> {

}
