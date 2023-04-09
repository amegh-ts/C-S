<html>
<head></head>
<body>
<form method="POST">
<table>
<tr>
<td>Enter ther item code</td>
<td><input type="text" name="c"></td>
</tr>
<tr>
<td>Enter ther item name</td>
<td><input type="text" name="n"></td>
</tr>
<tr>
<td>Enter ther unit price</td>
<td><input type="text" name="u"></td>
</tr>
<tr>
<td><input type="submit" value="display" name="s"></td>
</tr>
</table>
</form>
</body>
</html>
<?php
if(isset($_POST["s"]))
{
    $c = $_POST["c"];
    $n = $_POST["n"];
    $u = $_POST["u"];

    // Connect to the database
    $d = pg_connect("host=localhost port=5432 user=postgres password=amz dbname=loginS");

    // Prepare the query with parameters
    $r = pg_query_params($d, "INSERT INTO product (item_code, item_name, unit_price) VALUES ($1, $2, $3)", array($c, $n, $u));

    // Display the products table
    $t = pg_query($d, "SELECT * FROM product");
    echo "<table border='10px'>
        <tr>
            <th>item code </th>
            <th>itrm name</th>
            <th>unit price</th>
        </tr>";
    while($row = pg_fetch_array($t))
    {
        echo "<tr><td>".$row[0]."</td><td>".$row[1]."</td><td>".$row[2]."</td></tr>";
    }
    echo "</table>";

    // Close the database connection
    pg_close($d);
}
?>