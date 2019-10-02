<%@page import="dao.DBConn"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Software</title>
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
                <table class="login" border="0">
            <tr>
                <td align="center">
                <form action="addsoft" name="addform"
                      method="POST" onsubmit="return checkAValid()" style="width:40%">
                    <br><h2 style="color:cyan">Add Software</h2>
                    Name<br>
                    <input type="text" name="sname" placeholder="eg. Google Chrome" required><br><br>
                    Version<br>
                    <input type="text" name="version" placeholder="eg. 61.1.5"><br><br>
                    Category<br>
                    <select name="tag" style="text-align-last:center;
                        width:70%;height:30px;border:0px;border-radius: 50px;" required>
                        <option></option>
                        <%
                            ResultSet rs=DBConn.getConnection().
                                prepareStatement("select name from tags").executeQuery();
                            while(rs.next()){
                        %><option><%out.print(rs.getString("name"));}%></option>
                    </select><br><br>
                    Link<br>
                    <input type="url" name="link" placeholder="eg. filehippo.com/chrome.exe" required><br><br>
                    logo path<br>
                    <input type="url" name="path" placeholder="eg. file:///C:/../images/logo.png"><br><br>
                    Description<br>
                    <textarea name="desc" maxlength="1000" style="max-width:76%;min-width:70%;
                        min-height:80px;max-height:200px;border-radius:20px;"
                        placeholder="eg. (A fast and efficient Internet Browser....)" required></textarea><br><br>
                    Confirmation Key<br>
                    <input type="password" name="key" placeholder="if not &rArr; Contact Us" required><br><br><br>
                    <input type="submit" value="Add Software"><br>
                    <%
                        String error = request.getParameter("error");
                        if(error!=null && error!=""){
                            out.print("<p style='color:red'>"+error+"</p>");
                        }
                    %><br>
                </form>
                </td>
            </tr>
        </table><br><br>
        <%@include file="content/footer.jsp"%>
    </body>
</html>
