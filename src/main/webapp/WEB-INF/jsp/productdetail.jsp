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
  height:400px;
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
  height: 80px;
  text-align:center;
  padding:12px;
}
  

.middle1_left{
  width:210px;
  height:60px;
  float: left;
  text-align:center;
  padding:10px;
  border: 1px solid #c0c0c0;

}

.middle1_right{
  width:210px;
  height:60px;
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
.start{
margin-left:410px;
font-size:20px;
color:blue;
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
<div class="row">
            <div class="col-md-12">
                <h1>产品详情</h1>
                  <div class="start" >
                   <a href="../index.jsp">回到首页</a>
                   </div>
            </div>
</div>
<!-- 产品列表 -->
<div class="box1">
  <div class="top"><td>${detailInfo.name}</td></div>
  <div class="middle1">
     <div class="middle1_left">
      七日年化收益率</br>
     ${detailInfo.yearPro}
     </div>
     <div class="middle1_right">
       万份收益</br>
    ${detailInfo.dayPro}
     </div>
  </div>
  <div class="middle2">
    <font size="3">购买信息</font></br>
   ${detailInfo.buyInfo}
  </div>
  <div class="middle3">
    <font size="3">赎回信息</font></br>
   ${detailInfo.saleInfo}
  </div>
  <div class="foot">
     <a href="${path}/pro/toBuyPro?id=${detailInfo.id}"> 
     <button class="btn btn-primary">购买</button>
     </a>
  </div>

 </div>
</div>
</body>
</html>
