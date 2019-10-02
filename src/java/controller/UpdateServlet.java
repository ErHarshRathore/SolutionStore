package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import beans.User;
import dao.UpdateDao;

public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {      
        User user = new User();
        user.setName(request.getParameter("id"));
        user.setEmail(request.getParameter("mail"));
        user.setUsername(request.getParameter("user"));
        String oldpass=request.getParameter("opass");
        user.setPassword(request.getParameter("npass"));
        user.setCountry(request.getParameter("cntry"));
        
        UpdateDao ud = new UpdateDao();
        String result = ud.updateUser(user, oldpass);
        if(result.equals("Updated"))
            if(request.getSession(false).getAttribute("userType").equals("admin"))
                request.getRequestDispatcher("adminhome.jsp").forward(request, response);
            else
                request.getRequestDispatcher("index.jsp").forward(request, response);
        else
            request.getRequestDispatcher("updateuser.jsp?error="
                    +result+"&id="+request.getParameter("id")).forward(request, response);
    }
}
