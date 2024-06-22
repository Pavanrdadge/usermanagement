package com.ty.controller;

import java.io.IOException;

import com.ty.dao.UserDao;
import com.ty.entity.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/add")
public class RegisterUser extends HttpServlet {

	UserDao dao=new UserDao();
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
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
		
		
		int save = dao.save(user);
		if(save>0) {
		RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
			rd.forward(req, res);
		}
		

	}

}
