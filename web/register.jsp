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
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        onload = function () {
            var input = document.getElementsByTagName("input")[0];
            var input1 = document.getElementsByTagName("input")[1];
            var input2 = document.getElementsByTagName("input")[2];
            var span = document.getElementsByTagName("span")[0];
            var span1 = document.getElementsByTagName("span")[1];
            var span2 = document.getElementsByTagName("span")[2];
            input.onblur = function (){
                if(input.value == ""){
                    span.innerHTML = "<font color='red'>用户名不能为空</font>"
                }
                if(input.value != ""){
                    span.innerHTML = "<font color='green'></font>"
                }
            }
            input.onfocus = function(){
                if(input.value != ""){
                    span.innerHTML = "<font color='green'></font>"
                }
            }
            input1.onblur = function (){
                if(input1.value == ""){
                    span1.innerHTML = "<font color='red'>密码不能为空</font>"
                }
                if(input1.value != ""){
                    span1.innerHTML = "<font color='red'></font>"
                }
            }
            input1.onfocus = function(){
                if(input1.value != ""){
                    span1.innerHTML = "<font color='red'></font>"
                }
            }
            input2.onblur = function () {
                if(input2.value != input1.value){
                    span2.innerHTML = "<font color='red'>两次密码不一致</font>"
                }
                if(input2.value == input1.value){
                    span2.innerHTML = "<font color='red'></font>"
                }
            }
            input2.onfocus = function (){
                if(input2.value == input1.value){
                    span2.innerHTML = "<font color='red'></font>"
                }
            }
        }
    </script>
</head>
<body>
    <form action="RegisterServlet" method="post"/>
        用户名:<input type="text" name="username"><span></span><br/>
        密码:<input type="text" name="password"><span></span><br/>
        确认密码:<input type="text" name="repassword"><span></span><br/>
        <input type="submit" value="登录">
        <input type="reset" value="重置">
    </form>
</body>
</html>
