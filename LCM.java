import java.util.Scanner;

class LCM{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Least Common Multiplier : ");
        System.out.print("Please enter your first number : ");
        int num1 = sc.nextInt();
        System.out.print("Please enter your second number : ");
        int num2 = sc.nextInt();

        int lcm = lcm(num1,num2);
        System.out.println("LCM of "+num1+" and "+num2+" is : "+lcm);
    }

    public static int lcm(int first, int second){
        int i = 1;
        while(i <= second){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
        return 0;  // unreachable
    }
} 