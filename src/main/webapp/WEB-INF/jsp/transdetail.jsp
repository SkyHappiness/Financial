<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>


<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.start{
float:right;
font-size:20px;
color:blue;
}
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
                <div class="start" >
                   <a href="../index.jsp">回到首页</a>
                   </div>
            </div>
</div>

<!-- 交易列表 -->
        <div class="row">
            <div class="col-md-12">
                <table class="table table-hover">
                    <tr>
                        <th>购买编号</th>
                        <th>产品名</th>
                        <th>购买金额</th>
                        <th>起息时间</th>
                        <th>到期时间</th>
                    </tr>
                    <c:forEach items="${pageInfo.list}" var="buyInfo">
                        <tr>
                        <td>${buyInfo.buyId}</td>
                        <td>${buyInfo.productName }</td>
                        <td>${buyInfo.money}</td>
                        <td><fmt:formatDate type="both" value="${buyInfo.startTime}" /></td>
                        <td><fmt:formatDate type="both" value="${buyInfo.endTime}" /></td>
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
                    <li><a href="${path}/per/toTransDetail?pn=1">首页</a></li>&nbsp;&nbsp;
                    <c:if test="${pageInfo.hasPreviousPage }">
                         <li>
                          <a href="${path}/per/toTransDetail?pn=${pageInfo.pageNum-1}" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                          </a>
                        </li>
                    </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                        <c:if test="${page_Num == pageInfo.pageNum }">
                            <li class="active"><a href="#">${page_Num}</a></li>&nbsp;&nbsp;
                        </c:if>
                        <c:if test="${page_Num != pageInfo.pageNum }">
                            <li><a href="${path}/per/toTransDetail?pn=${page_Num}">${page_Num}</a></li>&nbsp;&nbsp;
                        </c:if>
                    </c:forEach> 
                    <c:if test="${pageInfo.hasNextPage }">
                        <li>
                          <a href="${path}/per/toTransDetail?pn=${pageInfo.pageNum+1}" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>&nbsp;&nbsp;
                          </a>
                        </li>
                    </c:if>   
                    <li><a href="${path}/per/toTransDetail?pn=${pageInfo.pages}">末页</a></li>
                  </ul>
                </nav>
            </div>
        </div>
    </div>
</body>
</html>
</body>
</html>
