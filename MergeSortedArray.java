import java.util.Scanner;

class MergeSortedArray{
    public static void main(String args[]){
        System.out.println("\nFirst Sorted Array : ");
        int arr[] = userArray();
        System.out.println("\nSecond Sorted Array :");
        int brr[] = userArray();

        System.out.println("First Array Elements are : ");
        printArray(arr);
        System.out.println("Second Array Elements are : ");
        printArray(brr);

        int num[] = mergeArray(arr,brr);
        System.out.println("Array Elements after merging first and second array is : ");
        printArray(num);
    }

    public static int[] mergeArray(int arr[], int brr[]){
        int i = 0, j = 0, k = 0;
        int newLength = arr.length + brr.length;
        int nums[] = new int[newLength];

        while(i < arr.length && j < brr.length){
            if(arr[i] < brr[j]){
                nums[k] = arr[i];
                i++;
                k++;
            }else{
                nums[k] = brr[j];
                j++;
                k++; 
            }
        }
        while(i < arr.length){
            nums[k] = arr[i];
            i++;
            k++;
        }
        while(j < brr.length){
            nums[k] = arr[j];
            j++;
            k++;
        }
        return nums;
    }


    public static void printArray(int arr[]){
        int i = 0;
     
        while(i < arr.length){
            System.out.print(+arr[i]+"  ");
            i++;
        }
        System.out.println();
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