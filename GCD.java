import java.util.Scanner;

public class GCD {
    public static int lesser(int c, int d){
        if(c>d){
            return d;
        }
        else{
            return c;
        }
    }
    public static int gcd(int a,int b){
        if(a==0) return b;
        if(b==0) return a;
        for(int i=lesser(a,b);i>=1;--i){
            if((a%i)==0 && (b%i)==0){
                return i;
            }
        }
    return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number : ");
        int m = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n = sc.nextInt();
        if(m<0 || n<0 || (m==0 && n==0)){
            System.out.print("Invalid argument");
        }
        else{
            System.out.format("The GCD of %d and %d is %d",m,n,gcd(m,n));
        }
    }
}
