package study;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Date
 */
@WebServlet("/Date")
public class Date extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		HttpSession session = request.getSession();
		
		System.out.println("this is servlet");
		
		String date = request.getParameter("date");
		
		session.setAttribute("date", date.toString());
		session.setAttribute("time", new Date().toString());
		
		response.sendRedirect("Date");
	}

	

}
