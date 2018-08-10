<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <form action="" name="buyForm">
    	 产品编号:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="id" name="id" value="${product.id}" disabled="true"/></br>
    	 产品名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="name" name="name" value="${product.name}" disabled="true" /> </br>
                       购买金额(元):&nbsp;<input type="text" id="money" name="money" value=""/></br>
          <input type="button" value="确认购买" onclick="buyProduct()">
    </form>
    <script type="text/javascript">
        function buyProduct() {
        	var buyInfo = {};
        	buyInfo.productId = $("#id").val();
        	buyInfo.productName = $("#name").val();
        	buyInfo.money = $("#money").val();
        	
        	$.ajax({
                url: "<%=basePath %>pro/buyProduct",
                type: 'POST',
                data: buyInfo,
                success: function (data) {
                    if(data > 0){
                    	alert(" 购买成功!");
                    	window.location.href="${path}/per/toTransDetail";	
                    }else{
                    	alert(" 购买失败，请检查...");
                    }
                }
            })
        }
    </script>
</body>
</html>