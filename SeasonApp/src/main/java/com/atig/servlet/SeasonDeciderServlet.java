package com.atig.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SeasonDeciderServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest hreq,HttpServletResponse hres) throws IOException,ServletException {
		LocalDateTime ldt=LocalDateTime.now();
		int month=ldt.getMonthValue();
		//set content type of reponse
		hres.setContentType("text/html");
		
		PrintWriter pw=hres.getWriter();
		
		String season="";
		pw.println("<body bgcolor='cyan'>");
		if(month<=6 && month>3)
			season="Summer";
		else if(month<=10 && month>6)
			season="Rainy";
		else
			season="Winter";
		pw.println("<h1> Current Season is : "+season+" </h1>");
		pw.println("<h1> <a href='http://localhost:1010/SeasonApp/page.html'>Go back home</a></h1>");
		pw.println("</body>");
		pw.close();
	}
}
