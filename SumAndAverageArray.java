import java.util.Scanner;

class SumAndAverageArray{
    public static void main(String args[]){
       // Scanner sc = new Scanner(System.in);
        int arr[] = userArray();

        // int i = 0;
        // while(i < arr.length){
        //     System.out.println(arr[i]);         HERE WE ARE PRINTING THE ARRAY
        //     i++;
        // }

        int sum = sum(arr);
        System.out.println("\nSum of Array elements is : "+sum);
        float avg = average(arr,sum);
        System.out.println("Average of the Array elements is : "+avg);
    }


    public static int sum(int num[]){
        int i = 0;
        int sum = 0;
        while(i < num.length){
            sum = sum + num[i];
            i++;
        }
        return sum;
    }

    public static float average(int num[], int sum){
        int n = num.length;
        float average = (float)sum / n;
        return average;
    }
    

    public static int[] userArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter how many elements you want to insert into array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int i = 0;
        while(i < n){
            System.out.print("Enter array element no."+i+": ");
            arr[i] = sc.nextInt();
            i++;
        }
       return arr;
    }
}