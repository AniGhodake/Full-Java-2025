import java.util.Scanner;

class SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your principle amount :");
        int amount = sc.nextInt();
        System.out.print("please enter the rate of interest : ");
        float rate = sc.nextFloat();
        System.out.print("Now, tell me for how many years are you borrowing this money : ");
        float years = sc.nextFloat();

        float interest = (amount * rate * years)/100;
        System.out.println("\n\n\tYour Simple Interest is Rs."+interest);
    }
}