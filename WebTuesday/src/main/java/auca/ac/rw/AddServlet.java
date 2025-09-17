package auca.ac.rw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 

{
 public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
 {
	 int num1=Integer.parseInt(req.getParameter("num1"));
	 int num2=Integer.parseInt(req.getParameter("num2"));
	 String opration=req.getParameter("operation");
	 
	 int result=0;
			 if("Addition".equals(opration)) {
				 result=num1+num2;
			 }else if("Substration".equals(opration)) {
				 result=num1-num2;
			 }
			 
			  req.setAttribute("result", result);
			  
			  //regd and sendRedirect
			 
			 RequestDispatcher rd=req.getRequestDispatcher("sqr");
			 rd.forward(req, res);
	
 }
}
