h="$(date +%H)"
if(("$h" <12))
then
echo "Good morning"
elif(("$h" <16))
then
echo "Good afternoon"
else
echo "Good evening"
fi
