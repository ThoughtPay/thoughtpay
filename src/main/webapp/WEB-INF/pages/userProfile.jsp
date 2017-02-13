<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Profile</title>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
    <div>
        <p> First Name: ${user.firstName}</p>
        <p> Last Name: ${user.lastName}</p>
        <p> Username: ${user.userName}</p>
    </div>
</body>
</html>
