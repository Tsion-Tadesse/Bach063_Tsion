package com.cogent.telecomemanagment.TelecomeManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.telecomemanagment.TelecomeManagment.entity.Plans;


@Repository
public interface PlansRepository extends JpaRepository<Plans, Long> {

}
