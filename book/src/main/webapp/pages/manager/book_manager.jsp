<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书管理</title>
	<%--	静态包含base标签，css样式，jQuery文件	--%>
	<%@ include file="/pages/common/head.jsp"%>
	<script type="text/javascript">
		$(function () {
			//给删除的a标签绑定单击事件，用于删除的确认提示操作
			$("a.deleteClass").click(function () {
				//在时间的function函数中有一个this对象，是当前正在响应时间的dom对象
				/**
				 * confirm是确认提示框架
				 * 参数是他的提示方式
				 * 他有两个按钮，一个确认，一个取消
				 * 返回true表示点击了确认 ，反正
				 */
				return confirm("确定要删除[ " + $(this).parent().parent().find("td:first").text() +  " ]么？")//去两个父元素再查找后代里的内容

				// return false//阻止元素的默认行为==不提交请求      默认就是false
			});
		});
	</script>
</head>
<body>
	
	<div id="header">
			<img class="logo_img" alt="" src="../../static/img/logo.gif" >
			<span class="wel_word">图书管理系统</span>
		<%--	静态包含 manager管理模块的菜单	--%>
		<%@ include file="/pages/common/manager_menu.jsp"%>
	</div>
	
	<div id="main">
		<table>
			<tr>
				<td>名称</td>
				<td>价格</td>
				<td>作者</td>
				<td>销量</td>
				<td>库存</td>
				<td colspan="2">操作</td>
			</tr>

			<c:forEach items="${requestScope.page.items}" var="book">
				<tr>
					<td>${book.name}</td>
					<td>${bok.price}</td>23
					<td>${book.author}</td>
					<td>${book.sales}</td>
					<td>${book.stock}</td>
					<td><a href="manager/bookServlet?action=getBook&id=${book.id}&pageNo=${requestScope.page.pageNo}">修改</a></td>
					<td><a class="deleteClass" href="manager/bookServlet?action=delete&id=${book.id}&pageNo=${requestScope.page.pageNo}">删除</a></td>
				</tr>
			</c:forEach>


			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td><a href="pages/manager/book_edit.jsp?pageNo=${requestScope.page.pageTotal}">添加图书</a></td>
			</tr>	
		</table>




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
<%--						&lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--&lt;%&ndash;					<c:forEach begin="1" end="${requestScope.page.pageTotal}" var="i">&ndash;%&gt;--%>
<%--&lt;%&ndash;						<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--&lt;%&ndash;							【${i}】&ndash;%&gt;--%>
<%--&lt;%&ndash;						</c:if>&ndash;%&gt;--%>

<%--&lt;%&ndash;						<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--&lt;%&ndash;							<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--&lt;%&ndash;						</c:if>&ndash;%&gt;--%>

<%--&lt;%&ndash;					</c:forEach>&ndash;%&gt;--%>
<%--				</c:when>--%>

<%--				&lt;%&ndash;情况2：总页码大于5的情况&ndash;%&gt;--%>
<%--				<c:when test="${requestScope.page.pageTotal > 5}">--%>
<%--					<c:choose>--%>
<%--						&lt;%&ndash;小情况1：当前页码为前面3个：1，2，3的情况，页码范围是：1-5.&ndash;%&gt;--%>
<%--						<c:when test="${requestScope.page.pageNo <= 3}">--%>

<%--							<c:set var="begin" value="1"/>--%>
<%--							<c:set var="end" value="5"/>--%>

<%--							&lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--&lt;%&ndash;							<c:forEach begin="1" end="5" var="i">&ndash;%&gt;--%>
<%--&lt;%&ndash;								<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--&lt;%&ndash;									【${i}】&ndash;%&gt;--%>
<%--&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--&lt;%&ndash;								<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--&lt;%&ndash;									<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--&lt;%&ndash;							</c:forEach>&ndash;%&gt;--%>


<%--						</c:when>--%>
<%--						&lt;%&ndash;小情况2：当前页码为最后3个，8，9，10，页码范围是：总页码减4 - 总页码&ndash;%&gt;--%>
<%--						<c:when test="${requestScope.page.pageNo>=requestScope.page.pageTotal-3}">--%>

<%--							<c:set var="begin" value="${requestScope.page.pageTotal-4}"/>--%>
<%--							<c:set var="end" value="${requestScope.page.pageTotal}"/>--%>
<%--							&lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--&lt;%&ndash;							<c:forEach begin="${requestScope.page.pageTotal-4}" end="${requestScope.page.pageTotal}" var="i">&ndash;%&gt;--%>
<%--&lt;%&ndash;								<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--&lt;%&ndash;									【${i}】&ndash;%&gt;--%>
<%--&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--&lt;%&ndash;								<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--&lt;%&ndash;									<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--&lt;%&ndash;							</c:forEach>&ndash;%&gt;--%>


