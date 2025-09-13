<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Task List</title>
</head>
<body>
<h2>Tasks</h2>

<form action="${pageContext.request.contextPath}/tasks/add" method="post">
    <input type="text" name="description" placeholder="New task" required />
    <button type="submit">Add</button>
</form>

<ul>
    <c:forEach var="task" items="${tasks}">
        <li>
            ${task.description} 
            <a href="${pageContext.request.contextPath}/tasks/delete/${task.id}">[Delete]</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
