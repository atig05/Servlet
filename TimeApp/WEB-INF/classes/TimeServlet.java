package com.atig.servlet;


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.time.*;
public class TimeServlet extends HttpServlet{
	public void service(HttpServletRequest hreq,HttpServletResponse hres) throws ServletException,IOException{
		hres.setContentType("text/html");
		
		PrintWriter pw=hres.getWriter();
		
		LocalDateTime ldt=LocalDateTime.now();
		 
		int hour=ldt.getHour();
		hres.setIntHeader("refresh",3600);
		pw.println("<body bgcolor='cyan'  style=text-align:'center';>");
		pw.println("<center>");
		
		if(hour<8 && hour>=7)
			pw.println("<h1>Wake up</h1>");
		
		else 	if(hour<9 && hour>=8)
			pw.println("<h1>Eat Breakfast</h1>");
		
		else 	if(hour<15 && hour>=13)
			pw.println("<h1>Eat Lunch</h1>");
		
		else 	if(hour<17 && hour>=15)
			pw.println("<h1>Take powernap</h1>");	
		
		
		else 	if(hour<23 && hour>=22)
			pw.println("<h1>Eat Dinner</h1>");	
		
		else 	if(hour>23)
			pw.println("<h1>Go to Sleep</h1>");
		
		else
			pw.println("<h1>Study</h1>")	;
		pw.println("</center>");
	    pw.println("</body>");
	    
		pw.close();
	}
	
}