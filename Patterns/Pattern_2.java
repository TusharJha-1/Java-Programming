import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int a = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        for(int i=1;i<=a;++i){
            if(i==1 || i==a){
                for(int j=1;j<b;++j){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=1;j<b;++j){
                    System.out.print("* ");
                }
            }
        }
    }
}
