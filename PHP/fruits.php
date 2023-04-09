<html>
<body>
<form action="" method="POST">
choose any fruit
<select multiple="multiple"name="fruit[]">
<option value ="Grape">Grape</option>
<option value ="Strawberry">Strawberry</option>
<option value ="Apple">Apple</option>
<option value ="Mango">Mango</option>
<option value ="Orange">Orange</option>
<option value ="Banana">Banana</option>
</select><br><br>
<input type="submit" value="select">
</form>
</body>
</html>
<?php
if($_POST)
{
    echo "<h2>You have selected:</h2>";
    foreach($_POST["fruit"] as $a)
    {
        echo $a."<br>";
    }
}
?>

