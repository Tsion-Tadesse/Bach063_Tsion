package com.cogent.telecomemanagment.TelecomeManagment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import com.cogent.telecomemanagment.TelecomeManagment.entity.Plans;
import com.cogent.telecomemanagment.TelecomeManagment.repository.PlansRepository;

@RequestMapping("/api/plans")
@RestController
public class PlansController {

	@Autowired
	PlansRepository plansRepository;
	
	@PostMapping("/addplans")
	Plans addPlans(@RequestBody Plans plans) {
		return plansRepository.save(plans);
	}
	
	@GetMapping("/getplans")
	List<Plans> getPlans(){
		return plansRepository.
				findAll();
	}
	@DeleteMapping("/deleteplans/{plan_id}")
	public String deletePlan(@PathVariable long plan_id ) {
		try {
			plansRepository.deleteById(plan_id);
			return "Plan is successfully deleted";
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return "Plan is successfully deleted";
	}
} 
