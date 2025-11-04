import java.util.Scanner;

class OddSumTillN{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N : ");
        int n = sc.nextInt();

        int i = 0;
        int sum = 0;
        while(i <= n){
            if(i % 2 !=0){
                sum = sum + i;
            }
            i++;
        }

        System.out.println("Sum of odd numbers to "+n+" is "+sum);
    }
}