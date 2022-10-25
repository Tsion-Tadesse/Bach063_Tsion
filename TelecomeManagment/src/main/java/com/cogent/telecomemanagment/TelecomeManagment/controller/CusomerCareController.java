package com.cogent.telecomemanagment.TelecomeManagment.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.telecomemanagment.TelecomeManagment.entity.CustomerCare;
import com.cogent.telecomemanagment.TelecomeManagment.repository.CustomerCareRepo;

@RequestMapping("/api/customercare")
@RestController
public class CusomerCareController {

	@Autowired
	CustomerCareRepo customerCareRepo;
	
	//add complaints
@PostMapping("/addcomplaints")
	CustomerCare addComplaints(@RequestBody CustomerCare customerCare) {
		return customerCareRepo.save(customerCare);
	}


//show all complaints
@GetMapping("/retrivecomplaints")
List<CustomerCare> getComplaints(){
	return customerCareRepo.findAll();
}

//show complains by id

//delete complaints
@DeleteMapping("/deletecomplaints/{complaint_id}")
public String deleteComplaints(@PathVariable ("complaint_id")long complaint_id){
	try {
		customerCareRepo.deleteById(complaint_id);
		 return "deleted";
	}catch(Exception e) {
		e.printStackTrace();
	}
	return "deleted";
	 
}
}