<html>
<body align="center">
<form action=" " method="post">
<h1>pay slip</h1><br><br>
<table align="center">
<tr><td>Employee name</td>
<td><input type="text" name="nam"></td></tr>
<tr><td>Employee Designation</td>
<td><select name="desig">
<option selected name="desig">
<option selected value="manager">Manager</option>
<option selected value="supervisor">Supervisor</option>
<option selected value="clerk">Clerk</option>
<option selected value="peon">Peon</option>
</td></tr>
<tr><td>Basic Salary</td>
<td><input type="text" name="sal"></td></tr>
<tr><td></td><td><input type="submit" value="SUBMIT">
</td></tr>
</table></form></body></html>
<?php
if($_POST){
$na=$_POST["nam"];
$des=$_POST["desig"];
$basic=$_POST["sal"];
switch($des){
case 'manager':
$ca=1000;
$ea=500;
break;
case 'supervisor':
$ca=750;
$ea=200;
break;
case 'clerk':
$ca=500;
$ea=100;
break;
case 'peon':
$ca=250;
$ea=0;
break;
}
$hra=0.25*$basic;
$gross=$basic+$ca+$ea+$hra;
if($gross<=2000)
$it=$gross;
elseif($gross>2000 && $gross<4000)
$it=($gross*3)/100;
elseif($gross>4000 && $gross<5000)
$it=($gross*5)/100;
elseif($gross>5000)
$it=($gross*5)/100;
$net=$gross-$it;
echo "GROSS SALARY : ".$gross."<br>";
echo "NET SALARY : ".$net;
}
?>