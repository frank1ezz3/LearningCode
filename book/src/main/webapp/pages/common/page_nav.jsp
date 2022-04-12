<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/8
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--分页条的开始--%>
<div id="page_nav">
    <%--大于首页，才显示--%>
    <c:if test="${requestScope.page.pageNo > 1}">
        <a href="${ requestScope.page.url }&pageNo=1">首页</a>
        <a href="${ requestScope.page.url }&pageNo=${requestScope.page.pageNo-1}">上一页</a>
    </c:if>
    <%--页码输出的开始--%>
    <c:choose>
        <%--情况1：如果总页码小于等于5的情况，页码的范围是：1-总页码--%>
        <c:when test="${ requestScope.page.pageTotal <= 5 }">
            <c:set var="begin" value="1"/>
            <c:set var="end" value="${requestScope.page.pageTotal}"/>
        </c:when>
        <%--情况2：总页码大于5的情况--%>
        <c:when test="${requestScope.page.pageTotal > 5}">
            <c:choose>
                <%--小情况1：当前页码为前面3个：1，2，3的情况，页码范围是：1-5.--%>
                <c:when test="${requestScope.page.pageNo <= 3}">
                    <c:set var="begin" value="1"/>
                    <c:set var="end" value="5"/>
                </c:when>
                <%--小情况2：当前页码为最后3个，8，9，10，页码范围是：总页码减4 - 总页码--%>
                <c:when test="${requestScope.page.pageNo > requestScope.page.pageTotal-3}">
                    <c:set var="begin" value="${requestScope.page.pageTotal-4}"/>
                    <c:set var="end" value="${requestScope.page.pageTotal}"/>
                </c:when>
                <%--小情况3：4，5，6，7，页码范围是：当前页码减2 - 当前页码加2--%>
                <c:otherwise>
                    <c:set var="begin" value="${requestScope.page.pageNo-2}"/>
                    <c:set var="end" value="${requestScope.page.pageNo+2}"/>
                </c:otherwise>
            </c:choose>
        </c:when>
    </c:choose>

    <c:forEach begin="${begin}" end="${end}" var="i">
        <c:if test="${i == requestScope.page.pageNo}">
            【${i}】
        </c:if>
        <c:if test="${i != requestScope.page.pageNo}">
            <a href="${ requestScope.page.url }&pageNo=${i}">${i}</a>
        </c:if>
    </c:forEach>
    <%--页码输出的结束--%>


    <%-- 如果已经 是最后一页，则不显示下一页，末页 --%>
    <c:if test="${requestScope.page.pageNo < requestScope.page.pageTotal}">
        <a href="${ requestScope.page.url }&pageNo=${requestScope.page.pageNo+1}">下一页</a>
        <a href="${ requestScope.page.url }&pageNo=${requestScope.page.pageTotal}">末页</a>
    </c:if>

    共${ requestScope.page.pageTotal }页，${ requestScope.page.pageTotalCount }条记录
    到第<input value="${param.pageNo}" name="pn" id="pn_input"/>页
    <input id="searchPageBtn" type="button" value="确定">

    <script type="text/javascript">

        $(function () {
            // 跳到指定的页码
            $("#searchPageBtn").click(function () {

                var pageNo = $("#pn_input").val();

                <%--var pageTotal = ${requestScope.page.pageTotal};--%>
                <%--alert(pageTotal);--%>

                // javaScript语言中提供了一个location地址栏对象
                // 它有一个属性叫href.它可以获取浏览器地址栏中的地址
                // href属性可读，可写
                location.href = "${pageScope.basePath}${ requestScope.page.url }&pageNo=" + pageNo;

            });
        });

    </script>

</div>
<%--分页条的结束--%>















<%-- next is mine--%>

<%--	分页条的开始	--%>

<%--<div id="page_nav">--%>
<%--    &lt;%&ndash;	上一页必须大于1才能显示		&ndash;%&gt;--%>
<%--    <c:if test="${requestScope.page.pageNo>1}">--%>
<%--        <a href="${requestScope.page.url }&pageNo=1">首页</a>--%>
<%--        <a href="${requestScope.page.url }&pageNo=${requestScope.page.pageNo-1}">上一页</a>--%>
<%--    </c:if>--%>




