import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=a;++i){
            fact*=i;
        }
        System.out.format("The factorial of the number %d is %d",a,fact);
    }
}


// import java.util.Scanner;

// public class Factorial{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int a = sc.nextInt();
//         int fact = 1;
//         int i = 1;
//         while(i<=a){
//             fact*=i;
//             ++i;
//         }
//         System.out.format("The factorial of the number %d is %d",a,fact);
//     }
// }