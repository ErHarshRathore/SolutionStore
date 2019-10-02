package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dao.DBConn;
import java.sql.PreparedStatement;

public final class userhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Solution Store</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/user.css\"\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(!"user".equals(session.getAttribute("userType")))
                response.sendRedirect(session.getAttribute("userType")+"home.jsp");
        
      out.write("\n");
      out.write("        <table class=\"header\">\n");
      out.write("            <tr height=\"10px\">\n");
      out.write("                <th>&ensp;Solution<span style=\"color:yellow\">Store</span></th>\n");
      out.write("                <td style=\"width:300px;font-size:26px;color:cyan\">\n");
      out.write("                    ");
      out.print(session.getAttribute("userName"));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td><a href=\"logout\">Logout</a></td>\n");
      out.write("                <td style=\"width: 1%\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table><hr>\n");
      out.write("        <table class=\"login\" bgcolor=\"#49a\">\n");
      out.write("            <tr>\n");
      out.write("            <form action=\"\" method=\"GET\">\n");
      out.write("                <td style=\"font-size:30px;color:#456;width:214px\"><b>Search Here &Rightarrow;</b></td>\n");
      out.write("                <td><input style=\"width:100%\" type=\"text\" name=\"search\" \n");
      out.write("                           placeholder=\"search for any category or software\"></td>\n");
      out.write("                <td width=\"200px\"><input style=\"width:100%\" type=\"submit\" value=\"Search\"></td>\n");
      out.write("            </form>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        ");

            String tag=null,temp=null,id = request.getParameter("id");
            ResultSet softrs=null,rs = DBConn.getConnection().
                    prepareStatement("select * from tags").executeQuery();
            int i=0,j=3;
            out.print("<table class='catelog'>");
            out.print("<thead><tr style='height: 20px'>"+
                "<th colspan='"+j+"'>CATEGORIES</th></tr></thead>");
            if(id!=null)
                out.print("<style>.a"+id+
                    "{background-color:#345;"+
                    "border-top-left-radius: 50px;"+
                    "border-top-right-radius:50px;}</style>");
            while(rs.next()){
                if(i%j==0) out.print("<tr>");
                temp = String.valueOf(i/j+1)+String.valueOf(i%j+1); 
      out.write("\n");
      out.write("                <td id='");
      out.print(temp);
      out.write("' class='a");
      out.print(temp);
      out.write("'>\n");
      out.write("                    <a href='?id=");
      out.print(temp);
      out.write('#');
      out.print(temp);
      out.write("'>\n");
      out.write("                        <img src='images/");
      out.print(rs.getString("icon"));
      out.write("'>\n");
      out.write("                        <br>");
      out.print(rs.getString("name"));
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                </td>\n");
      out.write("                ");
if(id!=null)
                    if(String.valueOf(i%j+1).equals(id.substring(1, 2)))
                        tag = rs.getString("name");
       
                if(++i%j==0){
                    out.print("</tr>");
                    if(id != null){
                        if(String.valueOf(i/j).equals(id.substring(0, 1))){
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"3\" bgcolor='#345'>\n");
      out.write("                            <table class='software_list' border='0'>\n");
      out.write("                                <tr><th colspan=\"2\">");
      out.print(tag);
      out.write("</th></tr>\n");
      out.write("                                ");

                                    softrs = DBConn.getConnection().
                                        prepareStatement("select name,descript,logo from softwares where tag='"+
                                                tag+"'").executeQuery();
                                    while(softrs.next()){
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td rowspan=\"2\" style='width:10%'>\n");
      out.write("                                        <img src='");
      out.print(softrs.getString("logo"));
      out.write("'></td>\n");
      out.write("                                    <td style=\"color:orange;text-align: left\">\n");
      out.write("                                        ");
      out.print(softrs.getString("name"));
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"font-size: 22px;line-height: 26px;text-align: justify\">\n");
      out.write("                                        <p>");
      out.print(softrs.getString("descript"));
      out.write("</p>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
                    }
                }
            }
            out.print("</table>");
        
      out.write("<br>\n");
      out.write("        <img src='images/Logo/7zip.png'>\n");
      out.write("        <img src=\"images/logos0/brave-icon.png\">\n");
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
      out.write("                        <tr><td>Harsh Rathore</td></tr>\n");
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
