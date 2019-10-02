package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Solution Store</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class=\"header\">\n");
      out.write("            <tr height=\"10px\">\n");
      out.write("                <th>&ensp;Solution Store</th>\n");
      out.write("                <td><a href=\"admin.jsp\">Admin</a></td>\n");
      out.write("                <td><a href=\"userreg.jsp\">Register</a></td>\n");
      out.write("                <td><a href=\"#\">Contact</a></td>\n");
      out.write("                <td style=\"width: 1%\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table><hr>\n");
      out.write("        <br><br>\n");
      out.write("        <table class=\"login\" border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width='60%' colspan=\"3\" align=\"center\">\n");
      out.write("                    <h2 style=\"color: orange\">About Us</h2>\n");
      out.write("                </td>\n");
      out.write("                <td rowspan=\"2\" align=\"center\" width=\"60%\">\n");
      out.write("                <form action=\"\" name=\"loginform\" onsubmit=\"return checkLValid()\">\n");
      out.write("                    <br><h2 style=\"color:cyan\">Login</h2>\n");
      out.write("                    Username<br>\n");
      out.write("                    <input type=\"text\" id=\"user\" placeholder=\"username\"><br><br><br>\n");
      out.write("                    Password<br>\n");
      out.write("                    <input type=\"password\" id=\"pass\" placeholder=\"password\"><br><br>\n");
      out.write("                    <input type=\"submit\" value=\"Login\"><br>\n");
      out.write("                    ");

                        String error = request.getParameter("error");
                        if(error!=null && error!=""){
                            out.print("<p style='color:red'>"+error);
                            out.print("<br><a href=''>(forget password)</a></p>");
                        }
                        else
                            out.print("<br>");
                    
      out.write("<br>\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td width='15%'></td>\n");
      out.write("                <td style=\"\">\n");
      out.write("                    <p style=\"line-height:35px;font-size:20px\">\n");
      out.write("                        At Solution store we belive everyone deserves to have an\n");
      out.write("                        online store. Innovation & simplicity makes us happy : \n");
      out.write("                        Our goal is to remove any technical or financial barriers\n");
      out.write("                        that can prevent business owners or students from building\n");
      out.write("                        their own needs because all the repositories are here \n");
      out.write("                        for absolutely free. We're excited to help you on your journey.\n");
      out.write("                    </p>\n");
      out.write("                </td>\n");
      out.write("                <td width='15%'></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class=\"footer\" bgcolor=\"black\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"33%\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr height=\"50px\"><th>Developers</th></tr>\n");
      out.write("                        <tr><td>Aashish Joshi</td></tr>\n");
      out.write("                        <tr><td>Harsh Rathore</td></tr>\n");
      out.write("                        <tr><td>Praneet Kumar</td></tr>\n");
      out.write("                        <tr><td>Rohit Parmar</td></tr>\n");
      out.write("                        <tr><td>Shruti Bhatiya</td></tr>\n");
      out.write("                        <tr><td>Shubham Shinde</td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("                <td width=\"34%\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr height=\"50px\"><th>Products</th></tr>\n");
      out.write("                        <tr><td>Aashish Joshi</td></tr>\n");
      out.write("                        <tr><td>Harsh Rathore</td></tr>\n");
      out.write("                        <tr><td>Praneet Kumar</td></tr>\n");
      out.write("                        <tr><td>Rohit Parmar</td></tr>\n");
      out.write("                        <tr><td>Shruti Bhatiya</td></tr>\n");
      out.write("                        <tr><td>Shubham Shinde</td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("                <td width=\"33%\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr height=\"50px\"><th>Reference</th></tr>\n");
      out.write("                        <tr><td>YouTube</td></tr>\n");
      out.write("                        <tr><td>Book Name</td></tr>\n");
      out.write("                        <tr><td>W3Schoole</td></tr>\n");
      out.write("                        <tr><td>FileHippo</td></tr>\n");
      out.write("                        <tr><td>SourceForge</td></tr>\n");
      out.write("                        <tr><td>Softonic</td></tr>\n");
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
      out.write("<html>\n");
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
