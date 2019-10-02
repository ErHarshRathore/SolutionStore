package controller;

import beans.Software;
import dao.DeleteDao;
import dao.ShowDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeleteSServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Software soft = new Software();
        DeleteDao dd = new DeleteDao();
        ShowDao sd = new ShowDao();
        String id = request.getParameter("id");
        HttpSession session = request.getSession(false);
        try{
            if(session.getAttribute("userType")=="admin")
            {
                soft.setName(id);
                String result = dd.deleteSoftware(soft);
                if(result.equals("Deleted"))
                    response.sendRedirect("adminhome.jsp");
            }
            else{
                response.getWriter().print("you are not an admin");
            }
        }
        catch(Exception e){
            response.getWriter().print(e.getMessage());
        }
    }
}
