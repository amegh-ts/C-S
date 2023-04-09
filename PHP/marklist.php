<html>
<body align='center'>
<form method="POST" action="">
regno<input type="text" name="t1">
<input type="submit" value="getresult">
</form>
</body>
</html>
<?php
if($_POST){
    $reg = $_POST["t1"];
    echo "<h1 align='center'>MARKLIST</h1>";
    $con = pg_connect("host=localhost dbname=loginx user=postgres password=amz");
    if($con) {
        echo "Successfully connected";
    }
    $qry = "SELECT * FROM marklist WHERE rollno=$reg";
    $marklist = pg_query($con, $qry);
    $nos = pg_num_rows($marklist);
    while($row = pg_fetch_row($marklist)){
        echo "<br>";
        echo "<table align='center' border='1' cellspacing='0'>
                <tr><th>rollno</th><td>$row[0]</td></tr>
                <tr><th>name</th><td>$row[1]</td></tr>
                <tr><th>mark</th><td>$row[2]</td></tr>
                <tr><th>grade</th><td>$row[3]</td></tr>
            </table>";
    }
}
?>
