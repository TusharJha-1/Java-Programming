import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height : ");
        int a = sc.nextInt();
        for(int i=1;i<=a;++i){
            for(int j=1;j<=a;++j){
                if(i+j>a){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
