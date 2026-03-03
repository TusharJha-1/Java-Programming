import java.util.Scanner;
public class Toggle_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.print("Enter the position:");
        int pos = sc.nextInt();
        int BitMask = 1<<(pos-1);
        int get = BitMask & num;
        if(get == 0){
            System.out.println(BitMask | num);
        }
        else{
            System.out.println((~BitMask) & num);
        }
    }
}
