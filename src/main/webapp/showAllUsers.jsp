<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

    <c:forEach items="${requestScope.users}" var="user">
        ${user.id}
        ${user.name}
        ${user.age}
        ${user.bir}<br/>
    </c:forEach>
</body>
</html>
