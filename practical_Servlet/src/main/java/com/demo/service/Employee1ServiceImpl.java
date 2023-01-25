package com.demo.service;

import java.util.List;

import com.demo.dao.Employee1Dao;
import com.demo.dao.Employee1DaoImpl;
import com.demo.model.Employee1;

public class Employee1ServiceImpl implements Employee1Service{

	
	Employee1Dao employee1 = new Employee1DaoImpl();
	
	@Override
	public void save(Employee1 e) {
		// TODO Auto-generated method stub
		System.out.println("EmployeeServiceImpl"+e);
		employee1.save(e);
		
	}

	@Override
	public List<Employee1> fetchAll() {
		// TODO Auto-generated method stub
		return employee1.fetchAll();
	}

}
