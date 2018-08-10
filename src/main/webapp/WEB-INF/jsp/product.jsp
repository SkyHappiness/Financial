<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
.start{
float:right;
font-size:20px;
color:blue;
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
                  <div class="start" >
                   <a href="../index.jsp">回到首页</a>
                   </div>
            </div>
</div>
<!-- 搜索栏-->
 <div class="search">
    <div class="row">
        <div class="col-md-6">
            <div class="input-group">
                <input type="text" id="keyword" name="keyword" class="search" placeholder="请输入产品名" >
                <span class="input-group-btn">
                    <button class="btn btn-primary" id= "search" type="button">搜索</button>
                </span>
                <script type="text/javascript">
					$("#search").on("click",function(){
					var searchName = $("#keyword").val();
					window.location.href="${path}/pro/searchInfo?productName="+searchName;	
  				})

</script>
            </div>
        </div>
    </div>
</div>
<!-- 产品列表 -->
        <div class="row">
            <div class="col-md-12">
                <table class="table table-hover">
                    <tr>
                        <th>产品编号</th>
                        <th>产品名</th>
                        <th>七日年化收益</th>
                        <th>万份收益</th>
                        <th>投资期限</th>
                    </tr>
                    <c:forEach items="${pageInfo.list}" var="product">
                        <tr>
                        <td>${product.id}</td>
                        <td>${product.name}</td>
                        <td>${product.yearPro}</td>
                        <td>${product.dayPro}</td>
                        <td>${product.timeLong}</td>
                        <td><a href="${path}/pro/toProductdetail?id=${product.id}">详情</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        
        
        <hr style="height:1px;border:none;border-top:1px solid #ccc;" />
        <!-- 分页导航栏 -->

        <!-- 分页信息 -->
        <div class="row">
            <!-- 分页文字信息，其中分页信息都封装在pageInfo中 -->
            <div class="col-md-6">
                 当前第${pageInfo.pageNum}页，总共${pageInfo.pages}页，总共${pageInfo.total}条记录
            </div>

        <!-- 分页条 -->
            <div class="col-md-6">
                <nav aria-label="Page navigation">
                  <ul class="pagination">
                    <li><a href="${path}/pro/productInfo?pn=1">首页</a></li>&nbsp;&nbsp;
                    <c:if test="${pageInfo.hasPreviousPage }">
                         <li>
                          <a href="${path}/pro/productInfo?pn=${pageInfo.pageNum-1}" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                          </a>
                        </li>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                        <c:if test="${page_Num == pageInfo.pageNum }">
                            <li class="active"><a href="#">${ page_Num}</a></li>&nbsp;&nbsp;
                        </c:if>
                        <c:if test="${page_Num != pageInfo.pageNum }">
                            <li><a href="${path}/pro/productInfo?pn=${ page_Num}">${page_Num}</a></li>&nbsp;&nbsp;
                        </c:if>
                    </c:forEach> 
                    <c:if test="${pageInfo.hasNextPage }">
                        <li>
                          <a href="${path}/pro/productInfo?pn=${pageInfo.pageNum+1}" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>&nbsp;&nbsp;
                          </a>
                        </li>
                    </c:if>   
                    <li><a href="${path}/pro/productInfo?pn=${pageInfo.pages}">末页</a></li>
                  </ul>
                </nav>
            </div>
        </div>
    </div>
</body>
</html>
