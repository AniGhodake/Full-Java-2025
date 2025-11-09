import java.util.Scanner;

class MonthSwitch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number between 1 to 12 :");
        int monthNum = sc.nextInt();
        String month = monthSwitch(monthNum);
        System.out.println("Aligned month name based on your input number is : "+month);
    }

    public static String monthSwitch(int num){
        // String month;
        
        // switch(num){
        //     case 1 :  month = "January";
        //     break;
        //     case 2 :  month ="February";
        //     break;
        //     case 3 : month = "March";
        //     break;
        //     case 4 :month ="April";
        //     break;
        //     case 5 : month = "May";
        //     break;
        //     case 6 : month = "June";
        //     break;
        //     case 7 : month = "July";
        //     break;
        //     case 8 : month = "August";
        //     break;
        //     case 9 : month = "September";
        //     break;
        //     case 10 : month =  "October";
        //     break;
        //     case 11 : month = "November";
        //     break;
        //     case 12 : month = "December";
        //     break;
        //     default:  month = "Invalid Input";
        //     break;
        // }
        // return month;


            return switch(num){
            case 1  -> "Jan";     
            case 2 ->  "Feb";      
            case 3  ->  "Mar";       
            case 4  ->  "Apr";       
            case 5 ->   "Ma";      
            case 6 ->   "Jun";      
            case 7  ->  "Jul";     
            case 8 ->   "Aug";      
            case 9  ->  "Sep";      
            case 10  ->  "Oct";     
            case 11 ->   "Nov";     
            case 12 ->   "Dec";     
            default ->  "Enter the valid number 1-12 ";   
        };
    }
}