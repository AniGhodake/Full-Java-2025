import java.util.Scanner;

class PrimeNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        boolean prime = isPrime(num);
        if(prime){
            System.out.println("\n\tEntered number "+num+" is a Prime Number");
        }else{
            System.out.println("\n\tEntered number "+num+" is not a Prime Number");
        }
    }

    public static boolean isPrime(int num){
        int i = 2;
        while(i < num){
            if(num% i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}