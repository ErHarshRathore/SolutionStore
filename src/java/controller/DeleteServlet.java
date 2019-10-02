package controller;

import beans.User;
import dao.DeleteDao;
import dao.ShowDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = new User();
        DeleteDao dd = new DeleteDao();
        ShowDao sd = new ShowDao();
        String id = request.getParameter("id");
        HttpSession session = request.getSession(false);
        try{
            if(session.getAttribute("userType").equals("admin") ||
                    sd.showUsers(id).getString("name").equals(session.getAttribute("userName")))
            {
                user.setName(id);
                String result = dd.deleteUser(user);
                if(result.equals("Deleted"))
                {
                    if(session.getAttribute("userType").equals("admin"))
                        response.sendRedirect("adminhome.jsp");
                    else
                        request.getRequestDispatcher("logout").forward(request, response);
                }
            }
            else{
                response.getWriter().print("you are not an admin or same user.");
            }
        }
        catch(Exception e){
            response.getWriter().print(e.getMessage());
        }
    }
}
