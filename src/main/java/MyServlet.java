

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	PrintWriter out = response.getWriter();
	if(age<1 || name.length()<2) {
		RequestDispatcher rd = request.getRequestDispatcher("error.html");
		rd.forward(request, response);
	}
	else {
		request.setAttribute("name", name);
		request.setAttribute("age", age); 
		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
		rd.forward(request, response);
	}
	
			
	}

}
