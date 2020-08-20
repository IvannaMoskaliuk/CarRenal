<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Issued Car List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
          crossorigin="anonymous">
    <style>
        body {
            background: darkgray url(https://article.images.consumerreports.org/f_auto/prod/content/dam/CRO-Images-2020/Magazine/04April/CR-Magazine-Inline-hero-Top-picks-02-20); /* Фоновый цвет и фоновый рисунок*/
            color: black;
            background-attachment: fixed;
            background-size: 100%;
        }
        table {
            opacity: 0.8; /* Полупрозрачность таблицы */
            filter: alpha(Opacity=50); /*!* Для IE *!*/
        }
        td{
            color: wheat;
        }
    </style>
</head>
<body>
<center>
<h1> List Issued Cars</h1>
</center>
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
                    background-color: firebrick;
                    border-color: maroon;
                    border-radius: 30px;
                    border-width: 10px;
            ">
    </a>
</div>
</body>
</html>
