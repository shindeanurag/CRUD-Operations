package com.crud.Springboot_Crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Springboot_Crud.dao.CStudentDao;
import com.crud.Springboot_Crud.entity.CStudent;

@Service
public class CStudentService {

	@Autowired
	CStudentDao dao;
	
	public String insertData(CStudent s) {
		String msg=dao.insertData(s);
		return msg;
	}
	
	public String deleteData(int stud_id) {
		String msg=dao.deleteData(stud_id);
		return msg;
	}
	
	public String updateData(CStudent s,int stud_id) {
		String msg=dao.updatedata(s, stud_id);
		return msg;
	}
	
	public CStudent getsingledata(int stud_id) {
		CStudent s1=dao.getsingledata(stud_id);
		return s1;
	}
	
	public List<CStudent> getAllData() {
		List<CStudent> list=dao.getAllData();
		return list;
	}
}
