package org.apache.jsp.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class=\"footer\" bgcolor=\"black\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <table width=\"33%\">\n");
      out.write("                        <tr height=\"50px\"><th>Developers</th></tr>\n");
      out.write("                        <tr><td>Aashish Joshi</td></tr>\n");
      out.write("                        <tr><td>Harsh Rathore</td></tr>\n");
      out.write("                        <tr><td>Praneet Kumar</td></tr>\n");
      out.write("                        <tr><td>Rohit Parmar</td></tr>\n");
      out.write("                        <tr><td>Shruti Bhatiya</td></tr>\n");
      out.write("                        <tr><td>Shubham Shinde</td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <table width=\"34%\">\n");
      out.write("                        <tr height=\"50px\"><th>Products</th></tr>\n");
      out.write("                        <tr><td>Aashish Joshi</td></tr>\n");
      out.write("                        <tr><td>Harsh Rathore</td></tr>\n");
      out.write("                        <tr><td>Praneet Kumar</td></tr>\n");
      out.write("                        <tr><td>Rohit Parmar</td></tr>\n");
      out.write("                        <tr><td>Shruti Bhatiya</td></tr>\n");
      out.write("                        <tr><td>Shubham Shinde</td></tr>\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <table width=\"33%\">\n");
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
      out.write("                    <p style=\"color:#333\">\n");
      out.write("                        <i style=\"color:red\">copyright&copy; 2019-2020 : The Aliens Software </i>\n");
      out.write("                        | All Rights Are Reserved<br>\n");
      out.write("                    </p>\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
