<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Home - ThoughtPay</title>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    </head>
    <body>
        <h1>ThoughtPay</h1>
        <div>
            <table>
                <thead>
                    <tr>
                        <th>Username</th>
                        <th>First Name</th>
                        <th>Last Name</th
                        <th>Edit</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${users}">
                        <tr>
                            <form:form action="/users/${user.id}/update" method="post">
                                <td><input type="text" name="userName" value="${user.userName}" /></td>
                                <td><input type="text" name="firstName" value="${user.firstName}" /></td>
                                <td><input type="text" name="lastName" value="${user.lastName}" /></td>
                                <td><input type="submit" value="Edit" /></td>
                            </form:form>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>