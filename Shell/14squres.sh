echo "Enter the base: "
read base
echo "Enter the exponent: "
read exponent
# Calculate the result
result=$(echo "$base^$exponent" | bc)
# Print the result
echo "$base raised to the power of $exponent is:
$result"
