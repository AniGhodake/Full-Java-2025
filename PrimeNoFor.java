import java.util.Scanner;

class PrimeNoFor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();
        PrimeNoFor pn = new PrimeNoFor();
        boolean isPrime = pn.isPrime(num);
        System.out.println(isPrime ? num+" is Prime Number" : num+" is not a Prime Number");
    }

    boolean isPrime(int num){
        if(num < 2) return false;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}