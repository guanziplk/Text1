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
<body><%
    Object message = request.getAttribute("success");
    if (message != null && !"".equals(message)){
%>
<script type="text/javascript">
    alert("<%=message%>");
</script>
<%}%>
你成功了
</body>
</html>
