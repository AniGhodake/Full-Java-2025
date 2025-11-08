import java.util.Scanner;

class OddEvenTernary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();
        OddEvenTernary oe = new OddEvenTernary();
        boolean isOddEven = oe.oddEven(num);

        System.out.println((isOddEven) ? "Your Entered Number is : Even" : "Your Entered Number is : Odd");
    }
    public boolean oddEven(int num){
        return (num % 2 == 0) ? true : false;
    }
}