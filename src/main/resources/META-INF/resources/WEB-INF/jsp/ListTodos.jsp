 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html> 
	<head>
		<link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
		<title>Todos page</title>
	</head>
	<body>
		<div class="container">
			<div>you are in Todos page ${name}</div>
					<hr>
					<h1>Todos::</h1>
					<div>  ${todos} </div>
					<table class="table">
						<thead>
							<tr>
								<th>id</th>
								<th>Username</th>
								<th>Description</th>
								<th>Is done?</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${todos}" var="todo">
								<tr>
									<td>${todo.id}</td>
									<td>${todo.username}</td>
									<td>${todo.description}</td>
									<td>${todo.done}</td>
								</tr>
							</c:forEach>
						</tbody>
						
					</table>
					<a href="Add-todo" class="btn btn-success">New Todo</a>
		</div>
		
		
<!---<div>${password}</div> --->	
		<script src="webjars/bootstrap/5.3.0/js/bootstrap.min.js"></script>	
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>	
	</body>
</html>