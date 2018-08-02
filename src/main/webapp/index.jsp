<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<link
    href="${path}/static/bootstrap-4.0.0-dist/css/bootstrap.min.css"
    rel="stylesheet">
<script type="text/javascript"
    src="${path}/static/bootstrap-4.0.0-dist/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
    src="${path}/static/bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>
<meta charset="utf-8">
<!--样式-->
<style type="text/css">
a, address, b, big, blockquote, body, center, cite, code, dd, del, div, dl, dt, em, fieldset, font, form, h1, h2, h3, h4, h5, h6, html, i, iframe, img, ins, label, legend, li, ol, p, pre, small, span, strong, u, ul, var{
    padding: 0;
    margin: 0;
}
 
 
a{
    color: black;
    text-decoration: none;
}
ul{
    list-style: none;
}
 
#tab{
    width: 500px;
    height: 200px;
    border: 1px solid #ddd;
    box-shadow: 0 0 2px #ddd;
    margin: 100px 0 0 100px;
    /*处理超出的内容*/
    overflow: hidden;
}
 
/*选项卡的头部*/
#tab-header{
    background-color: #F7F7F7;
    height: 50px;
    text-align: center;
    position: relative;
}
#tab-header ul{
    width: 500px;
    position: absolute;
    left: -1px;
}
#tab-header ul li{
    float: left;
    width: 248px;
    height: 50px;
    line-height: 50px;
    padding: 0 1px;
    border-bottom: 1px solid #dddddd;
}
#tab-header ul li.selected{
    background-color: white;
    font-weight: bolder;
    border-bottom: 0;
    border-left: 1px solid #dddddd;
    border-right: 1px solid #dddddd;
    padding: 0;
 
}
 
#tab-header ul li:hover{
    color: orangered;
}
 
/*主要内容*/
#tab-content .dom{
    display: none;
}
 
#tab-content .dom ul li{
    float: left;
    /*background-color: red;*/
    margin: 15px 10px;
    width: 225px;
}
 
#tab-content .dom ul li a:hover{
    color: orange;
}
</style>

<!--js-->
<script type="text/javascript">
function $(id){
    return typeof id === 'string' ? document.getElementById(id):id;
}
 
// 当页面加载完毕
window.onload = function(){
    // 拿到所有的标题(li标签) 和 标题对应的内容(div)
    var titles = $('tab-header').getElementsByTagName('li');
    var divs = $('tab-content').getElementsByClassName('dom');
    // 判断
    if(titles.length != divs.length) return;
    // 遍历
    for(var i=0; i<titles.length; i++){
        // 取出li标签
        var li = titles[i];
        li.id = i;
//        console.log(li);
        // 监听鼠标的移动
        li.onmousemove = function(){
            for(var j=0; j<titles.length; j++){
                titles[j].className = '';
                divs[j].style.display = 'none';
            }
            this.className = 'selected';
            divs[this.id].style.display = 'block';
        }
    }
}

</script>
</head>
<body>
<!--主体-->
<div id="tab">
        <!--选项的头部-->
        <div id="tab-header">
            <ul>
                <li class="selected">理财产品</li>
                <li>个人中心</li>
            </ul>
        </div>
        <!--主要内容-->
        <div id="tab-content">
            <div class="dom" style="display: block;">
                <ul>
                    <li>
                    	<a href="${path}/WEB-INF/jsp/product.jsp">点击进入理财产品专区</a></li>   
                </ul>
            </div>
            <div class="dom">
                <ul>
                    <li>
                        <a href="${path}/WEB-INF/jsp/personal.jsp">点击进入个人中心专区</a>
                    </li>  
                </ul>
            </div>
            </div>
        </div>
    </div>
</body>
</html> 
