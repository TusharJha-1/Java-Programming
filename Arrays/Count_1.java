import java.util.Scanner;

public class Count_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int cc = 0;
        while(num!=0){
            cc+=num&1;
            num = num>>1;
        }
        System.out.println(cc);
    }
}
