<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.box1{
  width:500px;
  height:300px;
  margin-top: 20px;
}

.top{
  margin: 0 auto;
  width: auto;
  height:100px;
  text-align:center;
  padding:12px;
   border: 1px solid #c0c0c0;
}

.middle1{
  margin: 0 auto;
  width: auto;
  height: 80px;
  text-align:center;
  padding:12px;
   border: 1px solid #c0c0c0;
}
.middle2{
  margin: 0 auto;
  width: auto;
  height: 80px;
  text-align:center;
  padding:12px;
  border: 1px solid #c0c0c0;
}

</style>
<meta charset="utf-8">
<title>个人中心页面</title>
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
<div class="box1">
<div class="row">
            <div class="col-md-12">
                <h1>个人中心</h1>
            </div>
</div>
  <div class="top">
    <td>总金额(元)</td></br>
    <td>${buyMoney}</td>
  </div>
  <div class="middle1">
     <a class="btn btn-primary" href="${path}/per/toProfileDetail">收益明细</a>
  </div>
  <div class="middle2">
    <a class="btn btn-primary" href="${path}/per/toTransDetail">交易明细</a>
  </div>
 </div>
</div>
</body>
</html>