<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>尚硅谷会员注册页面</title>
		<%--	静态包含base标签，css样式，jQuery文件	--%>
		<%@ include file="/pages/common/head.jsp"%>
		<script type="text/javascript">//上面一行是引入JQuery
			// 页面加载完成之后
			$(function () {


				//aJax json请求
				$("#username").blur(function () {
					//1 获取用户名
					var username = this.value;
					$.getJSON("http://localhost:8080/book/userServlet","action=ajaxExistsUsername&username=" + username,function (data) {
						if (data.existsUsername) {
							$("span.errorMsg").text("用户名已存在！");
						} else {
							$("span.errorMsg").text("用户名可用！");
						}
					});
				});





				//给验证码的图片，绑定单机事件
				$("#code_img").click(function (){
					//在事件响应的function函数中有一个this对象。这个this对象，是当前正在响应的dom对象
					//src属性表示验证码img标签的图片路径 他可读可写，可赋值
					//alert(this.src);
					this.src = "${basePath}/kaptcha.jpg?="+new Date();//加时间是为了不让他去缓存中找验证码地址
				});


				// 给注册绑定单击事件
				$("#sub_btn").click(function () {       //通过139行的ID查询注册按钮
					// 验证用户名：必须由字母，数字下划线组成，并且长度为5到12位
					//1 获取用户名输入框里的内容
					var usernameText = $("#username").val();  //通过ID username查找
					//2 创建正则表达式对象
					var usernamePatt = /^\w{5,12}$/; //^表示打头 ， $表示结尾 ， \w表示字母数字下划线 {}里面是数字长度
					//3 使用test方法验证
					if (!usernamePatt.test(usernameText)) {  //不匹配
						//4 提示用户结果
						$("span.errorMsg").text("用户名不合法！");//写在110行 span里

						return false;//因为不合法所以不让他跳转
					}

					// 验证密码：必须由字母，数字下划线组成，并且长度为5到12位
					//1 获取用户名输入框里的内容
					var passwordText = $("#password").val();
					//2 创建正则表达式对象
					var passwordPatt = /^\w{5,12}$/;
					//3 使用test方法验证
					if (!passwordPatt.test(passwordText)) {
						//4 提示用户结果
						$("span.errorMsg").text("密码不合法！");//写在110行 span里

						return false;//因为不合法所以不让他跳转
					}

					// 验证确认密码：和密码相同
					//1 获取确认密码内容
					var repwdText = $("#repwd").val();
					//2 和密码相比较
					if (repwdText != passwordText) {
						//3 提示用户
						$("span.errorMsg").text("确认密码和密码不一致！");//写在110行 span里

						return false;//因为不合法所以不让他跳转
					}

					// 邮箱验证：xxxxx@xxx.com
					//1 获取邮箱里的内容
					var emailText = $("#email").val();
					//2 创建正则表达式对象
					var emailPatt = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
					//3 使用test方法验证是否合法
					if (!emailPatt.test(emailText)) {
						//4 提示用户
						$("span.errorMsg").text("邮箱格式不合法！");//写在110行 span里

						return false;//因为不合法所以不让他跳转
					}

					// 验证码：现在只需要验证用户已输入。因为还没讲到服务器。验证码生成。
					var codeText = $("#code").val();

					//去掉验证码前后空格
					// alert("去空格前：["+codeText+"]")
					codeText = $.trim(codeText);    //api中的方法 去掉前后的空格
					// alert("去空格后：["+codeText+"]")

					if (codeText == null || codeText == "") { //这里先搞一个不能为空串
						//4 提示用户
						$("span.errorMsg").text("验证码不能为空！"); //写在110行 span里

						return false;  //因为不合法所以不让他跳转
					}

					// 去掉错误信息
					$("span.errorMsg").text("");

				});

			});

		</script>
	<style type="text/css">
		.login_form{
			height:420px;
			margin-top: 25px;
		}

	</style>
	</head>
	<body>
		<div id="login_header">
			<img class="logo_img" alt="" src="static/img/logo.gif" >
		</div>

			<div class="login_banner">

				<div id="l_content">
					<span class="login_word">欢迎注册</span>
				</div>

				<div id="content">
					<div class="login_form">
						<div class="login_box">
							<div class="tit">
								<h1>注册夜总会会员</h1>
								<span class="errorMsg">
									<%--				这里是错误信息					--%>
<%--									<%=request.getAttribute("msg")==null?"":request.getAttribute("msg")%>--%>
										<%--         上面是jsp表达式  下面是el表达式     --%>
									${requestScope.msg }
								</span>
							</div>
							<div class="form">
								<!--这个地方写了base路径，还改了xml，所以直接写servlet 还要写一个post请求，请求就能发过去了-->
								<form action="userServlet" method="post">
									<input type="hidden" name="action" value="regist">
									<label>用户名称：</label>
									<input class="itxt" type="text" placeholder="请输入用户名"
											<%--				这里是错误信息					--%>
<%--											value="<%=request.getAttribute("username")==null?"":request.getAttribute("username")%>"--%>
									<%--         上面是jsp表达式  下面是el表达式     --%>
										   value="${requestScope.username}"
										   autocomplete="off" tabindex="1" name="username" id="username" />
									<br />
									<br />
									<label>用户密码：</label>
									<input class="itxt" type="password" placeholder="请输入密码"
										   autocomplete="off" tabindex="1" name="password" id="password" />
									<br />
									<br />
									<label>确认密码：</label>
									<input class="itxt" type="password" placeholder="确认密码"
										   autocomplete="off" tabindex="1" name="repwd" id="repwd" />
									<br />
									<br />
									<label>电子邮件：</label>
									<input class="itxt" type="text" placeholder="请输入邮箱地址"
<%--										   value="<%=request.getAttribute("email")==null?"":request.getAttribute("email")%>"--%>
									<%--         上面是jsp表达式  下面是el表达式     --%>
											value="${requestScope.email}"
										   autocomplete="off" tabindex="1" name="email" id="email" />
									<br />
									<br />
									<label>验证码：</label>
									<input class="itxt" type="text" name="code" style="width: 80px;" id="code"/>
									<img id="code_img" alt="" src="kaptcha.jpg" style="float: right; margin-right: 40px; width:110px;height:30px;">
									<br />
									<br />
									<input type="submit" value="注册" id="sub_btn" />
								</form>
							</div>

						</div>
					</div>
				</div>
			</div>
		<%--   静态包含页脚内容	--%>
		<%@ include file="/pages/common/footer.jsp"%>
	</body>
</html>