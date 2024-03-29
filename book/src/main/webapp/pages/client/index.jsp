<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>书城首页</title>
	<%--	静态包含base标签，css样式，jQuery文件	--%>
	<%@ include file="/pages/common/head.jsp"%>


	<Script type="text/javascript">
		$(function () {
			// 给加入购物车按钮绑定单击事件
			$("button.addToCart").click(function () {
				/**
				 * 在事件响应的function函数 中，有一个this对象，这个this对象，是当前正在响应事件的dom对象
				 * @type {jQuery}
				 */
				var bookId = $(this).attr("bookId");
				location.href = "http://localhost:8080/book/cartServlet?action=addItem&id=" + bookId;


				// 发ajax请求，添加商品到购物车
				$.getJSON("http://localhost:8080/book/cartServlet","action=ajaxAddItem&id=" + bookId,function (data) {
					$("#cartTotalCount").text("您的购物车中有 " + data.totalCount + " 件商品");
					$("#cartLastName").text(data.lastName);
				})




			});
		});
	</Script>




</head>
<body>

	<div id="header">
			<img class="logo_img" alt="" src="static/img/logo.gif" >
			<span class="wel_word">网上书城</span>
			<div>
				<%--		如果用户没有登录，显示      登录和注册的菜单		--%>
				<c:if test="${empty sessionScope.user}">

					<a href="pages/user/login.jsp">登录</a>
					<a href="pages/user/regist.jsp">注册</a> &nbsp;&nbsp;

				</c:if>

				<%--		登录的情况下		则显示登录成功后的用户信息	--%>
				<c:if test="${not empty sessionScope.user}">

					<span>欢迎<span class="um_span">${sessionScope.user.username}</span>光临网上书店</span>
					<a href="pages/order/order.jsp">我的订单</a>
					<a href="userServlet?action=logout">注销</a>

				</c:if>

				<a href="pages/cart/cart.jsp">购物车</a>
				<a href="pages/manager/manager.jsp">后台管理</a>
			</div>
	</div>
	<div id="main">
		<div id="book">
			<div class="book_cond">
				<form action="client/bookServlet" method="get">
					<input type="hidden" name="action" value="pageByPrice">
					价格：<input id="min" type="text" name="min" value="${param.min}"> 元 -
						<input id="max" type="text" name="max" value="${param.max}"> 元
						<input type="submit" value="查询" />
				</form>
			</div>
			<div style="text-align: center">

				<c:if test="${empty sessionScope.cart.items}">
					<%--		购物车为空的输出			--%>
					<span id="cartTotalCount"></span>
					<div>
						<span style="color: red" id="cartLastName">快去买点东西傻狗！</span>
					</div>
				</c:if>
				<c:if test="${not empty sessionScope.cart.items}">
					<%--		购物车为非空的输出			--%>
					<span id="cartTotalCount">您的购物车中有${sessionScope.cart.totalCount}件商品</span>
					<div>
						您刚刚将<span style="color: red" id="cartLastName">${sessionScope.lastName}</span>加入到了购物车中
					</div>
				</c:if>

			</div>

			<%--	开始		--%>
			<c:forEach items="${requestScope.page.items}" var="book">
			<div class="b_list">
				<div class="img_div">
					<img class="book_img" alt="" src="${book.imgPath}" />
				</div>
				<div class="book_info">
					<div class="book_name">
						<span class="sp1">书名:</span>
						<span class="sp2">${book.name}</span>
					</div>
					<div class="book_author">
						<span class="sp1">作者:</span>
						<span class="sp2">${book.author}</span>
					</div>
					<div class="book_price">
						<span class="sp1">价格:</span>
						<span class="sp2">￥${book.price}</span>
					</div>
					<div class="book_sales">
						<span class="sp1">销量:</span>
						<span class="sp2">${book.sales}</span>
					</div>
					<div class="book_amount">
						<span class="sp1">库存:</span>
						<span class="sp2">${book.stock}</span>
					</div>
					<div class="book_add">
						<button bookId="${book.id}" class="addToCart">加入购物车</button>
					</div>
				</div>
			</div>
			</c:forEach>
			<%--	结束		--%>


		</div>

		<%--	静态包含	--%>
		<%@include file="/pages/common/page_nav.jsp"%>


