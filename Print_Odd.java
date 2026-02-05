import java.util.Scanner;

public class Print_Odd {
    public static void printOdd(int m,int n){
        int i = m;
        while(i<=n){
            System.out.print(i+" ");
            i+=2;
        }
        return;  //Optional in case of void function
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of range : ");
        int a = sc.nextInt();
        System.out.print("Enter the end of range : ");
        int b = sc.nextInt();
        printOdd(a,b);
    }
}
