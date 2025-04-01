 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<html> 
	<head>
		<link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
		<title>Add Todos page</title>
	</head>
	<body>
		<div class="container">
			<div>you are in Todos page ${name}</div>
			<hr>
			<h1>Add or Enter Todos Deatails::</h1>
			<form:form method="post" modelAttribute="todo">
				Description: <form:input type="text" required="required" path="description"/>
				<form:input type="hidden" path="id"/>
				<form:input type="hidden" path="done"/>
				<input type="submit" class="btn btn-success"/>
			</form:form>
		</div>
		
<!---<div>${password}</div> --->	
		<script src="webjars/bootstrap/5.3.0/js/bootstrap.min.js"></script>	
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>	
	</body>
</html>

