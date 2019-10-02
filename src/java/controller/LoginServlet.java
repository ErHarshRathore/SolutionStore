package controller;

import beans.Admin;
import beans.User;
import dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        if(request.getParameter("user")!=null)
        {
            User user = new User();
            user.setEmail(request.getParameter("user"));
            user.setUsername(request.getParameter("user"));
            user.setPassword(request.getParameter("pass"));

            LoginDao rd = new LoginDao();
            String result = rd.loginUser(user);
            if(result != null && !"Invalid Username or Password! Retry".equals(result))
            {    
                session.setAttribute("userType", "user");
                session.setAttribute("userName", result);
                response.sendRedirect("userhome.jsp");
            }else
                request.getRequestDispatcher("index.jsp?error="+result).forward(request, response);
        }
        else
        {
            Admin admin = new Admin();
            admin.setEmail(request.getParameter("admin"));
            admin.setUsername(request.getParameter("admin"));
            admin.setPassword(request.getParameter("pass"));
            System.out.println(admin.getUsername());
            System.out.println(admin.getPassword());
            LoginDao rd = new LoginDao();
            String result = rd.loginAdmin(admin);
            if(result != null && !"Invalid Username or Password!".equals(result))
            {    
                session.setAttribute("userType", "admin");
                session.setAttribute("userName", result);
                response.sendRedirect("adminhome.jsp");
            }else
                request.getRequestDispatcher("admin.jsp?error="+result).forward(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        out.print("<h1>Searching for "+request.getParameter("search")+"</h1>");
    }
}
