<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Clients Table</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
    <style>
        table {
            display:block;
            width:177px;
            margin:20px auto;
        }
    </style>
</head>
<body>
<div> <center>
    <fieldset>
        <legend>Add Clients</legend>
        <form name="clients" action="" method="POST">
            <table>
            <tr>
            <td>Surname: </td> <td><@spring.formInput "clientsForm.surname" "" "text"/> </td>
            </tr>
            <tr>
                <td>Name:</td><td><@spring.formInput "clientsForm.name" "" "text"/></td>
            </tr>
            <tr>
                <td>Futhername:</td><td><@spring.formInput "clientsForm.fatherName" "" "text"/></td>
            </tr>
            <tr>
                <td>Address:</td><td><@spring.formInput "clientsForm.address" "" "text"/></td>
            </tr>
            <tr>
                <td>Telephone:</td><td><@spring.formInput "clientsForm.telephone" "" "text"/></td>
            </tr>

            </table>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
    </center>
</div>
</body>
</html>
