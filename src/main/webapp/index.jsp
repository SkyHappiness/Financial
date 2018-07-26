<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <meta charset="utf-8">
    <style type="text/css">
a {
    text-decoration: none;
    color: #fff;
    font-size: 14px;
}

h3 {
    width: 180px;
    height: 38px;
    margin: 100px auto;
    text-align: center;
    line-height: 38px;
    background: #5BC0DE;
    border-radius: 4px;
}
</style>
</head>
<body>
	<h3>
        <a href="${path}/user/userInfo">进入用户管理页</a>
    </h3>
</body>
</html>
