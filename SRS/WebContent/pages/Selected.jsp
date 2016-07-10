<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选课情况</title>
</head>
<body>
      <form action="../selected" method="get">
      <div class="container">
            <div class="row">
		        
			         <h2 class="text-center">
				                                           选课情况查询
			          </h2>
		
	   </div>
	   
	   <div class="row-fuid">
				<lable>Input courseName:</lable>
				<input id="courseName" type="text" name="courseName"><br/>
				<input type="submit"  id="search" value="查询"><br/>
	   </div>
	   </div>
	  </form>
</body>
</html>