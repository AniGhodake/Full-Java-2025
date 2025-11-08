import java.util.Scanner;

class PasswordChecker{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String pass;
        
        do{
            System.out.print("Enter Your Password :");
            pass = sc.next();
        }while(!isValid(pass));
    }

    public static boolean isValid(String pass){
        if(pass.length() > 5){
            return true;
        }else{
            return false;
        }
    }
}