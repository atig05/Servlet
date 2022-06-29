package  com.atig.servlet;
import jakarta.servlet.*;
import  java.io.*;
import  java.util.*;

public class DateServlet extends GenericServlet{
	public void  service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		//get Printwitter obj from response object
		PrintWriter pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		Date dt=new Date();
		//write logic in response obj
		pw.println("<h1 style= color:red; text-align:center> hiiii"+dt+"</h1>");
		
		pw.close();
	}
	
	
}