<#import "/spring.ftl" as spring/>

<html>
<head>
    <title>Add Person</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div>
    <fieldset>
        <legend>Add Person</legend>
        <form name="person" action="provider" method="POST">
            First Name: <@spring.formInput id="t3" name="searchName" label="Поиск"/>    <br/>
            Last Name: <@spring.formInput "provider.cityprovider" "" "text"/>    <br/>
            <input type="submit" value="Create" />
        </form>
    </fieldset>
</div>


</body>
