import java.util.Scanner;

public class Fibonacci {
    public static void fibbo(int n){
        int a = 0, b = 1;
        if(n<=0){
            System.out.print("Invalid Argument!!!");
            return;
        }
        else{
            for(int i=1;i<=n;++i){
                if(i<=1) System.out.print(a+" ");
                else if(i<=2) System.out.print(b+" ");
                else{
                    int c=a+b;
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                }
            }
        }  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to be printed : ");
        int num = sc.nextInt();
        fibbo(num);
    }
}
