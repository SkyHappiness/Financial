<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>


<!DOCTYPE html>
<html>
<head>
<style type="text/css">

</style>
<meta charset="utf-8">
<title>交易记录页面</title>
<link
    href="${path}/static/bootstrap-4.0.0-dist/css/bootstrap.min.css"
    rel="stylesheet">
<script type="text/javascript"
    src="${path}/static/bootstrap-4.0.0-dist/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
    src="${path}/static/bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<!-- 标题 -->
<div class="row">
            <div class="col-md-12">
                <h1>交易明细</h1>
            </div>
</div>

<!-- 交易列表 -->
        <div class="row">
            <div class="col-md-12">
                <table class="table table-hover">
                    <tr>
                        <th>编号</th>
                        <th>产品名</th>
                        <th>购买金额</th>
                        <th>起息时间</th>
                        <th>到期时间</th>
                    </tr>
                    <c:forEach items="${pageInfo.list }" var="user">
                        <tr>
                        <td>${user.id}</td>
                        <td>${user.name }</td>
                        <td>${user.age }</td>
                        <td>${user.age }</td>
                        <td>${user.age }</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
</body>
</html>
