package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.demo.model.Employee1;

import com.demo.utility.DB_Connection;

public class Employee1DaoImpl implements Employee1Dao {

	@Override
	public void save(Employee1 e) {
		// TODO Auto-generated method stub
		Connection conn=DB_Connection.getConnection();
		
		
		try {
				PreparedStatement ps=conn.prepareStatement("insert into employee1 value(?,?,?,?)");  // ? is called th place holders
			
			//3. ISSUE THE QUERY
		
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setFloat(3, e.getSalary());
				ps.setString(4,e.getDept());
				int x=ps.executeUpdate();     // edit the database 
				if(x!=0) {
					System.out.println("data inserted successfully");
				}
				else {
					System.out.println("Issue with the query");
				}
				
		}catch(SQLException e4) {
			e4.printStackTrace();
		}
		
		
		
	}

	@Override
	public List<Employee1> fetchAll() {
		List<Employee1> l= new ArrayList<Employee1>();
		
		Connection conn=DB_Connection.getConnection();
		
		
		try {
				PreparedStatement ps=conn.prepareStatement("select * from employee1 ");  // ? is called th place holders
			
			//3. ISSUE THE QUERY
		
				
				ResultSet x=ps.executeQuery();      // used to fetch the data
				
				while(x.next()) {
					Employee1 e= new Employee1();
					e.setId(x.getInt(1));
					e.setName(x.getString(2));
					e.setSalary(x.getFloat(3));
					e.setDept(x.getString(4));
					
					l.add(e);
					
				}
				
				
		}catch(SQLException e4) {
			e4.printStackTrace();
		}			
		
		return l;
	}

}
