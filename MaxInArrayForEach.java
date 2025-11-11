import java.util.Scanner;

class MaxInArrayForEach{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements you want to insert : ");
        int n = sc.nextInt();
        int arr[] = userArray(n);
        print(arr);
        int max = maxInArray(arr);
        System.out.println("Maximum Element in array is : "+max);
    }

    public static int maxInArray(int arr[]){
       // int max = arr[0];
       int max = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele > max){
                max = ele;
            }
        }
        return max;
    }

    public static int[] userArray(int n){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter element no. "+(i+1) +" : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void print(int arr[]){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}