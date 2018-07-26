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
  height:130px;
  border: 1px solid #c0c0c0;
  margin-top: 20px;
}
 
/**box上*/
.top{
  margin: 0 auto;
  width: auto;
  height:10px;
  text-align:center;
  padding:12px;
}
/**box下*/
.foot{
  margin: 0 auto;
  width: auto;
  height: 60px;
  text-align:center;
  padding:12px;
}
  
 
/**box下左*/
.foot_left{
  width:380px;
  height:40px;
  float: left;
  text-align:center;
  padding:10px;
  border: 1px solid #c0c0c0;

}
/**box下右*/
.foot_right{
  width:40px;
  height:40px;
  float: left;
  text-align:center;
  margin-left:10px;
  padding:10px;
 
}
</style>
<meta charset="utf-8">
<title>产品页面</title>
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
                <h1>全部理财</h1>
            </div>
</div>
<!-- 搜索栏-->
 <div class="search">
    <div class="row">
        <div class="col-md-6">
            <div class="input-group">
                <input type="text" class="form-control" placeholder="请输入检索关键字">
                <span class="input-group-btn">
                    <button class="btn btn-primary">搜索</button>
                </span>
            </div>
        </div>
    </div>
</div>
<!-- 产品列表 -->
<div class="box1">
  <div class="top">现金宝1</div>
  <div class="foot">
     <div class="foot_left">七日年化收益率</div>
     <div class="foot_right"><a href="#">详情</a></div>
  </div>
<div class="box1">
  <div class="top">现金宝2</div>
  <div class="foot">
     <div class="foot_left">七日年化收益率</div>
     <div class="foot_right"><a href="#">详情</a></div>
  </div>


 </div>
</div>
</body>
</html>