<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="ISO-8859-1">
  <title>Registro de Notas</title>
 </head>
<body>
	<h1>Promedio de notas del Curso de Programación Web</h1>
	<form action="resultado.jsp">
		<p>Nota 1: <input type="text" name="nota1"/> </p>
		<p>Nota 2: <input type="text" name="nota2"/> </p>
		<p>Nota 3: <input type="text" name="nota3"/> </p>
		<input type="submit" value="Consultar"/>
		<input type="reset" value="Limpiar"/>
	</form>
</body>
</html>