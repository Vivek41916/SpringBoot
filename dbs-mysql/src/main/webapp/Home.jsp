<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Welcoem to DBS Bank</h1>
    <form method="POST" action="/userPage">
        <table>
            <tr>
                <td>UserName</td>
                <td>:<input type="text" name="userId" value="${userId}"></td>
            </tr>
            <br>
            <tr>
                <td>Password</td>
                <td>:<input type="text" name="password" value="${password}"></td>
            </tr>
            <br>
        </table>
        <input type="submit">

    </form>
    
</body>
</html>