<%--    &lt;%&ndash;页码输出的开始&ndash;%&gt;--%>






<%--    <c:choose>--%>
<%--        &lt;%&ndash;情况1：如果总页码小于等于5的情况，页码的范围是：1-总页码&ndash;%&gt;--%>
<%--        <c:when test="${ requestScope.page.pageTotal <= 5 }">--%>
<%--            <c:set var="begin" value="1"/>--%>
<%--            <c:set var="end" value="${requestScope.page.pageTotal}"/>--%>
<%--            &lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--            &lt;%&ndash;					<c:forEach begin="1" end="${requestScope.page.pageTotal}" var="i">&ndash;%&gt;--%>
<%--            &lt;%&ndash;						<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--            &lt;%&ndash;							【${i}】&ndash;%&gt;--%>
<%--            &lt;%&ndash;						</c:if>&ndash;%&gt;--%>

<%--            &lt;%&ndash;						<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--            &lt;%&ndash;							<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--            &lt;%&ndash;						</c:if>&ndash;%&gt;--%>

<%--            &lt;%&ndash;					</c:forEach>&ndash;%&gt;--%>
<%--        </c:when>--%>

<%--        &lt;%&ndash;情况2：总页码大于5的情况&ndash;%&gt;--%>
<%--        <c:when test="${requestScope.page.pageTotal > 5}">--%>
<%--            <c:choose>--%>
<%--                &lt;%&ndash;小情况1：当前页码为前面3个：1，2，3的情况，页码范围是：1-5.&ndash;%&gt;--%>
<%--                <c:when test="${requestScope.page.pageNo <= 3}">--%>

<%--                    <c:set var="begin" value="1"/>--%>
<%--                    <c:set var="end" value="5"/>--%>

<%--                    &lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--                    &lt;%&ndash;							<c:forEach begin="1" end="5" var="i">&ndash;%&gt;--%>
<%--                    &lt;%&ndash;								<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--                    &lt;%&ndash;									【${i}】&ndash;%&gt;--%>
<%--                    &lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--                    &lt;%&ndash;								<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--                    &lt;%&ndash;									<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--                    &lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--                    &lt;%&ndash;							</c:forEach>&ndash;%&gt;--%>


<%--                </c:when>--%>
<%--                &lt;%&ndash;小情况2：当前页码为最后3个，8，9，10，页码范围是：总页码减4 - 总页码&ndash;%&gt;--%>
<%--                <c:when test="${requestScope.page.pageNo>=requestScope.page.pageTotal-3}">--%>

<%--                    <c:set var="begin" value="${requestScope.page.pageTotal-4}"/>--%>
<%--                    <c:set var="end" value="${requestScope.page.pageTotal}"/>--%>
<%--                    &lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--                    &lt;%&ndash;							<c:forEach begin="${requestScope.page.pageTotal-4}" end="${requestScope.page.pageTotal}" var="i">&ndash;%&gt;--%>
<%--                    &lt;%&ndash;								<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--                    &lt;%&ndash;									【${i}】&ndash;%&gt;--%>
<%--                    &lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--                    &lt;%&ndash;								<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--                    &lt;%&ndash;									<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--                    &lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--                    &lt;%&ndash;							</c:forEach>&ndash;%&gt;--%>


<%--                </c:when>--%>
<%--                &lt;%&ndash;小情况3：4，5，6，7，页码范围是：当前页码减2 - 当前页码加2&ndash;%&gt;--%>
<%--                <c:otherwise>--%>

