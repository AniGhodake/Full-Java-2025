import java.util.Scanner;

class LeapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year in Format of YYYY : ");
        int year = sc.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("The Year "+year+" is Leap Year");
        }else{
            System.out.println("The Year "+year+" is not a Leap Year");
        }
    }
}