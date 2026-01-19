import java.util.Scanner;
public class Percent_Calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total marks of a subject : ");
        float totalMarks = sc.nextFloat();
        System.out.print("Enter the marks of subject 1 : ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter the marks of subject 2 : ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter the marks of subject 3 : ");
        float sub3 = sc.nextFloat();
        System.out.print("Enter the marks of subject 4 : ");
        float sub4 = sc.nextFloat();
        System.out.print("Enter the marks of subject 5 : ");
        float sub5 = sc.nextFloat();
        float percentage = ((sub1+sub2+sub3+sub4+sub5)/(5*totalMarks))*100;
        System.out.println("Percentage of the student as per marks is "+ percentage+"%");
    }
}
