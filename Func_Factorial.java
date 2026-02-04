import java.util.Scanner;

public class Func_Factorial {
    public static int factorial(int num){
        int fact = 1;
        for(int i=1;i<=num;++i){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.format("The factorial of %d is %d.",a,factorial(a));
    }
}
