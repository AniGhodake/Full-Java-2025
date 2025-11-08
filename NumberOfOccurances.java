import java.util.Scanner;

class NumberOfOccurances{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = userArray();
        System.out.print("Now, tell me which element occurance you want to find : ");
        int ele = sc.nextInt();

        int occur = occurances(arr,ele);
        System.out.println("\nElement "+ele+" present "+occur+" times in an array");

    }

    public static int occurances(int nums[], int n){
        int count = 0;
        int i = 0;
    
        while(i < nums.length){
            if(nums[i] == n){
                count++;
            }
            i++;
        }
        return count;
    }

    public static int[] userArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Array elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int i = 0;
        while(i < arr.length){
            System.out.print("Enter the array element no. "+i+" : ");
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;
    }
}