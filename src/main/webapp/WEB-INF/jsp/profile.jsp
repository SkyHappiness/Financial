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
  margin-top: 20px;
}
 
.middle1{
  margin: 0 auto;
  width: auto;
  height: 60px;
  text-align:center;
  padding:12px;
  border: 1px solid #c0c0c0;

}
  

.middle1_left{
  width:210px;
  height:40px;
  float: left;
  text-align:center;
  padding:10px;

}

.middle1_right{
  width:210px;
  height:40px;
  float: left;
  text-align:center;
  margin-left:10px;
  padding:10px; 
}

.middle2{
  margin: 0 auto;
  width: auto;
  height: 100px;
  text-align:center;
  padding:12px;
   margin-top: 10px;
}

</style>
<meta charset="utf-8">
<title>收益明细页面</title>
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
<!-- 标题 -->
<div class="row">
            <div class="col-md-12">
                <h1>收益明细</h1>
            </div>
</div>
<!-- -->
 <div class="middle1">
     <div class="middle1_left">
     昨日收益</br>
     ${user.name}
     </div>
     <div class="middle1_right">
     累计总收益</br>
     ${user.name}
     </div>
  </div>
<!-- 明细列表 -->
        <div class="middle2">
            <div class="col-md-12">
                <table class="table table-hover">
                    <tr>
                        <th>编号</th>
                        <th>产品名</th>
                        <th>累计收益</th>
                    </tr>
                    <c:forEach items="${pageInfo.list }" var="user">
                        <tr>
                        <td>${user.id}</td>
                        <td>${user.name }</td>
                        <td>${user.age }</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
       </div>
</body>
</html>