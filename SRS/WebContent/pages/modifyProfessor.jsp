<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改教师</title>
</head>
<body>
      <form action="../modifyProfessor" method="get">
      <div class="container">
            <div class="row">
		        
			         <h2 class="text-center">
				                                            修改教师
			          </h2>
		
	   </div>
	   
	   <div class="row-fuid">
	    
	        <div class="col-md-6">
				<lable>Input ssn：</lable>
				<input id="ssn" type="text" name="ssn"><br/>
				<lable>Modified name：</lable>
				<input id="name" type="text" name="name"><br/>
				<lable>Modified title：</lable>
				<input id="title" type="text" name="title"><br/>
				<p>
				<input type="submit" value="提交" /><br/><br/>
				</p>
				<lable><a href="searchProfessor.jsp">Search Professor</a></lable>
				<lable><a href="addProfessor.jsp">Add Professor</a></lable>
				<lable><a href="deleteProfessor.jsp">Delete Professor</a></lable>
		     </div>
		     </div>
		     </div>
		     </form>
		     
		         
</body>
</html>