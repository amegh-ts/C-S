import java.util.*;

class Vowel {
    public static boolean isVowel(char c) {
        switch(c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
    
    public static void main(String args[]) {
        String str;
        char c;
        String str1 = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        str = s.nextLine();
        System.out.println("String before removing vowels: " + str);
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (!isVowel(c)) {
                str1 = str1 + c;
            }
        }
        System.out.println("String after removing vowels: " + str1);
    }
}
