package auca.ac.rw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square extends HttpServlet 

{
	 public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	 {
		 PrintWriter out=res.getWriter();
		 
		 int k=(int)req.getAttribute("result");
		 
		 k*=k;
		 
		 out.println("<h1>Hey now, I know why you called me. Here is the square of your result: "+k+"</h1>");
	 }
}
