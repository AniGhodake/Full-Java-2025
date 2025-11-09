import java.util.Scanner;

class NestedTernary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Students marks out of 100 : ");
        int marks = sc.nextInt();
        String remark = teacherRemark(marks);
        System.out.println("For "+marks+ " your score is "+remark);
    }
    public static String teacherRemark(int marks){
        return marks >= 80 ? "High" : (marks >= 50 ? "Moderate" : "Low");
    }

}