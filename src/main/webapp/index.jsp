<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authentication and Authorization</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width">
</head>
<body bgcolor="#90ee90">
<form method="get" action="userServlet">
    <table>
        <tr>
            <td>
                <b>Name:</b>
            </td>
            <td>
                <input type="text" name="name"/><br/>
            </td>
        </tr>
        <tr>
            <td>
                <b>Password:</b>
            </td>
            <td>
                <input type="password" name="password"/><br/>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>
                <input type="submit" value="Log in">
            </td>
        </tr>
    </table>
</form>
</body>
</html>