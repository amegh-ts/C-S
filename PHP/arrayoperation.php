<html>
<body>
<h1>Array Operations</h1>
<form action="" method="POST">
<select name="s">
<option value="display">Display Array</option>
<option value="sort">Sorted Array</option>
<option value="dupli">Without Duplicate</option>
<option value="pop">Delete Last</option>
<option value="rev">Array Reverse</option>
<option value="search">Array Search</option>
</select><br><br>
<input type=Submit>
</body>
</html>
<?php
if ($_POST) {
$countries = array("Brazil", "China", "England", "India", "Italy","Spain",
"Austria", "Portugal", "United States");
$val = $_POST['s'];
switch ($val) {
case "display":
foreach ($countries as $value)
echo "<br>" . $value;
break;
case "sort":
sort($countries);
foreach ($countries as $value)
echo "<br>" . $value;
break;
case "dupli":
$uarray = array_unique($countries);
foreach ($uarray as $value)
echo "<br>" . $value;
break;
case "pop":
array_pop($countries);
foreach ($countries as $value)
echo "<br>" . $value;
break;
case "rev":
$revarr = array_reverse($countries);
foreach ($revarr as $value)
echo "<br>" . $value;
break;
case "search":
echo "<br/><br/>Position - " . array_search("Italy", $countries, true);
break;
}
}
?>