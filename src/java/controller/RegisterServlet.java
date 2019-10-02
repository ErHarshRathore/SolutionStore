package controller;

import beans.Admin;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.RegisterDao;
import beans.User;

public class RegisterServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String result=null;
        
        if(request.getParameter("cntry")!=null)
        {
            User user = new User();

            user.setName(request.getParameter("name"));
            user.setEmail(request.getParameter("mail"));
            user.setUsername(request.getParameter("user"));
            user.setPassword(request.getParameter("ipass"));
            user.setCountry(request.getParameter("cntry"));

            if(user.getPassword().equals(request.getParameter("cpass")))
            {
                RegisterDao rd = new RegisterDao();
                result = rd.resisterUser(user);
                if(result.equals("Success"))
                    if("admin".equals(request.getSession(false).getAttribute("userType")))
                        response.sendRedirect("adminhome.jsp");
                    else
                        response.sendRedirect("./");
                else
                    request.getRequestDispatcher("userreg.jsp?error="+result).forward(request, response);
            }
            else
            {
                result = "Unmatched Password Fields! Try Again";
                request.getRequestDispatcher("userreg.jsp?error="+result).forward(request, response);
            }
        }
        else
        {
            Admin admin = new Admin();

            admin.setName(request.getParameter("name"));
            admin.setEmail(request.getParameter("mail"));
            admin.setUsername(request.getParameter("user"));
            admin.setPassword(request.getParameter("ipass"));
            admin.setKey(request.getParameter("key"));

            if(admin.getPassword().equals(request.getParameter("cpass"))
                    && "aliensgroup".equals(admin.getKey()))
            {
                RegisterDao rd = new RegisterDao();
                result = rd.resisterAdmin(admin);
                if(result.equals("Success"))
                    request.getRequestDispatcher("admin.jsp").forward(request, response);
                else
                    request.getRequestDispatcher("adminreg.jsp?error="+result).forward(request, response);
            }
            else if(!"aliensgroup".equals(admin.getKey()))
            {
                result = "Unauthorized Confirmation Key!";
                request.getRequestDispatcher("adminreg.jsp?error="+result).forward(request, response);
            }
            else
            {
                result = "Unmatched Password Fields! Try Again";
                request.getRequestDispatcher("adminreg.jsp?error="+result).forward(request, response);
            }
        }
    }
}
