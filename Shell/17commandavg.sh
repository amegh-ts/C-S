sum=0
count=0
for arg in "$@"
do
sum=$(($sum + $arg))
count=$(($count + 1))
done
avg=$(echo "scale=2; $sum/$count" | bc -l)
echo "The average of the provided arguments is: $avg"

