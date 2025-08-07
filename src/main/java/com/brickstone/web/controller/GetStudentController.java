package com.brickstone.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.brickstone.web.dao.StudentDao;
import com.brickstone.web.model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/getstudent")
public class GetStudentController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		StudentDao dao = new StudentDao();
		HttpSession session = request.getSession();
		int id = Integer.parseInt(request.getParameter("sid"));
		Student student = dao.getStudent(id);

		session.setAttribute("student", student);
		response.sendRedirect("show.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
