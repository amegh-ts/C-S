import java.util.*;
class Anagram
{
    public static void main(String args[])
    {
        String str1,str2;
        int len1,len2,i,j,found=0,not_found=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first string");
        str1=s.nextLine();
        System.out.println("Enter the second string");
        str2=s.nextLine();
        len1=str1.length();
        len2=str2.length();
        if(len1==len2)
        {
            for(i=0;i<len1;i++)
            {
                found=0;
                for(j=0;j<len2;j++)
                {
                    if(str1.charAt(i)==str2.charAt(j))
                    {
                        found=1;
                        break;
                    }
                }
                if(found==0)
                {
                    not_found=1;
                    break;
                }
            }
            if(not_found==1)
            {
                System.out.println("String are not anagram");
            }
            else
            {
                System.out.println("String are  anagram");
            }
        }
        else 
        {
            System.out.println("Both strings must have same length");
        }
    }
}
