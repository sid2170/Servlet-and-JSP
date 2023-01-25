<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import ="java.util.*, com.demo.model.Employee1" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
						<% 
							List<Employee1> elist= (ArrayList<Employee1>) request.getAttribute("result");

						%>
								
								<table border="1" bgcolor="yellow">
				<tr>
				
					<th>Emp id</th>
					<th>Name</th>
					<th>Salary</th>
					<th>Department</th>
					
	
				</tr>
				
				<%
				for(int i=0;i<elist.size();i++){
					Employee1 e= elist.get(i);
				
				
				%>
				
				<tr>
						
						<td>&nbsp;<%=e.getId() %></td>&nbsp;
						<td>&nbsp;<%=e.getName() %></td>&nbsp;
						<td>&nbsp;<%=e.getSalary() %></td>&nbsp;
						<td>&nbsp;<%=e.getDept() %></td>&nbsp;
						
				</tr>
				
				<%
					}
				%>
				
								
				



</body>
</html>