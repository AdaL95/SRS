<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete Course</title>
</head>
<body>
      <form action="../deleteCourse" method="get">
      <div class="container">
            <div class="row">
		        
			         <h2 class="text-center">
				                                            删除课程
			          </h2>
		
	   </div>
	   
	   <div class="row-fuid">
	    
	        <div class="col-md-6">
				<lable>Input courseNo：</lable>
				<input id="courseNo" type="text" name=""courseNo"><br/>
				<p>
				<input type="submit" value="提交" /><br/><br/>
				</p>
				<lable><a href="addCourse.jsp">Add course</a></lable>
				<lable><a href="searchCourse.jsp">Search course</a></lable>
				<lable><a href="modifyCourse.jsp">Update course</a></lable>
		     </div>
		     </div>
		     </div>
		     </form>
		     
		         
</body>
</html>