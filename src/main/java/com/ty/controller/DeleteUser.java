package com.ty.controller;

import java.io.IOException;

import com.ty.dao.UserDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteUser extends HttpServlet {

	
	UserDao  dao=new UserDao();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String parameter = req.getParameter("id");
		int id = Integer.parseInt(parameter);
		
		boolean deleteById = dao.deleteById(id);
		if(deleteById)
		{
			RequestDispatcher rd = req.getRequestDispatcher("delete.jsp");
			rd.forward(req, resp);
		}
		
		
		
	}
	
}
