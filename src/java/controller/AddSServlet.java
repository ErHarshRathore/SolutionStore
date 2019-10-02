package controller;

import beans.Software;
import dao.SoftwareDao;
import java.io.IOException;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddSServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Software sf = new Software();
        String path = request.getParameter("path");
        
        sf.setName(request.getParameter("sname"));
        sf.setVersion(request.getParameter("version"));
        sf.setTag(request.getParameter("tag"));
        sf.setLink(request.getParameter("link"));
        sf.setDescription(request.getParameter("desc"));
        sf.setLastUpdate(new GregorianCalendar().getTime()
                .toInstant().toString().substring(0, 10));
        sf.setPath(path.substring(path.indexOf("images/")));
        String result = null;
        
        if(request.getParameter("key").equals("aliensgroup"))
        {
            SoftwareDao sd = new SoftwareDao();
            result = sd.addSoftware(sf);
            if(result.equals("Success"))
                request.getRequestDispatcher("adminhome.jsp").forward(request, response);
            else
                request.getRequestDispatcher("addsoftware.jsp?error="+result).forward(request, response);
        }
        else
        {
            result = "Unauthorized Admin Key!";
            request.getRequestDispatcher("addsoftware.jsp?error="+result).forward(request, response);
        } 
    }
}
