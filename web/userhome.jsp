<%@page import="java.sql.ResultSet"%>
<%@page import="dao.DBConn"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solution Store</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/user.css"
    </head>
    <body>
        <%
            if(!"user".equals(session.getAttribute("userType")))
                response.sendRedirect(session.getAttribute("userType")+"home.jsp");
        %>
        <table class="header">
            <tr height="10px">
                <th>&ensp;Solution<span style="color:yellow">Store</span></th>
                <td style="width:300px;font-size:26px;color:cyan">
                    <%=session.getAttribute("userName")%>
                </td>
                <td><a href="logout">Logout</a></td>
                <td style="width: 1%"></td>
            </tr>
        </table><hr>
        <table class="login" bgcolor="#49a">
            <tr>
            <form action="#search" method="GET">
                <td style="font-size:30px;color:#456;width:214px"><b>Search Here &Rightarrow;</b></td>
                <td><input style="width:100%" type="text" name="search" 
                           placeholder="search for any software"></td>
                <td width="200px"><input style="width:100%" type="submit" value="Search"></td>
            </form>
            </tr>
        </table>
        <%
            String tag=null,temp=null,search = request.getParameter("search"),id = request.getParameter("id");
            ResultSet softrs=null,rs = DBConn.getConnection().
                    prepareStatement("select * from tags").executeQuery();
            if(search!=null)
            {
                softrs = DBConn.getConnection().
                    prepareStatement("select name,version,descript,logo,link from softwares where name like '%"+
                            search+"%'").executeQuery();%>
                <div class="catelog">
                    <table class='software_list'>
                        <tr><th id="result" colspan="3">Search Results for <q><%=search%></q></th></tr>
                    <%if(softrs!=null)
                    while(softrs.next()){%>
                        <tr>
                            <td rowspan="2" style='width:10%'>
                                <img src='<%=softrs.getString("logo")%>'></td>
                            <td style="color:orange;text-align: left">
                                <a href="<%=softrs.getString("link")%>" target="_blank">
                                   <%=softrs.getString("name")%>
                                    <span style="color:yellow">
                                        <%=softrs.getString("version")%>
                                    </span>
                                </a>
                            </td>
                            <td rowspan="2" style="width:2%"></td>
                        </tr>
                        <tr>
                            <td style="font-size: 22px;line-height: 26px;text-align: justify">
                                <p><%=softrs.getString("descript")%></p>
                            </td>
                        </tr>
                    <%}else{out.print("null");}%>
                    </table>
                </div><hr>
            <%}
            int i=0,j=3;
            out.print("<table class='catelog' cellspacing='0'>");
            out.print("<thead><tr style='height: 20px'>"+
                "<th colspan='"+j+"'>CATEGORIES</th></tr></thead>");
            if(id!=null)
                out.print("<style>.a"+id+
                    "{background-color:#345;"+
                    "border-top-left-radius: 50px;"+
                    "border-top-right-radius:50px;}</style>");
            while(rs.next()){
                if(i%j==0) out.print("<tr>");
                temp = String.valueOf(i/j+1)+String.valueOf(i%j+1); %>
                <td id='<%=temp%>' class='a<%=temp%>'>
                    <a href='?id=<%=temp%>#<%=temp%>'>
                        <img src='images/<%=rs.getString("icon")%>'>
                        <br><%=rs.getString("name")%>
                    </a>
                </td>
                <%if(id!=null)
                    if(String.valueOf(i%j+1).equals(id.substring(1, 2)))
                        tag = rs.getString("name");
       
                if(++i%j==0){
                    out.print("</tr>");
                    if(id != null){
                        if(String.valueOf(i/j).equals(id.substring(0, 1))){
                    %>
                    <tr>
                        <td colspan="3" bgcolor='#345'>
                            <table class='software_list' border='0'>
                                <tr><th colspan="3"><%=tag%></th></tr>
                                <%
                                    softrs = DBConn.getConnection().
                                        prepareStatement("select name,version,descript,logo,link from softwares where tag='"+
                                                tag+"'").executeQuery();
                                    while(softrs.next()){
                                %>
                                <tr>
                                    <td rowspan="2" style='width:10%'>
                                        <img src='<%=softrs.getString("logo")%>'></td>
                                    <td style="color:orange;text-align: left">
                                        <a href="<%=softrs.getString("link")%>" target="_blank">
                                        <%=softrs.getString("name")%>
                                        <span style="color:yellow">
                                            <%=softrs.getString("version")%>
                                        </span></a>
                                    </td>
                                    <td rowspan="2" style="width:2%"></td>
                                </tr>
                                <tr>
                                    <td style="font-size: 22px;line-height: 26px;text-align: justify">
                                        <p><%=softrs.getString("descript")%></p>
                                    </td>
                                </tr>
                                <%}%>
                            </table>
                        </td>
                    </tr>
                    <% }
                    }
                }
            }
            out.print("</table>");
        %><br>
        <%@include file="content/footer.jsp" %>
    </body>
</html>
