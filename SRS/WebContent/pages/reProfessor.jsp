<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询教师</title>
</head>
<h1>查询教师</h1>
      <div class="reta">
			<table class="table" border="1">
				
					<tr>
						
						<td>
							SSN
						</td>
						<td>
							Name
						</td>
						<td>
							Title
						</td>
						<td>
							Department
						</td>
					</tr>
	
		 <c:forEach var="searchProfessor" items="${requestScope.getprofessor}">	          
		               <tr>
		               <td>${searchProfessor.ssn}</td>
		               <td>${searchProfessor.name}</td>
		                <td>${searchProfessor.title}</td>
		                 <td>${searchProfessor.department}</td>
		              
		               </tr>
		</c:forEach>  
				</table>
				</div>
</body>
</html>