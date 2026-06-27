import java.util.*;
public class Prog2 {
    public static void hanoi(int n, String src,String help, String dest) {
        if(n==1){
            System.out.println("Move disc "+n+" from "+ src + " to "+ dest);
        }
        else{
            hanoi(n-1,src,dest,help);
            System.out.println("Move disc "+n+" from "+ src + " to "+ dest);
            hanoi(n-1,help,src,dest);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of discs on src : ");
        int n = sc.nextInt();
        hanoi(n,"A","B","C");
    }
}
