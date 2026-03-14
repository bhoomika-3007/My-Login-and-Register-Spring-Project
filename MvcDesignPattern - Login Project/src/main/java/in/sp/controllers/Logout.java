package in.sp.controllers;
import jakarta.servlet.annotation.*; 
import jakarta.servlet.http.HttpServlet; 
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException; 
import java.io.IOException; 
@WebServlet("/Logout")
public class Logout  extends HttpServlet{

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
{
	HttpSession session = request.getSession();
	session.invalidate();
	
	RequestDispatcher rd = request.getRequestDispatcher("/login.html");
	rd.forward(request, response); 
}
}
