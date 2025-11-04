import java.util.Scanner;

class MultiplicationTable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for Multiplication Table : ");
        int num = sc.nextInt();

        int i = 1;
        while(i <= 10){
            System.out.println(num+" X "+i+" = "+(num*i));
            i++;
        }
    }
}