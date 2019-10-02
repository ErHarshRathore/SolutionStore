package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.DBConn;
import java.sql.ResultSet;

public final class addsoftware_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/content/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Software</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(!"admin".equals(session.getAttribute("userType")))
                response.sendRedirect(session.getAttribute("userType")+"home.jsp");
        
      out.write("\n");
      out.write("        <table class=\"header\">\n");
      out.write("            <tr height=\"10px\">\n");
      out.write("                <th>&ensp;");
      out.print(session.getAttribute("userType"));
      out.write("@Solution<span style=\"color:yellow\">Store</span></th>\n");
      out.write("                <td style=\"width:300px;font-size:26px;color:cyan\">\n");
      out.write("                    ");
      out.print(session.getAttribute("userName"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td><a href=\"logout\">Logout</a></td>\n");
      out.write("                <td style=\"width: 1%\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table><hr>\n");
      out.write("                <table class=\"login\" border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"center\">\n");
      out.write("                <form action=\"addsoft\" name=\"addform\"\n");
      out.write("                      method=\"POST\" onsubmit=\"return checkAValid()\" style=\"width:40%\">\n");
      out.write("                    <br><h2 style=\"color:cyan\">Add Software</h2>\n");
      out.write("                    Name<br>\n");
      out.write("                    <input type=\"text\" name=\"sname\" placeholder=\"eg. Google Chrome\" required><br><br>\n");
      out.write("                    Version<br>\n");
      out.write("                    <input type=\"text\" name=\"version\" placeholder=\"eg. 61.1.5\"><br><br>\n");
      out.write("                    Category<br>\n");
      out.write("                    <select name=\"tag\" placeholder=\"Category\" required>\n");
      out.write("                        <option></option>\n");
      out.write("                        ");

                            ResultSet rs=DBConn.getConnection().
                                prepareStatement("select name from tags").executeQuery();
                            while(rs.next()){
                        
      out.write("<option>");
out.print(rs.getString("name"));}
      out.write("</option>\n");
      out.write("                    </select><br><br>\n");
      out.write("                    Link<br>\n");
      out.write("                    <input type=\"url\" name=\"link\" placeholder=\"eg. filehippo.com/chrome.exe\" required><br><br>\n");
      out.write("                    logo path<br>\n");
      out.write("                    <input type=\"url\" name=\"path\" placeholder=\"eg. file:///C:/../images/logo.png\"><br><br>\n");
      out.write("                    Description<br>\n");
      out.write("                    <textarea name=\"desc\" maxlength=\"1000\"\n");
      out.write("                        placeholder=\"eg. (A fast and efficient Internet Browser....)\" required></textarea><br><br>\n");
      out.write("                    Confirmation Key<br>\n");
      out.write("                    <input type=\"password\" name=\"key\" placeholder=\"if not &rArr; Contact Us\" required><br><br><br>\n");
      out.write("                    <input type=\"submit\" value=\"Add Software\"><br>\n");
      out.write("                    ");

                        String error = request.getParameter("error");
                        if(error!=null && error!=""){
                            out.print("<p style='color:red'>"+error+"</p>");
                        }
                    
      out.write("<br>\n");
      out.write("                </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table><br><br>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class=\"footer\" bgcolor=\"black\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"33%\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr height=\"50px\"><th>Developers</th></tr>\n");
      out.write("                        <tr><td>Aashish Joshi</td></tr>\n");
      out.write("                        <tr><td><a href='http://erharshrathore.000webhostapp.com' target=\"_blank\">\n");
      out.write("                            Harsh Rathore\n");
      out.write("                        </a></td></tr>\n");
      out.write("                        <tr><td>Praneet Kumar</td></tr>\n");
      out.write("                        <tr><td>Rohit Parmar</td></tr>\n");
      out.write("                        <tr><td>Shruti Bhatiya</td></tr>\n");
      out.write("                        <tr><td>Shubham Shinde</td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("                <td width=\"34%\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr height=\"50px\"><th>Categories</th></tr>\n");
      out.write("                        <tr><td>Media Players</td></tr>\n");
      out.write("                        <tr><td>Code Editors</td></tr>\n");
      out.write("                        <tr><td>Video Editors</td></tr>\n");
      out.write("                        <tr><td>Image Editors</td></tr>\n");
      out.write("                        <tr><td>File Sharing</td></tr>\n");
      out.write("                        <tr><td>...And Many more</td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("                <td width=\"33%\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr height=\"50px\"><th>Contact us</th></tr>\n");
      out.write("                        <tr><td>E - mail</td></tr>\n");
      out.write("                        <tr><td>Instagram</td></tr>\n");
      out.write("                        <tr><td>Telegram</td></tr>\n");
      out.write("                        <tr><td>Mobile no.</td></tr>\n");
      out.write("                        <tr><td>WhatsApp</td></tr>\n");
      out.write("                        <tr><td>StackOverflow</td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th colspan=\"3\"><br><hr>\n");
      out.write("                    <p style=\"color:#456\">\n");
      out.write("                        <i style=\"color:red\">Copyright&copy; 2019-2020 : The Aliens Software </i>\n");
      out.write("                        | All Rights Are Reserved<br>\n");
      out.write("                    </p>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
