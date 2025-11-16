import java.util.Scanner;
class InputFromUser {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();
        System.out.println("You entered : "+name);
    }
}