echo "enter the first numbers:"
read a
echo "enter the second number:"
read b
echo "Enter the third number:"
read c
m=$((($a+$b+$c)/3))
p=$(($a-$m))
q=$(($b-$m))
r=$(($c-$m))
d=$((($p*$p+$q*$q+$r*$r)/3))
w=$(echo "sqrt($d)"|bc)
echo "mean is"$m
echo "standard deviation is"$w
