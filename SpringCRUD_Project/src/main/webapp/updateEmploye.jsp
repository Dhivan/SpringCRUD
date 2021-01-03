<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>KLR Interview Projects</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</head>
<body>
	<br>
	<center>
		<h2>KLR Interview Task</h2>
	</center>
	<br>
	<br>
	<!--Navbar -->
	<nav class="navbar navbar-expand-sm bg-primary"
		style="margin-top: -34px; color: black; font-weight: italic;">

		<div class="collapse navbar-collapse" id="navbarSupportedContent-333">

			<ul class="navbar-nav">

				<li class="nav-item"><a class="nav-link" style="color: white"
					href="insertEmploye.jsp">Insert Employee</a></li>&nbsp;&nbsp;&nbsp;
				<li class="nav-item"><a class="nav-link" style="color: white"
					href="updateEmploye.jsp">Update Employee</a></li>&nbsp;&nbsp;&nbsp;
				<!-- <li class="nav-item">
        <a class="nav-link" style="color:white" href="#">Edit</a>
      </li>&nbsp;&nbsp;&nbsp; -->
				<li class="nav-item"><a class="nav-link" style="color: white"
					href="login.jsp">Logout</a></li>&nbsp;&nbsp;&nbsp;

			</ul>
			<ul class="navbar-nav ml-auto nav-flex-icons">
				<li class="nav-item"><a class="nav-link" style="color: black"><b>Developer: Dhivan</b></a></li>
			</ul>

		</div>
	</nav>
	<form action="employeeUpdate" method="post">
		<div class="container">
			<br>
			<br>
			<center>
				<h2>Update Employee</h2>
				<p>
					Email is a Primary Data <br>If you have existing data, then
					based on email your all the data will be updated
				</p>

				<div class="input-group" style="width: 40%; margin-top: 7.5px;">
					<span>First Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<input id="fname" type="text" class="form-control" name="fname"
						placeholder="" style="text-align: center;" required>
				</div>
				<div class="input-group" style="width: 40%; margin-top: 7.5px;">
					<span>Email
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<input id="email" type="email" class="form-control" name="email"
						placeholder="" style="text-align: center;" required>
				</div>
				<div class="input-group" style="width: 40%; margin-top: 7.5px;">
					<span>Phone
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<input id="phone" type="text" class="form-control" name="phone"
						placeholder="" style="text-align: center;" required>
				</div>
				<div class="input-group" style="width: 40%; margin-top: 7.5px;">
					<span>Gender
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<select class="form-control" required="" id="gender" name="gender"
						style="width: 320px; text-align-last: center;">
						<option value="" disabled="disabled" selected>--- Select
							---</option>
						<option value="Male">Male</option>
						<option value="Female">Female</option>
						<option value="Others">Others</option>
					</select>

				</div>
				<br>
				<div>
					<button class="contact100-form-btn" style="width: 40%">
						<span class="actBtn"> Submit&nbsp; <i
							class="fa fa-long-arrow-right m-l-3" aria-hidden="true"></i></span>
					</button>
				</div>
			</center>
		</div>
	</form>
</body>
</html>