<html>
<body>
<h2>Last visited time on webpage</h2>
</body>
</html>
<?php
$intm = 60 * 60 * 24 * 60 + time();
setcookie('lastVisit', date("G:i-m/d/y"), $intm);
if(isset($_COOKIE['lastVisit']))
{
    $visit = $_COOKIE['lastVisit'];
    echo "Your last visit was: " . $visit;
}
else
{
    echo "You have not visited the site before";
}
?>