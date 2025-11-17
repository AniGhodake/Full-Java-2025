import java.util.Scanner;

class GCD{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter your Second Number : ");
        int num2 = sc.nextInt();

        int gcd = gcd(num1, num2);
        System.out.println("GCD of "+num1+" and "+num2+" is "+gcd);
    }

    public static int gcd(int first, int second){
        int gcd = 1;
        int i = 2;
        int least = least(first, second);
        while(i <= least){
            if(first % i == 0 && second % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
}