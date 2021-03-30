<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado de la operación</title>
</head>
<body>
	<h1>El promedio del estudiante será: </h1>
	<%
		int n1 = Integer.parseInt(request.getParameter("nota1"));
		int n2 = Integer.parseInt(request.getParameter("nota2"));
		int n3 = Integer.parseInt(request.getParameter("nota3"));
		float promedio;
		promedio = (n1 + n2 + n3) / 3;
		out.println(promedio);
		if(promedio >= 12.5)
			out.println(" Aprobado");
		else out.println(" Desaprobado");
	%>
	<a href="index.jsp">Home</a>
</body>
</html>