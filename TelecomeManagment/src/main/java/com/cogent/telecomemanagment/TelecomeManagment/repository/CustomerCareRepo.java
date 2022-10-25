package com.cogent.telecomemanagment.TelecomeManagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.telecomemanagment.TelecomeManagment.entity.CustomerCare;

@Repository
public interface CustomerCareRepo extends JpaRepository<CustomerCare, Long> {

}
