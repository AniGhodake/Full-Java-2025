import java.util.Scanner;

class MinTernary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter your 2nd Number : ");
        int num2 = sc.nextInt();

        MinTernary ternary = new MinTernary();
        int min = ternary.min(num1,num2);

        System.out.println("Minimum number among entered two numbers is : "+min);
    }

    public int min(int num1, int num2){
        return num1 > num2 ? num2 : num1;
    }
}