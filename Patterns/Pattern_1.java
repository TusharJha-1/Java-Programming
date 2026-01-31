//Single loop

import java.util.Scanner;
public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int a = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        int total = a*b;
        for(int i=1;i<=total;++i){
            System.out.print("* ");
            if(i%b==0){
                System.out.println();
            }
        }
    }
}


// Two loops
// public class Pattern_1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter length: ");
//         int a = sc.nextInt();
//         System.out.print("Enter breadth: ");
//         int b = sc.nextInt();
//         for(int i=0;i<a;++i){
//             for(int j=0;j<b;++j){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }