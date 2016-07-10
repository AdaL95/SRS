<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询成绩</title>
</head>
<body>
<h1>查询成绩</h1>
      <div class="reta">
			<table class="table" border="1">
				
					<tr>
						
						<td>
							CourseName
						</td>
						<td>
							Grade
						</td>
					</tr>
	
		 <c:forEach var="searchGrade" items="${requestScope.trans}">	          
		               <tr>
		               <td>${searchGrade.courseName}</td>
		               <td>${searchGrade.grade}</td>
		              
		               </tr>
		</c:forEach>  
				</table>
				</div>
</body>
</html>