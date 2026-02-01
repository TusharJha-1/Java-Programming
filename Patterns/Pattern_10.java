import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of pattern : ");
        int a = sc.nextInt();

        //Upper Part

        for(int i=1;i<=a;++i){
            for(int j=1;j<=i;++j){
                System.out.print("*");
            }
            for(int j=1;j<=2*(a-i);++j){
                System.out.print(" ");
            }
            for(int j=1;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Part

        for(int i=a;i>=1;--i){
            for(int j=1;j<=i;++j){
                System.out.print("*");
            }
            for(int j=1;j<=2*(a-i);++j){
                System.out.print(" ");
            }
            for(int j=1;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
