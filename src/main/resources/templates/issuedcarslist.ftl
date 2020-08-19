<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Issued Car List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
          crossorigin="anonymous">
</head>
<body>
<h1> Hello</h1>
<div>
    <form method="get">
        <input type="text" value="" name= "Search">
        <input type="submit" value="Go" onclick="">
    </form>
    <table class="table table-dark">
        <tr>
            <th>Car</th>
            <th>Clients</th>
            <th>Issued Date</th>
            <th>Return Date</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.car.brand}</td>
                <td>${item.clients.surname}</td>
                <td>${item.issuedDate}</td>
                <td>${item.returnDate}</td>
                <td><a href="http://localhost:8080/web/issuedcars/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger"></a>
                </td>
                <td><a href="http://localhost:8080/web/issuedcars/update/${item.id}">
                        <input type="button" value="update" class="btn-primary"></a>
                </td>
            </tr>
        </#list>
    </table>
</div>
<div>
    <br>
    <a href="/web/issuedcars/create">
        <input type="button" value="Create Issued Cars Form" style="
                    background-color: aquamarine;
                    border-color: aqua;
                    border-radius: 30px;
                    border-width: 10px;
            ">
    </a>
</div>
</body>
</html>
