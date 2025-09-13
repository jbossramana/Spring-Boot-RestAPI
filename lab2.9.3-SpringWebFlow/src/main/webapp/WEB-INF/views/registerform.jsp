<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body>
<h2>Register - Step 1</h2>
<form:form modelAttribute="user" method="post">
    Name: <form:input path="name"/><br/>
    Email: <form:input path="email"/><br/>
    <input type="submit" name="_eventId_next" value="Next"/>
</form:form>
</body>
</html>
