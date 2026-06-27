import java.util.*;
public class Exp_Height_Logn {
    public static double exp(int n, int power) {
        if(power==0){return 1;}
        if(power==Integer.MIN_VALUE){
            return 1/(n*exp(n,Math.abs(power+1)));
        }
        if(power<0){
            return 1/exp(n,-power);
        }
        else{
            double half = exp(n,power/2);
            if(power%2==0){
                return half*half;
            }
            else{
                return n*half*half;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number:");
        int n = sc.nextInt();
        System.out.print("Enter the power:");
        int power = sc.nextInt();
        System.out.format("The result is : %f",exp(n,power));
    }
}
