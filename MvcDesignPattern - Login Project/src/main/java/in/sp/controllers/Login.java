package in.sp.controllers;
import java.sql.Connection; 
import java.io.IOException;
import java.sql.PreparedStatement; 
import in.sp.dbcon.DbConnection;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import in.sp.model.User;   
import java.sql.ResultSet; 
import java.io.PrintWriter; 
@WebServlet("/loginForm")
public class Login extends HttpServlet
{  @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
	
	PrintWriter out = response.getWriter();  
	response.setContentType("text/html"); 
	String myemail = request.getParameter("email1");
	String mypass = request.getParameter("pass1");
	

    try {
	  Connection con = DbConnection.getConnection();
	  String select_sql_query = "Select * from register where email = ? and password = ? ";
	  PreparedStatement ps = con.prepareStatement(select_sql_query);
	  ps.setString(1, myemail); 
	  ps.setString(2, mypass); 
	  
	  ResultSet rs = ps.executeQuery();
	  if(rs.next())
	  {
		User user = new User();
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		user.setCity(rs.getString("city"));
		
		HttpSession session = request.getSession();
		session.setAttribute("session_user", user); 
		
		RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp"); 
		rd.forward(request, response); 
	  }
	  else {
		  out.println("<h3 style 'color:red'> Email id and password didn't matched </h3>"); 
			 RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			 rd.include(request, response); 
	  }
	  
     }
    
    catch(Exception e)
    {
    	e.printStackTrace(); 
    }
} 
}