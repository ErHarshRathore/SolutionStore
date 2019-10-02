<%@page import="java.sql.ResultSet,dao.ShowDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
         <%
            if(!"admin".equals(session.getAttribute("userType")))
                response.sendRedirect(session.getAttribute("userType")+"home.jsp");
        %>
        <table class="header">
            <tr height="10px">
                <th>&ensp;<%=session.getAttribute("userType")%>@Solution<span style="color:yellow">Store</span></th>
                <td style="width:300px;font-size:26px;color:cyan">
                    <%=session.getAttribute("userName")%>
                </td>
                <td><a href="logout">Logout</a></td>
                <td style="width: 1%"></td>
            </tr>
        </table><hr>
        <%
            ShowDao su = new ShowDao();
            ResultSet rs = null;
            try{
                rs = su.showUsers(null);
                int i = 0;
                
                if(rs!=null)
                {
                    %>
                    <table cellpadding='4px' style='color:#ccc;font-size:18px'>
                        <thead>
                            <tr bgcolor="#135"><th colspan='7'
                                style='font-size:30px;color:orange;letter-spacing: 20px'>
                                    USERS
                            </th></tr>
                            <tr height='50px' bgcolor=#000>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Email</th>
                                <th>Username</th>
                                <th>Country</th>
                                <th>Update</th>
                                <th>Delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%while(rs.next())
                            {
                                if(i++%2!=0)
                                    out.print("<tr height='40px' bgcolor=#123>");
                                else
                                   out.print("<tr height='40px' bgcolor=#234>"); 
                                out.print("<td align='center'>"+rs.getString("id")+"</td>");
                                out.print("<td>"+rs.getString("name")+"</td>");
                                out.print("<td>"+rs.getString("email")+"</td>");
                                out.print("<td>"+rs.getString("username")+"</td>");
                                out.print("<td>"+rs.getString("country")+"</td>");
                                out.print("<td align='center'>"+
                                    "<a href='updateuser.jsp?id="+rs.getString("ID")+
                                        "'>Update</a></td>");
                                out.print("<td align='center'>"+
                                    "<a href='delete?id="+rs.getString("ID")+"' "+
                                    "onclick=\"return confirm('Do you want to delete user "+rs.getString("name")+
                                    "')\">Delete</a></td>");
                                out.print("</tr>");
                            }%>
                            <tr><td colspan="8" align="right">
                                    <a href="userreg.jsp">Add New User</a>
                            </td></tr>
                        </tbody>
                    </table>
                    <%
                }
            }
            catch(Exception e)
            {
                out.print(e.getMessage());
            }%>
            <hr>
            <%
            try{
                rs = su.showSoftwares(null);
                int i = 0;
                
                if(rs!=null)
                {
                    %>
                    <table cellpadding='4px' style='color:#ccc;font-size:18px'>
                        <thead>
                            <tr bgcolor="#135"><th colspan='8'
                                style='font-size:30px;color:orange;letter-spacing: 20px'>
                                    SOFTWARES
                            </th></tr>
                            <tr height='50px' bgcolor=#000>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Version</th>
                                <th>Category</th>
                                <th>Description</th>
                                <th>Last Update</th>
                                <th>Update</th>
                                <th>Delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%while(rs.next())
                            {
                                if(i++%2!=0)
                                    out.print("<tr height='40px' bgcolor=#123>");
                                else
                                   out.print("<tr height='40px' bgcolor=#234>"); 
                                out.print("<td align='center'>"+rs.getString("id")+"</td>");
                                out.print("<td>"+rs.getString("name")+"</td>");
                                out.print("<td>"+rs.getString("version")+"</td>");
                                out.print("<td>"+rs.getString("tag")+"</td>");
                                out.print("<td style='width:50%'>"+rs.getString("descript")+"</td>");
                                out.print("<td>"+rs.getString("last_update")+"</td>");
                                out.print("<td align='center'>"+
                                    "<a href='updateSoftware.jsp?id="+rs.getString("ID")+
                                        "'>Update</a></td>");
                                out.print("<td align='center'>"+
                                    "<a href='deletes?id="+rs.getString("ID")+"' "+
                                    "onclick=\"return confirm('Do you want to delete software "+rs.getString("name")+
                                    "')\">Delete</a></td>");
                                out.print("</tr>");
                            }%>
                            <tr><td colspan="8" align="right">
                                    <a href="addsoftware.jsp">Add New Software</a>
                            </td></tr>
                        </tbody>
                    </table>
                    <%
                }
            }
            catch(Exception e)
            {
                out.print(e.getMessage());
            }
        %>
        <hr>
        <%@include file="content/footer.jsp" %>
    </body>
</html>