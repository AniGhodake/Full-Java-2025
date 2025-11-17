import java.util.Scanner;

class FiboRecursion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms you want to print : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int value =  fibonacci(i);
            System.out.println(value+"  ");
        }
    }

    public static int fibonacci(int n){
        System.out.print(".");
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}