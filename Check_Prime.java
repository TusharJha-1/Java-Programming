import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check : ");
        int num = sc.nextInt();
        if(num==2){
            System.out.format("%d is a prime number",num);
        }
        else if(num==1){
            System.out.format("%d is not a prime number",num);
        }
        else{
            for(int i=2;i<num;++i){
                if(num%i==0){
                    System.out.format("%d is not a prime number.",num);
                    break;
                }
                else{
                    if(i==num-1){
                        System.out.format("%d is a prime number.",num);
                    }
                }
            }
        }
    }
}
