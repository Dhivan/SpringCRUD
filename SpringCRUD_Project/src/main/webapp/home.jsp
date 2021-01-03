<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>KLR Interview Projects</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</head>
<body>
<br>
<center><h2>KLR Interview Task</h2></center>
<br><br>
<!--Navbar -->
  <nav class="navbar navbar-expand-sm bg-primary" style="margin-top:-34px;color:black;font-weight:italic;">
  
  
  
  <div class="collapse navbar-collapse" id="navbarSupportedContent-333">
    
    <ul class="navbar-nav">

      <li class="nav-item">
        <a class="nav-link" style="color:white" href="insertEmploye.jsp">Insert Employee</a>
      </li>&nbsp;&nbsp;&nbsp;
      <li class="nav-item">
        <a class="nav-link" style="color:white" href="updateEmploye.jsp">Update Employee</a>
      </li>&nbsp;&nbsp;&nbsp;
      <!-- <li class="nav-item">
        <a class="nav-link" style="color:white" href="#">Edit</a>
      </li>&nbsp;&nbsp;&nbsp; -->
      <li class="nav-item">
        <a class="nav-link" style="color:white" href="login.jsp">Logout</a>
      </li>&nbsp;&nbsp;&nbsp;
      
    </ul>
    <ul class="navbar-nav ml-auto nav-flex-icons">
    	<li class="nav-item">
    		<a class="nav-link" style="color:black"><b>Developer: Dhivan</b></a>
    	</li>
    </ul>

  </div>
</nav>

<div class="container">
	  <br><br>
	  <h2>Home</h2>
	  <p>Employee Deatils</p>            
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Firstname</th>
	        <th>Email</th>
	        <th>Phone</th>
	        <th>Gender</th>
	        <!-- <th>Password</th> -->
	      </tr>
	    </thead>
	    <tbody>
	    
	    <%@ page import="java.sql.Connection"%>
		<%@ page import="java.sql.ResultSet"%>
		<%@ page import="java.sql.SQLException"%>
		<%@ page import="java.sql.Statement"%>
		<%@ page import="com.kls.in.configuration.DataBaseProp" %>
		
	    <%
	    
	    try {
			Connection conn = null;
			String selectStmt = "SELECT id, firstName, email, phone, gender FROM userdetails where role!='admin'";
			
			conn = DataBaseProp.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(selectStmt);
			while (rs.next()) {
					String id = rs.getString("id");
					String fname = rs.getString("firstName");
					String email = rs.getString("email");
					String phone = rs.getString("phone");
					String gender = rs.getString("gender");
					/* String table2Id = rs.getString("table2Id");
					String forKeyId = rs.getString("forKeyId");
					String password = rs.getString("password"); */
					%>
					  <tr>
				        <td><%=fname%></td>
				        <td><%=email%></td>
				        <td><%=phone%></td>
				        <td><%=gender%></td>
				        <%-- <td><%=password%></td> --%>
				      </tr>		
					<%
			}
			
	    }
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    %>
	    
	    
	      
	    </tbody>
	  </table>
	</div>
</body>
</html>