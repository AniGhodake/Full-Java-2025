import java.util.Scanner;

class NumberDetermine{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("The Entered Number is Zero");
        }else if(num < 0){
            System.out.println("You Entered the Negative Number i.e. "+num);
        }else{
            System.out.println("You Entered the Positive Number i.e. "+num);
        }
    }
}