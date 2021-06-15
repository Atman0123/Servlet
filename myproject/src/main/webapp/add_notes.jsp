<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Notes</title>
  <%@ include file="allcss-js.jsp" %>
</head>
<body>
<div class="container">
 <%@ include file="navbar.jsp" %>
 <h1>Please Fill the note</h1>
 </div>
	
	
	<div class="container">
	<form action="saveServlet" method="post">
  <div class="mb-3" >
    <label for="title"  class="form-label">Title</label>
    <input type="text" name="title" class="form-control"required id="title" aria-describedby="emailHelp" placeholder="Enter Here">
    
  </div>
  <div class="mb-3">
    <label for="content" class="form-label">Note Content</label>
  	<textarea id="content" name="content" required placeholder="Enter Your Content Here" 
  	style="height:300px;"
  	class="form-control"></textarea>
  </div> 
  	<div class="container text-center">
  <button type="submit" class="btn btn-primary">Add Note</button>
  </div>
</form>
</div>
</body>
</html>