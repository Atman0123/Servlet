<%@page import="myproject.note"%>
<%@page import="java.util.List"%>
<%@page import="com.helper.Factoryprovider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>All Notes</title>
 <%@ include file="allcss-js.jsp" %>
</head>
<body>
<div class="container">
 <%@ include file="navbar.jsp" %>
 
 <%  
 	List<note> list = Factoryprovider.getAllNotes();
 %>
 
 </div>
		<br>
		<div class="container">
		<h1 class="text-uppercase">All Notes</h1>
		</div>
		
		<div class="row">
		<div class="col-12">
		<% for(note n:list)
		{
		//	out.println(n.getId()+" "+n.getName());
		%>
		 <div class="container">
		<div class="card mt-3" >
   
  
     <div class="card-body px-5" >
      <img class="card-img-top m-4" style="max-width:100px;" src="image/note.png" alt="Card image cap">
    <h5 class="card-title"><%=n.getName() %></h5>
    <p class="card-text">
    <%=n.getContent() %>
    </p>
    <p class="text-primary"><b><%=n.getAdddate() %></b><br></p>
    <div class="container text-center mt-2">
    <a href="deleteServlet?note_id=<%=n.getId() %>" class="btn btn-primary">Delete</a>
    <form action="editServlet" method="post" >
	<input type="hidden" name="id" value="<%=n.getId()%>"><input class="btn btn-primary" type="submit" name="action" value="Edit">
	</form>
  </div>
  <%--  <a href="edit.jsp?note_id=<%=n.getId() %>" class="btn btn-primary">Edit</a> --%>
  </div>
 
</div>
 </div>
		<% 
		     	}
			
			%>
		
		</div>
		</div>
		
		
		
</body>
</html>