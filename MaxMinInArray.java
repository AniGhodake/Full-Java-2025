import java.util.Scanner;

class MaxMinInArray{
    public static void main(String args[]){
        int arr[] = userArray();
        int min = minInArray(arr);
        System.out.println("Minimum element among the array elements is : "+min);
        int max = maxInArray(arr);
        System.out.println("Maximum element among the array elements is : "+max);
        System.out.println();
    }

    public static int maxInArray(int nums[]){
        int max = nums[0];
        int i = 0;
        while(i < nums.length){
            if(nums[i] > max){
                max = nums[i];
            }
            i++;
        }
        return max;
    }

    public static int minInArray(int nums[]){
        int min = nums[0];
        int i = 0;
        while(i < nums.length){
            if(nums[i] < min){
                min = nums[i];
            }
            i++;
        }
        return min;
    }

    public static int[] userArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nHow many elements you want to enter ? : ");
        int n = sc.nextInt();
        int nums[] = new int[n];

        int i = 0;
        while(i < nums.length){
            System.out.print("Enter the array element no. "+i+" : ");
            nums[i] = sc.nextInt();
            i++;
        }
        return nums;
    }
}