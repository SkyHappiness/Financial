<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>


<html>
<head>
<title>购买</title>
<meta charset="utf-8">
<title>购买页面</title>
<link
    href="${path}/static/bootstrap-4.0.0-dist/css/bootstrap.min.css"
    rel="stylesheet">
<script type="text/javascript"
    src="${path}/static/bootstrap-4.0.0-dist/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
    src="${path}/static/bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>
</head>

<body>
    <h1>购买页面</h1>
    <form action="" name="userForm">
         购买金额（元）：<input type="text" name="money"><br>
          <input type="button" value="确认购买"
            onclick="addUser()">
    </form>

    <script type="text/javascript">
        function addUser() {
            var form = document.forms[0];
            form.action = "<%=basePath %>user/insert";
            form.method = "post";
            form.submit();
        }
    </script>
</body>
</html>