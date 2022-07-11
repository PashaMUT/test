<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>Log in</title>
    <#setting locale="ru_RU"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"/>
</head>
<body>
<form name="logon" action="/test/user/auth" method="post">
    <div class="container">
        <div class="card-body mx-auto">
            <h4 class="card-title mt-3 text-center"><i class="fa fa-lock"></i>Authorization</h4>
            <p class="text-center">Welcom</p>
        <hr>
        <div class="text-center">
        <label for="login"><b>Login</b></label>
        <input type="text" placeholder="Enter login" name="login" required>
        </div>
        <div style="margin-left: 385px; margin-top: 10px">
        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" required>
        </div>
        </hr>
        <div class="text-center" style="margin-top: 10px">
        <button type="submit" style="color: green" class="registerbtn">Login</button>
        </div>
        </div>
    </div>
</form>
</body>
</html>