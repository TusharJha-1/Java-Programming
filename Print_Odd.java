import java.util.Scanner;

public class Print_Odd {
    public static void printOdd(int n){
        for(int i=1;i<=2*n;i+=2){
            System.out.print(i+" ");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of odd numbers you want to print : ");
        int a = sc.nextInt();
        printOdd(a);
    }
}
