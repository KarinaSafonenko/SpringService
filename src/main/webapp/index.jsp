<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form>
    Локальные сети предстали перед Вами!
</form>
<form action="<c:url value="/add"/>" method="get">
    <input type="submit" value="Добавить">
</form>
<form action="<c:url value="/change"/>" method="get">
    <input type="submit" value="Обновить">
</form>
<form action="<c:url value="/remove"/>" method="get">
    <input type="submit" value="Удалить">
</form>
<form action="<c:url value="/getLocalNetworks"/>" method="get">
    <input type="submit" value="Просмотреть">
</form>
</body>
</html>
