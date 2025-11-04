import java.util.Scanner;

class SumOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int num2 = num;
        int sum = 0;
        int digit = 0;
        while(num > 0){
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("The Sum of digits of "+num2+" is "+sum);
    }
}