<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script src="js/script.js"></script>
    </head>
    <body>
        <%
            if(session.getAttribute("userName")!=null)
                request.getRequestDispatcher("adminhome.jsp").forward(request, response);
        %>
        <table class="header">
            <tr height="10px">
                <th>&ensp;Solution<span style="color:yellow">Store</span></th>
                <td><a href="./">Home</a></td>
                <td><a href="adminreg.jsp">Register</a></td>
                <td><a href="#">Contact</a><span></span></td>
            </tr>
        </table><hr>
        <br><br>
        <table class="login" border="0">
            <tr>
                <td width='60%' colspan="3" align="center">
                    <h2 style="color: orange">About Us</h2>
                </td>
                <td rowspan="2" align="center" width="60%">
                <form action="login" name="loginform" method="POST"
                      onsubmit="return checkLValid()">
                    <br><h2 style="color:cyan">Admin Login</h2>
                    Username<br>
                    <input type="text" name="admin" placeholder="admin username or email"><br><br><br>
                    Password<br>
                    <input type="password" name="pass" placeholder="admin password"><br><br>
                    <input type="submit" value="Login"><br>
                    <%
                        String error = request.getParameter("error");
                        if(error!=null && error!=""){
                            out.print("<p style='color:red'>"+error);
                            out.print("<br><a href=''>(contact us)</a></p>");
                        }
                        else
                            out.print("<br>");
                    %><br>
                </form>
            </td>
            </tr>
            <tr>
                <td width='15%'></td>
                <td style="">
                    <p style="line-height:35px;font-size:20px">
                        At Solution store we belive everyone deserves to have an
                        online store. Innovation & simplicity makes us happy : 
                        Our goal is to remove any technical or financial barriers
                        that can prevent business owners or students from building
                        their own needs because all the repositories are here 
                        for absolutely free. We're excited to help you on your journey.
                    </p>
                </td>
                <td width='15%'></td>
            </tr>
        </table>
        <br><br>
        <%@include file="/content/footer.jsp" %>
    </body>
</html>
