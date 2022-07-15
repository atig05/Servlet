package com.atig.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CoronaVaccineApp extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest hreq,HttpServletResponse hres) throws IOException,ServletException {
		hres.setContentType("text/html");
		PrintWriter pw=hres.getWriter();
		//getting value from hreq object
		String pname=hreq.getParameter("pname"); 
		int page=Integer.parseInt(hreq.getParameter("page"));
		pw.println("<head><style>img{height:45%; width:35%;}</style></head>");
		pw.println("<body bgcolor=\"forestgreen\"style=\" text-align:center; color:blue;\">");
		// logic
		if(page<18)
			pw.println("<h1> Hello,"+pname+" Please wait you're not Eligible now</h1>");
		else
			pw.println("<h1> Hello,"+pname+" Please take your vaccine from nearby healgth center<br> You're  Eligible now</h1>");
		pw.println("<a href='http://localhost:1010/CoronaVaccineApp/CovidForm.html'><img src='home.jpg'></a>");
		pw.println("</body>");
		//closing printwriter object or commit
		pw.close();
	}
}
