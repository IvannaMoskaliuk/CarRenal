<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Сlients list</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
          crossorigin="anonymous">
    <style>
        body {
            background: darkgray url(https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS4ayKoKF6j8EQptbwYNhdArj_7ZuwFA2ZcOQ&usqp=CAU); /* Фоновый цвет и фоновый рисунок*/
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
<h1> CLIENTS </h1>
</center>
<div>
    <form method="get">
        <input type="text" value="" name= "Search">
        <input type="submit" value="Go" onclick="">
    </form>
    <table class="table table-dark">
        <tr>
            <th>Surname</th>
            <th>Name</th>
            <th>FatherName</th>
            <th>Address</th>
            <th>Telephone</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.surname}</td>
                <td>${item.name}</td>
                <td>${item.fatherName}</td>
                <td>${item.address}</td>
                <td>${item.telephone}</td>
                <td><a href="http://localhost:8080/web/clients/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger"></a>
                </td>
                <td><a href="http://localhost:8080/web/clients/update/${item.id}">
                        <input type="button" value="update" class="btn-primary"></a>
                </td>
            </tr>
        </#list>
    </table>
</div>
<div>
    <br>
    <a href="/web/clients/create">
        <input type="button" value="Create Clients Form" style="
                    background-color: darkgray;
                    border-color: #cccccc;
                    border-radius: 15px;
                    border-width: 7px;
            ">
    </a>
</div>
</body>
</html>
