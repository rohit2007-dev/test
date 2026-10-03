/**
 * 
 */
package helloWorld;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet 
{


protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{

	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	
	out.println("<h1>Hello World! myself Rohit</h1>");
	
}
}
