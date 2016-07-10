<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加教师</title>
</head>
<body>
      <form action="../addCourse" method="get">
      <div class="container">
            <div class="row">
		        
			         <h2 class="text-center">
				                                            添加教师
			          </h2>
		
	   </div>
	   
	   <div class="row-fuid">
	    
	        <div class="col-md-6">
	        <p>
				<lable>ssn</lable>
				<input id="ssn" type="text" name="ssn"><br/>
				</p>
				<p>
				<lable>name</lable>
				<input id="name" type="text" name="name"><br/>
				</p>
				<p>
				<lable>title</lable>
				<input id="title" type="text" name="title"><br/>
				</p>
				<p>
				<lable>department</lable>
				<input id="department" type="text" name="department"><br/>
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