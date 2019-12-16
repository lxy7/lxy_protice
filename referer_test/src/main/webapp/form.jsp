<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form 表单</title>
</head>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
 //前端防止重复点按钮，多次提交
 var flag = false;//表单没有提交
 function isSubmit(){
	 if(!falg){
		 flag = true;
		 return true;
	 }
	 return false;
 }
</script>
<body>
<form action="${pageContext.request.contextPath}/form" onsubmit="return isSubmit()">
用户名：<input type="text" name="userName">
<input type="submit" value="提交" id="submit">
</form>
</body>
</html>