import java.util.Scanner;

class PalindromArray{
    public static void main(String args[]){
        int arr[] = userArray();
        System.out.println("Array elements you entered are : ");
        printArray(arr);
        boolean isPalindrome = isPalindrome(arr);
        System.out.print(isPalindrome ? "\n\tIt means Array is Palindrome" : "\n\tIt means Array is not Palindrome");
    }

    public static boolean isPalindrome(int arr[]){
        int first = 0;
        int last = arr.length-1;

        while(first < last){
            if(arr[first] != arr[last]){
                return false;
            }
            first++;
            last--;
        }
        return true;
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
            System.out.print("Enter element no. "+i+" : ");
            nums[i] = sc.nextInt();
            i++;
        }
        return nums;
    }
}