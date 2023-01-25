package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee1;

public interface Employee1Dao {
	
	public void save(Employee1 e);
	
	public List<Employee1> fetchAll();

}
