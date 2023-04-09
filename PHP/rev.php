<html>
<body>
<form action=" " method="POST">
<h1>String Reverse</h1>
 enter a string
 <input type="text" name="str">
 <input type="submit" value="submit">
 </form>
 </html>
 <?php
 if($_POST)
 {
 function rev($str)
 {
 $len=strlen($str);
 for($i=($len-1);$i>=0;$i--)
 {
	 echo $str[$i];
 }
 }
 $string=$_POST['str'];
 rev($string);
 }
 ?>

