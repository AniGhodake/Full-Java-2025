import java.util.Scanner;

class AbsoluteValue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();
        int absNum = absValue(num);
        System.out.print("Absolute value of "+num+" is "+absNum);
    }
    public static int absValue(int num){
        return num < 0 ? -(num) : num;
    }
}