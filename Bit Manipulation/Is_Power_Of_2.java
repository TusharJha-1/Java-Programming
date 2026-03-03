import java.util.Scanner;

public class Is_Power_Of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if(num>0 && (num & (num-1)) == 0){
            System.out.println("Yes, it's a power of 2");
        }
        else{
            System.out.println("No, It's not a power of 2");
        }
    }
}
