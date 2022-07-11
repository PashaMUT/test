<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>Log in</title>
    <#setting locale="ru_RU"/>
    <link href="payment-form.css" rel="stylesheet">
</head>
<body>
<form action="action_page.php">
    <div class="container">
        <h1>Register</h1>
        <hr>
        <div>
            <label for="login"><b>Login</b></label>
            <input type="text" placeholder="Enter login" name="name" required>
        </div>
        <div>
            <label for="email"><b>Email</b></label>
            <input type="text" placeholder="Enter Email" name="email" required>
        </div>
        <div>
            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required>
        </div>
        <div>
            <label for="psw-repeat"><b>Repeat Password</b></label>
            <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
        </div>
        </hr>
        <div>
            <button type="submit" class="registerbtn" >Register</button>
        </div>
    </div>
</form>
</body>
</html>