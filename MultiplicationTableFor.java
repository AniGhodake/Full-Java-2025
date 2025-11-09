import java.util.Scanner;

class MultiplicationTableFor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number which table you want : ");
        int num = sc.nextInt();
        mulTable(num);
    }
    
    public static void mulTable(int num){
        for(int i = 1; i < 10; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}