<%--                    <c:set var="begin" value="${requestScope.page.pageNo-2}"/>--%>
<%--                    <c:set var="end" value="${requestScope.page.pageNo+2}"/>--%>
<%--                    &lt;%&ndash;			上面是第一次优化		&ndash;%&gt;--%>
<%--                    &lt;%&ndash;							<c:forEach begin="${requestScope.page.pageNo-2}" end="${requestScope.page.pageNo+2}" var="i">&ndash;%&gt;--%>
<%--                    &lt;%&ndash;								<c:if test="${i==requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--                    &lt;%&ndash;									【${i}】&ndash;%&gt;--%>
<%--                    &lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--                    &lt;%&ndash;								<c:if test="${i!=requestScope.page.pageNo}">&ndash;%&gt;--%>
<%--                    &lt;%&ndash;									<a href="${requestScope.page.url }&pageNo=${i}">${i}</a>&ndash;%&gt;--%>
<%--                    &lt;%&ndash;								</c:if>&ndash;%&gt;--%>

<%--                    &lt;%&ndash;							</c:forEach>&ndash;%&gt;--%>


<%--                </c:otherwise>--%>


<%--            </c:choose>--%>
<%--        </c:when>--%>


<%--    </c:choose>--%>

<%--    &lt;%&ndash;			下面是第一次优化 优化前想测试把这个注了		&ndash;%&gt;--%>
<%--    <c:forEach begin="${begin}" end="${end}" var="i">--%>
<%--        <c:if test="${i==requestScope.page.pageNo}">--%>
<%--            【${i}】--%>
<%--        </c:if>--%>

<%--        <c:if test="${i!=requestScope.page.pageNo}">--%>
<%--            <a href="${requestScope.page.url }&pageNo=${i}">${i}</a>--%>
<%--        </c:if>--%>

<%--    </c:forEach>--%>



<%--    &lt;%&ndash;页码输出的结果&ndash;%&gt;--%>




<%--    &lt;%&ndash;		如果已经是最后一页则不显示下一页		&ndash;%&gt;--%>
<%--    <c:if test="${requestScope.page.pageNo<requestScope.page.pageTotal}">--%>
<%--        <a href="${requestScope.page.url }&pageNo=${requestScope.page.pageNo+1}">下一页</a>--%>
<%--        <a href="${requestScope.page.url }&pageNo=${requestScope.page.pageTotal}">末页</a>--%>
<%--    </c:if>--%>

<%--    共${requestScope.page.pageTotal}页，${requestScope.page.pageTotalCount}条记录--%>
<%--    到第<input value="${param.pageNo}" name="pn" id="pn_input"/>页--%>
<%--    <input id="searchPageBtn" type="button" value="确定">--%>

<%--    <script type="text/javascript">--%>

<%--        $(function (){--%>
<%--            //跳到指定的页码--%>
<%--            $("#searchPageBtn").click(function () {--%>

<%--                var pageNo = $("#pn_input").val();--%>

<%--                //下面可以阻挡访问越界的情况，但是一旦有懂行的一下就能破解，所以要到bookServiceImpl——>page里解决--%>

<%--                &lt;%&ndash;if(pageNo<1||pageNo>${requestScope.page.pageTotal}){&ndash;%&gt;--%>
<%--                &lt;%&ndash;	alert("您的输入超出页码范围");&ndash;%&gt;--%>
<%--                &lt;%&ndash;}else{&ndash;%&gt;--%>
<%--                &lt;%&ndash;	location.href = "${pageScope.basePath}${requestScope.page.url }&pageNo="+ pageNo;&ndash;%&gt;--%>
<%--                &lt;%&ndash;}&ndash;%&gt;--%>

<%--                //javaScript语言中提供了一个location地址栏对象--%>
<%--                //他有一个属性叫href，他可以获取浏览器地址中的地址--%>
<%--                //下面可以获取完全一样的地址--%>
<%--                // alert(location.href)--%>
<%--                //下面可以跳转到百度--%>
<%--                // location.href = "http://www.baidu.com"--%>
<%--                location.href = "${pageScope.basePath}${requestScope.page.url }&pageNo="+ pageNo;--%>

<%--            });--%>
<%--        });--%>
<%--    </script>--%>

<%--</div>--%>


<%--	分页条的结束	--%>

