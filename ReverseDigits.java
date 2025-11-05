import java.util.Scanner;

class ReverseDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int reverse = reverse(num);
        System.out.println("Reverse Number of "+num+" is "+reverse);
    }

    public static int reverse(int num){
        int digit;
        int rev = 0;
        while(num > 0){
            digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        return rev;
    }

}