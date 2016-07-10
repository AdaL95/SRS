<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询选课情况</title>
</head>
<body>
<h1>查询选课情况</h1>
      <div class="reta">
			<table class="table" border="1">
				
					<tr>
						
						<td>
							SSN
						</td>
						<td>
							Name
						</td>
					</tr>
	
		 <c:forEach var="selected" items="${requestScope.selected}">	          
		               <tr>
		               <td>${selected.ssn}</td>
		               <td>${selected.name}</td>
		              
		               </tr>
		</c:forEach>  
				</table>
				</div>
</body>
</html>