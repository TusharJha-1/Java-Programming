import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a height number : ");
        int a = sc.nextInt();
        for(int i=a;i>=1;--i){
            for(int j=1;j<=i-1;++j){
                System.out.print("+ ");
            }
            for(int k=1;k<=a+(a-1);++k){
                if(i-k==1 || i-k==-1 || i-k==3 || i-k==-3){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
