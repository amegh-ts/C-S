<html>
<body>
<form  action="" method="post">
<h1>Biodata</h1>
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="n1"><br><br></td>
</tr>
<tr>
<td>Address:</td>
<td><textarea name="adr"></textarea><br><br></td>
</tr>
<tr>
<td>Age:</td>
<td><input type="number" name="age"><br><br></td>
</tr>
<tr>
<td>Phone:</td>
<td><input type="number" name="ph"><br><br></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="text" name="mail"><br><br></td>
</tr>
<tr>
<td>Educational Qualification:</td>
<td><input type="text" name="qlf"><br><br></td>
</tr>

</table>
<input type="submit" value="Submit"><br><br>
</form>
</body>
</html>
<?php
if($_POST)
{
	echo"<h1>BioData</h1>";
	echo "Name:".$_POST["n1"]."<br>";
	echo"Adress:".$_POST["adr"]."<br>";
	echo"Age:".$_POST["age"]."<br>";
	echo"email:".$_POST["mail"]."<br>";
	echo"Qualification:".$_POST["qlf"]."<br>";
}
?>
	
	
	
	
	