<%--						</c:when>--%>
<%--						&lt;%&ndash;小情况3：4，5，6，7，页码范围是：当前页码减2 - 当前页码加2&ndash;%&gt;--%>
<%--						<c:otherwise>--%>

<%--							<c:set var="begin" value="${requestScope.page.pageNo-2}"/>--%>
<%--							<c:set var="end" value="${requestScope.page.pageNo+2}"/>--%>
<%--							&lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--&lt;%&ndash;							<c:forEach begin="${requestScope.page.pageNo-2}" end="${requestScope.page.pageNo+2}" var="i">&ndash;%&gt;--%>
<%--&lt;%&ndash;								<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--&lt;%&ndash;									【${i}】&ndash;%&gt;--%>
<%--&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--&lt;%&ndash;								<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--&lt;%&ndash;									<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--&lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--&lt;%&ndash;							</c:forEach>&ndash;%&gt;--%>


<%--						</c:otherwise>--%>


<%--					</c:choose>--%>
<%--				</c:when>--%>


<%--			</c:choose>--%>

<%--				&lt;%&ndash;			下面是第一次优化 优化前想测试把这个注了		&ndash;%&gt;--%>
<%--				<c:forEach begin="${begin}" end="${end}" var="i">--%>
<%--					<c:if test="${i==requestScope.page.pageNo}">--%>
<%--						【${i}】--%>
<%--					</c:if>--%>

<%--					<c:if test="${i!=requestScope.page.pageNo}">--%>
<%--						<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>--%>
<%--					</c:if>--%>

<%--				</c:forEach>--%>



<%--			&lt;%&ndash;页码输出的结果&ndash;%&gt;--%>




<%--			&lt;%&ndash;		如果已经是最后一页则不显示下一页		&ndash;%&gt;--%>
<%--			<c:if test="${requestScope.page.pageNo<requestScope.page.pageTotal}">--%>
<%--				<a href="${requestScope.page.url }&pageNo=${requestScope.page.pageNo+1}">下一页</a>--%>
<%--				<a href="${requestScope.page.url }&pageNo=${requestScope.page.pageTotal}">末页</a>--%>
<%--			</c:if>--%>

<%--			共${requestScope.page.pageTotal}页，${requestScope.page.pageTotalCount}条记录--%>
<%--			到第<input value="${param.pageNo}" name="pn" id="pn_input"/>页--%>
<%--			<input id="searchPageBtn" type="button" value="确定">--%>

<%--				<script type="text/javascript">--%>

<%--					$(function (){--%>
<%--						//跳到指定的页码--%>
<%--						$("#searchPageBtn").click(function () {--%>

<%--							var pageNo = $("#pn_input").val();--%>

<%--							//下面可以阻挡访问越界的情况，但是一旦有懂行的一下就能破解，所以要到bookServiceImpl——>page里解决--%>

<%--							&lt;%&ndash;if(pageNo<1||pageNo>${requestScope.page.pageTotal}){&ndash;%&gt;--%>
<%--							&lt;%&ndash;	alert("您的输入超出页码范围");&ndash;%&gt;--%>
<%--							&lt;%&ndash;}else{&ndash;%&gt;--%>
<%--							&lt;%&ndash;	location.href = "${pageScope.basePath}${requestScope.page.url }&pageNo="+ pageNo;&ndash;%&gt;--%>
<%--							&lt;%&ndash;}&ndash;%&gt;--%>

<%--							//javaScript语言中提供了一个location地址栏对象--%>
<%--							//他有一个属性叫href，他可以获取浏览器地址中的地址--%>
<%--							//下面可以获取完全一样的地址--%>
<%--							// alert(location.href)--%>
<%--							//下面可以跳转到百度--%>
<%--							// location.href = "http://www.baidu.com"--%>
<%--							location.href = "${pageScope.basePath}${requestScope.page.url }&pageNo="+ pageNo;--%>

<%--						});--%>
<%--					});--%>
<%--				</script>--%>

<%--		</div>--%>


		<%--	分页条的结束	--%>
	</div>

	<%--   静态包含页脚内容	--%>
	<%@ include file="/pages/common/footer.jsp"%>
</body>
</html>