import java.util.Scanner;

class Grades{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("A Grade");
        }else if(marks >= 75){
            System.out.println("B Grade");
        }else if(marks >= 60){
            System.out.println("C Grade");
        }else if(marks >= 30){
            System.out.println("D Grade");
        }else if(marks < 30){
            System.out.println("F Grade");
        }
    }
}