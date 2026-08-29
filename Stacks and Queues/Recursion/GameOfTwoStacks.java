import java.util.*;

public class GameOfTwoStacks {
    private static int twoStacks(int sum, int[] a, int[] b, int currSum, int count){
        if(currSum>sum){
            return count;
        }
        if(a.length==0 || b.length==0){
            return count;
        }
        int ans1 = twoStacks(sum, Arrays.copyOfRange(a, 1, a.length), b, currSum + a[0], count + 1);
        int ans2 = twoStacks(sum, a, Arrays.copyOfRange(b, 1, b.length), currSum + b[0], count + 1);
        return Math.max(ans1,ans2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the boundary sum for the game : ");
        int[] a = {6,2,4,6,1};
        int[] b = {2,5,8,5};
        int sum = sc.nextInt();
        int result = twoStacks(sum,a,b,0,0);
        System.out.println("The maximum steps to be made before encountering sum : "+result);
        sc.close();
    }
}
