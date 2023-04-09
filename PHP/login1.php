<html>
<body>
<form method="post">
<fieldset>
Name<input type="text" name="username" required><br><br>
Password<input type="password" name="password" required><br><br>
<input type="submit" name="submit">
</fieldset><br>
</form>
</body>
</html>
<?php
if(isset($_POST["submit"]))
{
	$un=$_POST["username"];
	$pw=$_POST["password"];
	$con=pg_connect("host=localhost dbname=loginx port=5432 user=postgres password=amz");
	echo $con;
	$r=pg_query($con,"select * from student where username='$un' and password='$pw'");
	if($n)
	{
		echo "login successful"; 
	}
	else
	{
		echo "please try again";
	}
}
?>