package net.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String user = request.getParameter("uname");
		String pass = request.getParameter("psw");
		if(user.equals("admin")&(pass.equals("hacker"))){
			RequestDispatcher rd = request.getRequestDispatcher("Success");
			rd.forward(request,response);
		}
		else{
			PrintWriter pWriter = response.getWriter();
			pWriter.println("Wrong username/password.");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request,response);
		}
	}

}
