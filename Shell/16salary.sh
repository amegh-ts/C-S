echo "enter your basic salary"
read sal
da=$((sal*40/100))
ha=$((sal*20/100))
net=$((sal+$da+$ha))
echo "Basic Salary $sal"
echo "DA $da"
echo "HRA $ha"
echo "--------------"
echo "Net Salary is Rs. $net"

