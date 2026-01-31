import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int a = sc.nextInt();
        for(int i=1;i<=a;++i){
            for(int j=1;j<=i;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//Flyd's Triangle
// public class Pattern_3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter height: ");
//         int a = sc.nextInt();
//         int cc = 1;
//         for(int i=1;i<=a;++i){
//             for(int j=1;j<=i;++j){
//                 System.out.print(cc+ " ");
//                 ++cc;
//             }
//             System.out.println();
//         }
//     }
// }

// 0-1 Triangle

// public class Pattern_3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter height: ");
//         int a = sc.nextInt();
//         for(int i=1;i<=a;++i){
//             for(int j=1;j<=i;++j){
//                 if((i-j)%2==0){
//                     System.out.print("1 ");
//                 }
//                 else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }