import java.util.Scanner;

class SearchIn2D{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = userArray();
        printArray(arr);
        System.out.print("\nEnter the element you want to search : ");
        int ele = sc.nextInt();
        boolean isFound = searchArray(arr,ele);
        System.out.println(isFound ? "Element "+ele+" present in Array : " : "Element "+ele+" is not present in Array");
    }

    public static boolean searchArray(int arr[][], int ele){
        int rows = arr.length;
        int cols = arr[0].length;
        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < cols){
                if(arr[i][j] == ele){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }


    public static void printArray(int arr[][]){
        System.out.println();
        int rows = arr.length;
        int cols = arr[0].length;
        int i = 0;

        while(i < rows){
            int j = 0;
            while(j < cols){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    public static int[][] userArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of cols : ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < cols){
                System.out.print("Enter element for row :"+i+" and col "+j+" : ");
                arr[i][j] = sc.nextInt();
                j++;
            }

            i++;
        }
        return arr;
    }
}