<%--	见page_nav.jsp	--%>
		<%--	分页条的开始	--%>

<%--		<div id="page_nav">--%>
<%--			&lt;%&ndash;	上一页必须大于1才能显示		&ndash;%&gt;--%>
<%--			<c:if test="${requestScope.page.pageNo>1}">--%>
<%--				<a href="${requestScope.page.url }&pageNo=1">首页</a>--%>
<%--				<a href="${requestScope.page.url }&pageNo=${requestScope.page.pageNo-1}">上一页</a>--%>
<%--			</c:if>--%>




<%--			&lt;%&ndash;页码输出的开始&ndash;%&gt;--%>






<%--			<c:choose>--%>
<%--				&lt;%&ndash;情况1：如果总页码小于等于5的情况，页码的范围是：1-总页码&ndash;%&gt;--%>
<%--				<c:when test="${ requestScope.page.pageTotal <= 5 }">--%>
<%--					<c:set var="begin" value="1"/>--%>
<%--					<c:set var="end" value="${requestScope.page.pageTotal}"/>--%>
<%--					&lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--					&lt;%&ndash;					<c:forEach begin="1" end="${requestScope.page.pageTotal}" var="i">&ndash;%&gt;--%>
<%--					&lt;%&ndash;						<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--					&lt;%&ndash;							【${i}】&ndash;%&gt;--%>
<%--					&lt;%&ndash;						</c:if>&ndash;%&gt;--%>

<%--					&lt;%&ndash;						<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--					&lt;%&ndash;							<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--					&lt;%&ndash;						</c:if>&ndash;%&gt;--%>

<%--					&lt;%&ndash;					</c:forEach>&ndash;%&gt;--%>
<%--				</c:when>--%>

<%--				&lt;%&ndash;情况2：总页码大于5的情况&ndash;%&gt;--%>
<%--				<c:when test="${requestScope.page.pageTotal > 5}">--%>
<%--					<c:choose>--%>
<%--						&lt;%&ndash;小情况1：当前页码为前面3个：1，2，3的情况，页码范围是：1-5.&ndash;%&gt;--%>
<%--						<c:when test="${requestScope.page.pageNo <= 3}">--%>

<%--							<c:set var="begin" value="1"/>--%>
<%--							<c:set var="end" value="5"/>--%>

<%--							&lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--							&lt;%&ndash;							<c:forEach begin="1" end="5" var="i">&ndash;%&gt;--%>
<%--							&lt;%&ndash;								<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--							&lt;%&ndash;									【${i}】&ndash;%&gt;--%>
<%--							&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--							&lt;%&ndash;								<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--							&lt;%&ndash;									<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--							&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--							&lt;%&ndash;							</c:forEach>&ndash;%&gt;--%>


<%--						</c:when>--%>
<%--						&lt;%&ndash;小情况2：当前页码为最后3个，8，9，10，页码范围是：总页码减4 - 总页码&ndash;%&gt;--%>
<%--						<c:when test="${requestScope.page.pageNo>=requestScope.page.pageTotal-3}">--%>

<%--							<c:set var="begin" value="${requestScope.page.pageTotal-4}"/>--%>
<%--							<c:set var="end" value="${requestScope.page.pageTotal}"/>--%>
<%--							&lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--							&lt;%&ndash;							<c:forEach begin="${requestScope.page.pageTotal-4}" end="${requestScope.page.pageTotal}" var="i">&ndash;%&gt;--%>
<%--							&lt;%&ndash;								<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--							&lt;%&ndash;									【${i}】&ndash;%&gt;--%>
<%--							&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--							&lt;%&ndash;								<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--							&lt;%&ndash;									<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--							&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--							&lt;%&ndash;							</c:forEach>&ndash;%&gt;--%>


<%--						</c:when>--%>
<%--						&lt;%&ndash;小情况3：4，5，6，7，页码范围是：当前页码减2 - 当前页码加2&ndash;%&gt;--%>
<%--						<c:otherwise>--%>

