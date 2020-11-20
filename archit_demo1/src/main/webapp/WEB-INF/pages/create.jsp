<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>餐廳管理系統注册頁面</h3>
    <form action="create" method="post">
        Type(customer/administrator): <input type="text" name="type"/><br/>
        ID: <input type="text" name="id"/><br/>
        Name: <input type="text" name="name"/><br/>
        Password: <input type="text" name="password"/><br/>
        Safe Answer: <input type="text" name="safeAns"/><br/>
        <input type="submit" name="submit"/>
    </form>
</html>