<%--
  Created by IntelliJ IDEA.
  User: 54230
  Date: 2019/6/12 0012
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${msg}
<form action="LoginServlet?action=login" method="post"/>
    用户名:<input type="text" name="username"/><br/>
    密码:<input type="text" name="password"/><br/>
    <input type="submit" value="登录">
    <input type="reset" value="重置">
</form>
</body>
</html>
