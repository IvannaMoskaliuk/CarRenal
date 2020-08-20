<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
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
        <legend>Add Issued Cars</legend>
        <form name="issuedcars" action="" method="POST">
            <table>
                <tr>
                    <td>Car ID:</td><td><@spring.formSingleSelect "issuedCarsForm.car", cars, ""/></td>
                <tr>
                    <td> Client ID:</td><td><@spring.formSingleSelect "issuedCarsForm.clients", clients, "text"/> </td>
                <tr>
                    <td>Issued Date:</td><td><@spring.formInput "issuedCarsForm.issuedDate" "" "text"/></td>
                <tr>
                    <td>Return Date:</td><td><@spring.formInput "issuedCarsForm.returnDate" "" "text"/></td>
                </tr>
            </table>
                <input type="submit" value="Create"/>
        </form>
    </fieldset>
    </center>
</div>
</body>
</html>
