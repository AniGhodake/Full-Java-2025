import java.util.Scanner;

class ReverseArray{
    public static void main(String args[]){
        int arr[] = userArray();
        System.out.println("\nArray elements you entered are:");
        printArray(arr);
        arr = reverseArray(arr);
        System.out.println("\nArray elements after reverse are:");
        printArray(arr);
    }

    public static int[] reverseArray(int arr[]){
        int first = 0;
        int last = arr.length-1;
        int temp;

        while(first < last){
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
        return arr;
    }

     public static void printArray(int arr[]){
        int i = 0;
     
        while(i < arr.length){
            System.out.print(+arr[i]+"  ");
            i++;
        }
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