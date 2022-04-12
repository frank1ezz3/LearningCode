<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/2/21
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
        <%-- 后面没有   --%>
    <span>欢迎<span class="um_span">${sessionScope.user.username}</span>光临网上书店</span>
    <a href="pages/order/order.jsp">我的订单</a>
    <a href="userServlet?action=logout">注销</a>
    <a href="index.jsp">返回商城</a>
</div>
