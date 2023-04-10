echo "Enter the file name: "
read filename
if [ -f "$filename" ]; then
tr '[:lower:]' '[:upper:]' < "$filename" > temp.txt
mv temp.txt "$filename"
echo "Contents of $filename converted to
uppercase."
else
echo "$filename does not exist."
fi

