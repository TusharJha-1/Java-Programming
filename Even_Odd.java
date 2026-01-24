import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it's even or odd: ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.format("The entered number %d is even.",a);
        }
        else{
            System.out.format("The entered number %d is odd.",a);
        }
    }
}
