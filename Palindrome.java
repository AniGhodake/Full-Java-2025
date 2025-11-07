import java.util.Scanner;

class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println(num+" is Palindrome Number");
        }else{
            System.out.println(num+" is not an Palindrome Number");
        }
    }

    public static boolean isPalindrome(int n){
        int temp = n;
        int digit;
        int rev = 0;

        while(n > 0){
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return (temp == rev);
    }
}