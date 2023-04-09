<html>
<body>
<form action=" "method="POST">
<table>
<tr><td>Account Number </td>
<td><input type="text" name="acc"></td></td>
<tr><td>Amount</td>
<td><input type="number"name="amt"></td></tr>
<tr>
<th>deposit</th>
<td>
<input type="radio" name="trans" value="deposit">
</td></tr>
<tr>
<th>withdrawal</th>
<td><input type="radio" name="trans" value="withdrawal">
</td></tr>
<tr><td><input type="submit" name="submit" value="submit">
</td>
</tr>
</table>
</form>
</body>
</html>
<?php
if(isset($_POST["submit"]))
{
    $ac=$_POST["acc"];
    $am=$_POST["amt"];
    $trans=$_POST["trans"];
    $con=pg_connect("host=localhost dbname=loginS port=5432 user=postgres password=amz");
    if($trans=="deposit") // Fixed the variable name from $tra to $trans
    {
        $res=pg_query($con,"update bank set balance=(balance+$am) where acc_no=$ac");
    }
    else
    {
        $res=pg_query($con,"update bank set balance=(balance-$am) where acc_no=$ac");
    }
    $qry1=pg_query($con,"select * from bank where acc_no=$ac");
    while($row=pg_fetch_array($qry1))
    {
        echo "<br>";
        echo "<table align='center' border='1' cellspacing='1'>
        <tr>
        <th>Account Num</th>
        <td>$row[0]</td>
        </tr>
        <tr>
        <th>name</th>
        <td>$row[1]</td>
        </tr>
        <tr>
        <th>balance</th>
        <td>$row[2]</td>
        </tr>
        </table>";
    }
}
?>
