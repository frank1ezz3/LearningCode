<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/2/21
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //改这里是为了让所有同ip地址的人都可以访问这个网页，如果不改，一些前端的东西可能不能访问会变成垃圾网页（但不一定会报错）
    String basePath = request.getScheme()//                     http
            + "://"
            + request.getServerName()   //自己的IP               192.168.0.108
            + ":"
            + request.getServerPort()  //服务器ip、端口号          8080
            + request.getContextPath() //服务器路径               book
            + "/";
    pageContext.setAttribute("basePath",basePath);
%>
<!--写base标签，永远固定相对路径跳转的结果-->
<base href="<%=basePath%>">

<link type="text/css" rel="stylesheet" href="static/css/style.css" >
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>