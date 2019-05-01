<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <h1>${menssage}</h1> -->
	<br></br>
	<h2>Formulario</h2>
	<form action="${pageContext.request.contextPath}/formData" method="post">
		<label>Nombre: </label><input type="text" name="name"><br>
		<label>Apellido: </label><input type="text" name="lname"><br>
		<label>Fecha de nacimiento: </label><input type="date" name="bdate"><br>
		<label>Carrare: </label><input type="text" name="career"><br>
		<label>Experiencia: </label><input type="text" name="experience"><br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>