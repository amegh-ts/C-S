<html>
<body>
<h2>perfect abundant or deficient</h2>
<form action =" " method="POST">
enter number<input type="text" name="num">
<input type="submit">
</form>
</body>
</html>
<?php
if($_POST)
{
$num=$_POST['num'];
$sum=0;
for($i=1;$i<$num;$i++)
{
if($num%$i==0)
$sum=$sum+$i;
}
if($sum==$num)
echo"perfect number";
else if($sum>$num)
echo"abundant number";
else
echo"deficient number";
}
?>
 