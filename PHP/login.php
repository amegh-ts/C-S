<html>
    <body>
        <form method="post">
            <fieldset>
                <legend>Enter Information</legend>
                Name <input type="text" name="username" required><br>
                Password <input type="password" name="password" required><br>
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
    $r=pg_query($con,"select * from login where username='$un' and password='$pw'");
    $n=pg_num_rows($r);
    echo $n;
    if($n)
    {
        echo "successfully logged in";
    }
    else
    {
        echo "wrong pass";
    }
}

?>
