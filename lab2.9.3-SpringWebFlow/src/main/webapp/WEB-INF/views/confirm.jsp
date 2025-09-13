<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Confirm Registration</h2>
<p>Name: ${user.name}</p>
<p>Email: ${user.email}</p>
<form method="post">
    <input type="submit" name="_eventId_back" value="Back"/>
    <input type="submit" name="_eventId_submit" value="Submit"/>
</form>
</body>
</html>
