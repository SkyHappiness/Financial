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
  height:420px;
  border: 1px solid #c0c0c0;
  margin-top: 20px;
}
 

.top{
  margin: 0 auto;
  width: auto;
  height:10px;
  text-align:center;
  padding:12px;
}

.middle1{
  margin: 0 auto;
  width: auto;
  height: 60px;
  text-align:center;
  padding:12px;
}
  

.middle1_left{
  width:210px;
  height:40px;
  float: left;
  text-align:center;
  padding:10px;
  border: 1px solid #c0c0c0;

}

.middle1_right{
  width:210px;
  height:40px;
  float: left;
  text-align:center;
  margin-left:10px;
  padding:10px; 
  border: 1px solid #c0c0c0;
}

.middle2{
  margin: 0 auto;
  width: auto;
  height: 100px;
  text-align:center;
  padding:12px;
  border: 1px solid #c0c0c0;
}

.middle3{
  margin: 0 auto;
  width: auto;
  height: 100px;
  text-align:center;
  padding:12px;
  border: 1px solid #c0c0c0;
}
.foot{
  margin: 0 auto;
  width: auto;
  height: 20px;
  text-align:center;
  padding:12px;
}

</style>
<meta charset="utf-8">
<title>产品详情页面</title>
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
<!-- 产品列表 -->
<div class="box1">
  <div class="top"><td>${user.name}</td></div>
  <div class="middle1">
     <div class="middle1_left">
      七日年化收益率</br>
     ${user.name}
     </div>
     <div class="middle1_right">
       万份收益</br>
     ${user.name}
     </div>
  </div>
  <div class="middle2">
    <font size="3">购买信息</font></br>
    <font size="2">起购金额</font> </br>
    <font size="2">份额确认信息</font>
  </div>
  <div class="middle3">
    <font size="3">赎回信息</font></br>
    <font size="2">赎回费率</font> </br>
    <font size="2">到账时间</font>
  </div>
  <div class="foot">
     <a href="#">
     <button class="btn btn-primary">购买</button>
     </a>
  </div>

 </div>
</div>
</body>
</html>
