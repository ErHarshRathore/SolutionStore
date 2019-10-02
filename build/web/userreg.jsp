<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register User</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/script.js"></script>
    </head>
    <body>
        <%
            if("user".equals(session.getAttribute("userType")))
                response.sendRedirect("userhome.jsp");
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
                <form action="register" name="registerform" method="POST"
                      onsubmit="return checkRValid()" style="width:40%">
                    <br><h2 style="color:cyan">Register</h2>
                    Full Name<br>
                    <input type="text" name="name" placeholder="eg. First Middle Last"><br><br>
                    Email ID<br>
                    <input type="email" name="mail" placeholder="eg. example@domain.com"><br><br>
                    Username<br>
                    <input type="text" name="user" placeholder="eg. mr.first_last"><br><br>
                    Password<br>
                    <input type="password" name="ipass" placeholder="eg. ExyAeg45#6c8"><br><br>
                    Confirm Password<br>
                    <input type="password" name="cpass" placeholder="eg. ExyAeg45#6c8"><br><br>
                    Country<br>
                    <input type="text" name="cntry" placeholder="eg. America"><br><br><br>
                    <input type="submit" value="Register"><br>
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