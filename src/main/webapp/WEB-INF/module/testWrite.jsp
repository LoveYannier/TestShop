<%@ page language="java" pageEncoding="UTF-8"%>

<head>
<title>测试读</title>

<body>
	<h1>测试写功能</h1>
	<form action="icform" method="POST" >
		<table>
			
			<tr>
				<td class="tds">用户名：</td>
				<td>
					<input type="text" name="username"  >
					
				</td>
			
			</tr>
			<tr>
				<td class="tds">密码：</td>
				<td><input type="password" name="password"  >
					
				</td>
			</tr>
			
			<tr>
				<td colspan="3">
					<input type="submit" value="注册用户" onclick="formSubmit('saveMoudle','_self');this.blur();"/>
				</td>
			</tr>
			
		</table>
	</form>
	
</body>
</html>

