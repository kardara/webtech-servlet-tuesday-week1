package auca.ac.rw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class HandleUserInfo extends HttpServlet 

{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String fName=req.getParameter("fName");
		String lName=req.getParameter("lName");
		int age=Integer.parseInt(req.getParameter("age"));
		
		String status=(age>18)?"adult":"young";
		
		PrintWriter out=res.getWriter();
		
		out.println("<h1>Hello "+fName+" "+lName+", you are "+status);
	}

}
