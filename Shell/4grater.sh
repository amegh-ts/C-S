echo "Enter three Integers:"
read a b c
if [ $a -gt $b -a $a -gt $c ]
then
echo "$a is Greatest"
elif [ $b -gt $c -a $b -gt $a ]
then
echo "$b is Greatest"
else
echo "$c is Greatest!"
fi
