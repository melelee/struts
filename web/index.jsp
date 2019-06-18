<%--
  Created by IntelliJ IDEA.
  User: melelee
  Date: 2019/6/18
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
</head>
<body>
<form action="/login.do" method="post">
  UserName:<input type="text" name="username"/><br><br>
  Password:<input type="password" name="password"/><br><br>
  <input type="submit" value="Login"/>
</form>
</body>
</html>
