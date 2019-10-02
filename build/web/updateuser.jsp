<%@page import="java.sql.ResultSet"%>
<%@page import="dao.ShowDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update User</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/script.js"></script>
    </head>
    <body>
        <%
            if(!"admin".equals(session.getAttribute("userType")))
                response.sendRedirect(session.getAttribute("userType")+"home.jsp");
        %>
        <table class="header" border="0">
            <tr height="10px">
                <th>&ensp;Solution<span style="color:yellow">Store</span></th>
                <td><a href="admin.jsp">Admin</a></td>
                <td><a href="./">Login</a></td>
                <td><a href="#">Contact</a></td>
                <td style="width: 1%"></td>
            </tr>
        </table><hr>
        <br>
        <table class="login" border="0">
            <tr>
                <td align="center">
                <%
                    ShowDao sd = new ShowDao();
                    ResultSet rs = sd.showUsers(request.getParameter("id"));
                    System.err.println(rs.next());
                %>
                <form action="update?id=<%=request.getParameter("id")%>" name="updateform"
                      method="POST" onsubmit="return checkUValid()" style="width:40%">
                    <br><h2 style="color:cyan">Edit Information</h2>
                    <p style="font-size: 34px"><%=rs.getString("name")%></p>
                    new Email ID<br>
                    <input type="email" name="mail" placeholder="<%=rs.getString("email")%>"><br><br>
                    new Username<br>
                    <input type="text" name="user" placeholder="<%=rs.getString("username")%>"><br><br>
                    old Password<br>
                    <input type="password" name="opass" placeholder="eg. ExyAeg45#6c8"><br><br>
                    new Password<br>
                    <input type="password" name="npass" placeholder="eg. NewPassword$91q"><br><br>
                    Country<br>
                    <input type="text" name="cntry" placeholder="<%=rs.getString("country")%>"><br><br><br>
                    <input type="submit" value="Update"><br>
                    <%
                        String error = request.getParameter("error");
                        if(error!=null && error!=""){
                            out.print("<p style='color:red'>"+error+"</p>");
                        }
                    %><br>
                </form>
                </td>
            </tr>
        </table>
        <br>
        <%@include file="/content/footer.jsp"%>
    </body>
</html>