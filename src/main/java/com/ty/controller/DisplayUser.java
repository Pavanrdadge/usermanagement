package com.ty.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import com.ty.dao.UserDao;
import com.ty.entity.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class DisplayUser extends HttpServlet {

	UserDao dao = new UserDao();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		List<User> fetchUserData = dao.fetchUserData();
		out.print("<html><head><style>");
		out.print("body {font-family: Arial, sans-serif;}");
		out.print("h2 {color: #333;}");
		out.print("table {width: 100%; border-collapse: collapse;}");
		out.print("th, td {border: 1px solid #ddd; padding: 10px; text-align: left;}");
		out.print("th {background-color: #f2f2f2;}");
		out.print("tr:nth-child(even) {background-color: #f9f9f9;}");
		out.print("</style></head><body>");
		out.print("<h2>User Data</h2>");
		out.print("<table border='5' padding='10px'>");
		out.print("<tr><th>ID</th><th>Name</th><th>Age</th><th>Email</th><th>Password</th> <th>MobileNumber</th> <th>Edit Data</th><th>Delete</th> </tr>");

		for (User user : fetchUserData) {

			int id = user.getId();
			String name = user.getName();
			int age = user.getAge();
			String email = user.getEmail();
			String password = user.getPassword();
			long mobileNumber = user.getMobileNumber();

			out.print("<tr>");
			out.print("<td>" + id + "</td>");
			out.print("<td>" + name + "</td>");
			out.print("<td>" + age + "</td>");
			out.print("<td>" + email + "</td>");
			out.print("<td>" + password + "</td>");
			out.print("<td>" + mobileNumber + "</td>");
			out.print("<td><a href='edit.jsp'>Edit</a></td>");
			out.print("<td><a href='delete.jsp'>Delete</a></td>");

			out.print("</tr>");

		}
		out.print("</table>");
		out.print("</body></html>");

	}
}
