import java.util.Scanner;

class GreatestOfThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd Number : ");
        int num3 = sc.nextInt();

        System.out.println("\n\t Your Entered Numbers are : "+num1+" "+num2+" "+num3);

        if(num1 > num2 && num1 > num3){
            System.out.println("The First Number is Greatest Number i.e. "+num1);
        }else if(num2 > num3){
            System.out.println("The Second Number is Greatest Number i.e. "+num2);
        }else{
            System.out.println("The Third Number is Greatest Number i.e. "+num3);
        }
    }


}