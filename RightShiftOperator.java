import java.util.Scanner;

class RightShiftOperator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num1 = sc.nextInt();
        System.out.print("How much you want to Shift : ");
        int shift = sc.nextInt();
   
        int result = num1 >> shift;
        System.out.println("Result is : "+result);
    }
}