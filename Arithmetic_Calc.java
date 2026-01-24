import java.util.Scanner;

public class Arithmetic_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Choose the number of operation to perform:\n1.) Addition\n2.) Subtraction\n3.) Multiplication\n4.) Division\n5.) Modulo");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.format("The result of addition is : %d", a+b);
                break;
            case 2:
                System.out.format("The result of subtraction is : %d", a-b);
                break;
            case 3:
                System.out.format("The result of multiplication is : %d", a*b);
                break;
            case 4:
                System.out.format("The result of division is : %d", a/b);
                break;
            case 5:
                System.out.format("The result of modulo is : %d", a%b);
                break;  
            default:
                System.out.println("!!!!!!Invalid Argument!!!!!!");  
        }
    }
}
