import java.util.Scanner;
public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a literal value : ");
        boolean b = sc.hasNextInt();
        System.out.println("Is the entered literal an integer : "+b);
    }
}
