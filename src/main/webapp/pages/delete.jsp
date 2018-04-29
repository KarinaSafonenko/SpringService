<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Удаление локальной сети</title>
</head>
<body>
<form action="<c:url value="/removeLocalNetwork"/>" method="post">
    <input type="text" placeholder="id" title="idName" name="id">
    <input type="submit">
</form>
</body>
</html>
