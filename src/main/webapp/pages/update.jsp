<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Обновить локальную сеть</title>
</head>
<body>
<form:form method="post" action="/changeLocalNetwork">
    <table>
        <tr>
            <td><form:label path="id">Id</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="cable">Cable</form:label></td>
            <td><form:input path="cable"/></td>
        </tr>
        <tr>
            <td><form:label path="speed">Speed</form:label></td>
            <td><form:input path="speed"/></td>
        </tr>
        <tr>
            <td><form:label path="standard.name">Standard name</form:label></td>
            <td><form:input path="standard.name"/></td>
        </tr>
        <tr>
            <td><form:label path="standard.land">Standard land</form:label></td>
            <td><form:input path="standard.land"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
