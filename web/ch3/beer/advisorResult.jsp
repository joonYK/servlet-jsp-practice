<%--
  Created by IntelliJ IDEA.
  User: JY
  Date: 2020-04-05
  Time: 오후 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" language="java" %>
<html>
<head>
    <title>BeerAdvisorResult</title>
</head>
<body>
    <h1 align="center">Beer Recommendations JSP</h1>
    <p>
    <%
        List<String> brands = (List<String>) request.getAttribute("brands");
        for (String brand : brands) {
            out.print("<br>try: " + brand);
        }
    %>
    </p>
</body>
</html>
