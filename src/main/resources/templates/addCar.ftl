<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Car Table</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div>
    <fieldset>
        <legend>Add Car</legend>
        <form name="car" action="" method="POST">
        <table>
            <tr>
            <td>Name: </td><td><@spring.formInput "carForm.brand" "" "text"/></td>
            </tr>
            <tr>
                <td>Price</td><td><@spring.formInput "carForm.price" "" "text"/></td>
            </tr>
            <tr>
                <td>Rental Price</td><td><@spring.formInput "carForm.rentalPrice" "" "text"/></td>
            </tr>
            <tr>
                <td>Type</td><td><@spring.formInput "carForm.type" "" "text"/></td>
            </tr>
        </table>
            <input type="submit" value="Save"/>
        </form>
    </fieldset>
</div>
</body>
</html>
