import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int a = sc.nextInt();
        for(int i=1;i<=a;++i){
            for(int j=1;j<=a-i;++j){
                System.out.print("  ");
            }
            int n = i;
            for(int j=1;j<=i;++j){
                System.out.print(n+" ");
                --n;
            }
            if(i!=1){
                for(int j=2;j<=i;++j){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
