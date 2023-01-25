package com.demo.service;

import java.util.List;

import com.demo.model.Employee1;

public interface Employee1Service {
	
	public void save(Employee1 e);
	
	public List<Employee1> fetchAll();

}
