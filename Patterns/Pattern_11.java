import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of pattern : ");
        int a = sc.nextInt();
        for(int i=1;i<=a;++i){
            for(int j=1;j<=i;++j){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=2*(a-i);++j){
                System.out.print(" ");
            }
            for(int j=1;j<=i;++j){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=a;i>=1;--i){
            for(int j=1;j<=i;++j){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=2*(a-i);++j){
                System.out.print(" ");
            }
            for(int j=1;j<=i;++j){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
