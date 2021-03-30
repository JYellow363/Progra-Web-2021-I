package com.upc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.model.Persona;

@WebServlet("/ProcesarSevlet")
public class ProcesarSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("txtnombre");
		String edad = request.getParameter("txtedad");
		@SuppressWarnings("unused")
		int ed = 0;
		ed = Integer.parseInt(edad);
		Persona p = new Persona(nombre, edad);
		request.getSession().setAttribute("persona1", p);
		request.getRequestDispatcher("exito.jsp").forward(request, response);
	}

}
