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
                        <th></th>
                        <th>Username</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${users}">
                        <tr>
                            <form:form action="/users/${user.id}">
                                <td><button type="submit" name="_method" value="GET">View</button></td>
                                <td><input type="text" name="userName" value="${user.userName}" /></td>
                                <td><input type="text" name="firstName" value="${user.firstName}" /></td>
                                <td><input type="text" name="lastName" value="${user.lastName}" /></td>
                                <td><button type="submit" name="_method" value="PUT">Update</button></td>
                                <td><button type="submit" name="_method" value="DELETE">Delete</button></td>
                            </form:form>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div>
            <h3>Create an Account</h3>
            <form:form modelAttribute="user" method="POST" action="/users">
                <label for="userName">Username:</label>
                <form:input path="userName"/><br>
                <label for="firstName">First Name:</label>
                <form:input path="firstName"/><br>
                <label for="lastName">Last Name:</label>
                <form:input path="lastName"/><br>
                <button type="submit" value="Submit">Submit</button>
            </form:form>
        </div>
    </body>
</html>