<%--							<c:set var="begin" value="${requestScope.page.pageNo-2}"/>--%>
<%--							<c:set var="end" value="${requestScope.page.pageNo+2}"/>--%>
<%--							&lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--							&lt;%&ndash;							<c:forEach begin="${requestScope.page.pageNo-2}" end="${requestScope.page.pageNo+2}" var="i">&ndash;%&gt;--%>
<%--							&lt;%&ndash;								<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--							&lt;%&ndash;									【${i}】&ndash;%&gt;--%>
<%--							&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--							&lt;%&ndash;								<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--							&lt;%&ndash;									<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--							&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--							&lt;%&ndash;							</c:forEach>&ndash;%&gt;--%>


<%--						</c:otherwise>--%>


<%--					</c:choose>--%>
<%--				</c:when>--%>


<%--			</c:choose>--%>

<%--			&lt;%&ndash;			下面是第一次优化 优化前想测试把这个注了		&ndash;%&gt;--%>
<%--			<c:forEach begin="${begin}" end="${end}" var="i">--%>
<%--				<c:if test="${i==requestScope.page.pageNo}">--%>
<%--					【${i}】--%>
<%--				</c:if>--%>

<%--				<c:if test="${i!=requestScope.page.pageNo}">--%>
<%--					<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>--%>
<%--				</c:if>--%>

<%--			</c:forEach>--%>



<%--			&lt;%&ndash;页码输出的结果&ndash;%&gt;--%>




<%--			&lt;%&ndash;		如果已经是最后一页则不显示下一页		&ndash;%&gt;--%>
<%--			<c:if test="${requestScope.page.pageNo<requestScope.page.pageTotal}">--%>
<%--				<a href="${requestScope.page.url }&pageNo=${requestScope.page.pageNo+1}">下一页</a>--%>
<%--				<a href="${requestScope.page.url }&pageNo=${requestScope.page.pageTotal}">末页</a>--%>
<%--			</c:if>--%>

<%--			共${requestScope.page.pageTotal}页，${requestScope.page.pageTotalCount}条记录--%>
<%--			到第<input value="${param.pageNo}" name="pn" id="pn_input"/>页--%>
<%--			<input id="searchPageBtn" type="button" value="确定">--%>

<%--			<script type="text/javascript">--%>

<%--				$(function (){--%>
<%--					//跳到指定的页码--%>
<%--					$("#searchPageBtn").click(function () {--%>

<%--						var pageNo = $("#pn_input").val();--%>

<%--						//下面可以阻挡访问越界的情况，但是一旦有懂行的一下就能破解，所以要到bookServiceImpl——>page里解决--%>

<%--						&lt;%&ndash;if(pageNo<1||pageNo>${requestScope.page.pageTotal}){&ndash;%&gt;--%>
<%--						&lt;%&ndash;	alert("您的输入超出页码范围");&ndash;%&gt;--%>
<%--						&lt;%&ndash;}else{&ndash;%&gt;--%>
<%--						&lt;%&ndash;	location.href = "${pageScope.basePath}${requestScope.page.url }&pageNo="+ pageNo;&ndash;%&gt;--%>
<%--						&lt;%&ndash;}&ndash;%&gt;--%>

<%--						//javaScript语言中提供了一个location地址栏对象--%>
<%--						//他有一个属性叫href，他可以获取浏览器地址中的地址--%>
<%--						//下面可以获取完全一样的地址--%>
<%--						// alert(location.href)--%>
<%--						//下面可以跳转到百度--%>
<%--						// location.href = "http://www.baidu.com"--%>
<%--						location.href = "${pageScope.basePath}${requestScope.page.url }&pageNo="+ pageNo;--%>

<%--					});--%>
<%--				});--%>
<%--			</script>--%>

<%--		</div>--%>


		<%--	分页条的结束	--%>

	</div>
	<%--   静态包含页脚内容	--%>
	<%@ include file="/pages/common/footer.jsp"%>
</body>
</html>