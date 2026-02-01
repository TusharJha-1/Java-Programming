import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of side : ");
        int a = sc.nextInt();
        for(int i=a;i>=1;--i){
            for(int j=1;j<=i-1;++j){
                System.out.print("  ");
            }
            for(int k=1;k<=a;++k){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
