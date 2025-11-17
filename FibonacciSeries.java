import java.util.Scanner;

class FibonacciSeries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound for fibonacci series : ");
        int num = sc.nextInt();

        fibonacci(num);
    }

    public static void fibonacci(int n){
        int first = 0;
        int second = 1;
        if(n < 0) return;
        System.out.print(first+" ");
        if(n == 0) return;
        System.out.print(second+" ");
        // if(n == 1) return;
        int third = first + second;

        while(third <= n){
            System.out.print(third+" ");
            first = second;
            second = third;
            third = first + second;
        }
    }
}