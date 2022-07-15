package com.atig.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MarriageApp extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest hreq,HttpServletResponse hres) throws ServletException,IOException{
		
		//Set content type of response object
		hres.setContentType("text/html");
		//get printwriterfrom hres 
		PrintWriter pw=hres.getWriter();
		//get parameters
		String name=hreq.getParameter("name");
		String gender=hreq.getParameter("gender");
		int age=Integer.parseInt(hreq.getParameter("Age"));
		//start designing web
		//pw.println("<head><style>img{height:45%; width:35%;}</style></head>");
		pw.println("<Body bgcolor='baby blue' style='text-align:center; color:'yellow';>");
		//Set logic
		String mess="";
		if( gender.toLowerCase()=="female") {
			if(age<21)
				mess="<h1> Sorry, "+name+" you are too young to marry<br>Please wait for the proper time </h1>";
			else if(age>60)
				mess="<h1> Sorry, "+name+" you are too old to marry<br>Please enjoy your Life </h1>";
			else
				mess="<h1> Woohoo "+name+" you are eligible to marry<br>Please Find your partner </h1>";
		}
		
		else {
			if(age<23)
				mess="<h1> Sorry, "+name+" you are too young to marry<br>Please wait for the proper time </h1>";
			else if(age>60)
				mess="<h1> Sorry, "+name+" you are too old to marry<br>Please enjoy your Life </h1>";
			else
				mess="<h1> Woohoo "+name+" you are eligible to marry<br>Please Find your partner </h1>";
		}		
		pw.println(mess);
		pw.println("<a href='http://localhost:1010/MarriageApp/page.html'><img src='agera.jpg'></a>");
		pw.println("</body>");
		pw.close();
	}

}
