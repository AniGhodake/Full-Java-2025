import java.util.Scanner;

class StringPalinRecursion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();

        boolean isPalinStr = isStrPalindrom(str);
        System.out.println(isPalinStr ? "Your String is Palindromic String" : "Your String is not Palindromic String");

    }
    public static boolean isStrPalindrom(String str){
        if(str.length() <= 1) return true;

        int lastPos = str.length()-1;

        if(str.charAt(0) != str.charAt(lastPos)) return false;

        String newString = str.substring(1,lastPos);

        return isStrPalindrom(newString);

    }
}