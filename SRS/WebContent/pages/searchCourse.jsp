<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>搜索课程</title>
</head>
<body>
      <form action="../searchCourse" method="get">
      <div class="container">
            <div class="row">
		        
			         <h2 class="text-center">
				                                            搜索课程
			          </h2>
		
	   </div>
	   
	   <div class="row-fuid">
	    
	        <div class="col-md-6">
				<lable>courseNo</lable>
				<input id="courseNo" type="text" name="courseNo"><br/>
				<input type="submit"  id="search" value="查询"><br/>
				<lable><a href="addCourse.jsp">Add course</a></lable>
				<lable><a href="deleteCourse.jsp">Delete course</a></lable>
		     </div>
		     </div>
		     </div>
		     </form>
		         
</body>
</html>