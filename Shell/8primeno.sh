echo "Enter a limit"
read limit
echo "prime numbers upto 
$limit are :"
echo "1"
i=2
while [ $i -le $limit ]
do
flag=1
j=2
while [ $j -lt $i ]
do
rem=$(( $i % $j ))
if [ $rem -eq 0 ]
then
flag=0
break
fi
j=$(( $j+1 ))
done
if [ $flag -eq 1 ]
then
echo "$i"
fi
i=$(( $i+1 ))
done

