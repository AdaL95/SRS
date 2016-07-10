<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加课程</title>
</head>
<body>
      <form action="../addCourse" method="get">
      <div class="container">
            <div class="row">
		        
			         <h2 class="text-center">
				                                            添加课程
			          </h2>
		
	   </div>
	   
	   <div class="row-fuid">
	    
	        <div class="col-md-6">
	        <p>
				<lable>courseNo</lable>
				<input id="courseNo" type="text" name="courseNo"><br/>
				</p>
				<p>
				<lable>courseName</lable>
				<input id="courseName" type="text" name="courseName"><br/>
				</p>
				<p>
				<lable>credits</lable>
				<input id="credits" type="text" name="credits"><br/>
				</p>
				<p>
				<input type="submit" value="提交" /><br/><br/>
				</p>
		     </div>
		     </div>
		     </div>
		     </form>
		         
</body>
</html>