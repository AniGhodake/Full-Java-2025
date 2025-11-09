import java.util.Scanner;

class NumberGuessingGame{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double n = Math.random() * 100;
        int num = (int)Math.ceil(n);
        System.out.print("Welcome to Number Guessing Game : \n");
        int userNum;

        do{
            System.out.print("Guess number from 1-100 : ");
            userNum = sc.nextInt();
        }while(!isNum(num,userNum));
    }

    public static boolean isNum(int num1 , int num2){
        if(num1 == num2){
            System.out.println("Congratulation !!! You Guess the right number.");
            return true;
        }else if(num1 < num2){
            System.out.println("Your number is greater");
            return false;
        }else{
            System.out.println("Your number is smaller");
            return false;
        }
    }
}