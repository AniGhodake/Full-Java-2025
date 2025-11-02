import java.util.Scanner;

class OddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("The Entered Number "+num+" is an EVEN Number");
        }else{
            System.out.println("The Entered Number "+num+" is an ODD Number");
        }
    }
}