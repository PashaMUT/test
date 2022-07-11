<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->
<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>Provider</title>
    <#setting locale="ru_RU"/>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<h3>Person List</h3>
<a href="addProvider">Add Person</a>
<div class="page-content">
    <section id="featured" class="content-section">
    <table border="1">
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>City</th>
        </tr>
        <#list providers as provider>
            <tr>
                <td><b>${(provider.providerid)}</b></td>
                <td>${(provider.nameprovider)}</td>
                <td>${(provider.cityprovider)}</td>
                <td>
                    <form method="POST">
                        <button type="submit" formaction="/test/provider/del/?providerid=${(provider.providerid)}">Delete</button>
                    </form>
                </td>

            </tr>
        </#list>
     </table>
    </section>
</div>
</body>
</html>