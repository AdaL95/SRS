<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询教师</title>
</head>
<body>
      <form action="../searchProfessor" method="get">
      <div class="container">
            <div class="row">
		        
			         <h2 class="text-center">
				                                           查询教师
			          </h2>
		
	   </div>
	   
	   <div class="row-fuid">
				<lable>Input name:</lable>
				<input id="name" type="text" name="name"><br/>
				<input type="submit"  id="search" value="查询"><br/>
	   </div>
	   </div>
	  </form>
</body>
</html>