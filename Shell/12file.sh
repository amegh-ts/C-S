echo "enter the file name"
read file
lines=$(cat $file | wc -l)
word=$(cat $file | wc -w)
chars=$(cat $file | wc -c)
echo $file contains $lines lines,$word words and $chars characters
