<html>
<body align='center'>
<form method="POST" action="">
regno<"input type="text" name="t1">
<input type="subbmit" value="getresult">
</form>
</body>
</html>
<?Php
if($_POST){
$reg=$_POST["t1"];
echo"<h1 align='center'>MARKLIST</h1>
$con=pg_connect("host=localhost dbname=student user=postgres password=amz");
if($_con)
echo"successfully connected";
$qry="select * from marklist where rolllno=$reg";
$marklist=pg_query($con,$qry);
$nos=pg_num_rows($marklist);
while($row=pg_fetch_rows($marklist)){
echo"<br>";
echo"<table align='center' border='1' cellspacing='0'>
<tr><th>rollno</th><td>$_row[0]</td></tr>
<tr><th>name</th><td>$_row[1]</td></tr>
<tr><th>mark</th><td>$_row[2]</td></tr>
<tr><th>grade</th><td>$_row[3]</td></tr>
</table>";
}
}
?>`