import java.util.Scanner;

public class Pos_Neg_Zero {
    public static void classify(int n){
        if(n>0){
            System.out.println("It is Positive.");
        }
        else if(n<0){
            System.out.println("It is Negative.");
        }
        else{
            System.out.println("It is a Zero.");
        }
    return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        do { 
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            classify(num);
            System.out.println("Do you want to continue asking (y/n) : ");
            a = sc.next();
        } while (a.equalsIgnoreCase("y"));
        System.out.println("Thank you !!!");
    }
}
