<%@page import="myproject.note"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Page</title>
 <%@ include file="allcss-js.jsp" %>
</head>
<body>

<div class="container">

 <%@ include file="navbar.jsp" %>
 <h1>This is edit Page</h1>
 	
 	<%
 		note n=(note)request.getAttribute("not");
 		
 	%>
    <div class="container">
	<form action="updateServlet" method="post">
	<input value="<%= n.getId() %>" name="id" type="hidden">
  <div class="mb-3" >
    <label for="title"  class="form-label">Title</label>
    <input type="text" name="title" value="<%= n.getName()%>" class="form-control"required id="title" aria-describedby="emailHelp" placeholder="Enter Here">
    
  </div>
  <div class="mb-3">
    <label for="content" class="form-label">Note Content</label>
  	<textarea id="content" name="content"  required placeholder="Enter Your Content Here" 
  	style="height:300px;"
  	class="form-control"><%=n.getContent()%></textarea>
  </div> 
  	<div class="container text-center">
  <button type="submit" class="btn btn-success">Update</button>
  </div>
</form>
</div>
 	</div>
</body>
</html>