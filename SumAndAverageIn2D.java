import java.util.Scanner;

class SumAndAverageIn2D{
    public static void main(String args[]){
        int arr[][] = userArray();
        printArray(arr);
        int sum = sumArray(arr);
        System.out.println("Sum of Array elements is : "+sum);
        float avg = average(arr,sum);
        System.out.println("Average of Array elements is : "+avg);
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

    public static float average(int arr[][], int sum){
        int n = arr.length * arr[0].length;
        float avg = (float)sum / n;
        return avg;
    }

    public static int sumArray(int arr[][]){
        int sum = 0;
        int row = arr.length;
        int col = arr[0].length;

        int i = 0;
        while(i < row){
            int j = 0;
            while(j < col){
                sum = sum + arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}