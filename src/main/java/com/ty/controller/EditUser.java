package com.ty.controller;

import java.io.IOException;

import com.ty.dao.UserDao;
import com.ty.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/editUser")
public class EditUser  extends HttpServlet {
	
	UserDao dao=new UserDao();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		int parseId = Integer.parseInt(id);

		String name1 = req.getParameter("name");
		String age = req.getParameter("age");
		int parseAge = Integer.parseInt(age);

		String email = req.getParameter("email");

		String password = req.getParameter("password");

		String number = req.getParameter("number");
		int parseMobileNumber = Integer.parseInt(number);
		
		User user=new User(parseId, name1, parseAge, email, password, parseMobileNumber);
		
		boolean updateUserById = dao.updateUserById(user);
		
		if(updateUserById)
		{
			resp.sendRedirect("welcome.jsp");
		}
		
		
		
	}

}
