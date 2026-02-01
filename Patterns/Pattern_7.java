import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of side : ");
        int a = sc.nextInt();
        for(int i=1;i<=a;++i){
            for(int j=1;j<=a-i;++j){
                System.out.print(" ");
            }
            for(int j=1;j<=i;++j){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

