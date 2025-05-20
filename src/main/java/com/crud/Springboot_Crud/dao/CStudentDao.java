package com.crud.Springboot_Crud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.Springboot_Crud.entity.CStudent;



@Repository
public class CStudentDao {
	
	@Autowired
	SessionFactory factory;
	
	public String insertData(CStudent s) {
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		session.persist(s);
		tr.commit();
		session.close();
		return "Data Insert Sucssefully...";
	}
	
	public String deleteData(int stud_id) {
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		CStudent s1=session.get(CStudent.class, stud_id);
		session.remove(s1);
		tr.commit();
		session.close();
		return "Data Deleted sucssefully...";
	}
	
	public String updatedata(CStudent s,int stud_id) {
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		CStudent s1=session.get(CStudent.class, stud_id);
		s1.setStud_name(s.getStud_name());
		s1.setStud_city(s.getStud_city());
		
		session.merge(s1);
		
		tr.commit();
		session.close();
		return "Data is Updated";
	}
	
	public CStudent getsingledata(int stud_id) {
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		String hqlQuery="From CStudent where stud_id=:myid";
		Query<CStudent> query=session.createQuery(hqlQuery, CStudent.class);
		query.setParameter("myid" , stud_id);
		CStudent s1=query.uniqueResult();
		tr.commit();
		session.close();
		return s1;
	}
	
	public List<CStudent> getAllData() {
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		String hqlQuery="From CStudent";
		Query<CStudent> query=session.createQuery(hqlQuery, CStudent.class);
		List<CStudent> list=query.list();
		tr.commit();
		session.close();
		return list;
	}
}
