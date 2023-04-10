echo "Current date and time: $(date)"
echo "Number of users: $(who | wc -l)"
echo "Terminal name: $TERM"
echo "Login date and time: $(last -1 -i | awk 'NR==2
{print $NF, $5, $6}')"
