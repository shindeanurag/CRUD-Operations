package com.crud.Springboot_Crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Springboot_Crud.entity.CStudent;
import com.crud.Springboot_Crud.service.CStudentService;

@RestController
public class CStudentController {

	@Autowired
	CStudentService service;
	
	@PostMapping("/savedata")
	public String insertData(@RequestBody CStudent s) {
		String msg=service.insertData(s);
		return msg;
	}
	
	@DeleteMapping("/deletedata/{stud_id}")
	public String deleteData(@PathVariable int stud_id) {
		String msg=service.deleteData(stud_id);
		return msg;
	}
	
	@PutMapping("/updatedata/{stud_id}")
	public String updateData(@RequestBody CStudent s,@PathVariable int stud_id) {
		String msg=service.updateData(s, stud_id);
		return msg;
	}
	
	@GetMapping("/getsingledata")
	public CStudent getsingledata(@RequestParam int stud_id) {
		CStudent s1=service.getsingledata(stud_id);
		return s1;
	}
	
	@GetMapping("/getalldata")
	public List<CStudent> getAllData() {
		List <CStudent> list=service.getAllData();
		return list;
	}
}
