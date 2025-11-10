import java.util.Scanner;

class StringBuilderArrayWords{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String arr[] = userArray();
        int n = arr.length;
        printString(arr,n);

        StringBuilder sb = concatStrings(arr,n);
        System.out.println(sb.toString());
    }

    public static StringBuilder concatStrings(String arr[], int n){
       StringBuilder sbn = new StringBuilder();
        for(int i = 0; i < n; i++){
            sbn.append(arr[i]).append(" ");
        }
        return sbn;

    }

    public static void printString(String arr[], int n){
        
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    public static String[] userArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to insert : ");
        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter the String : ");
            arr[i] = sc.next();
        }
        return arr;
    }
}