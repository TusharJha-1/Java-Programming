import java.util.Scanner;

public class Rotate {
    public static void reverse(int m,int n,int []mat){
        while(m<n){
            int t = mat[m];
            mat[m] = mat[n];
            mat[n] = t;
            ++m;--n;
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int a = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rotations needed : ");
        int r = sc.nextInt();
        reverse(0,a-1,arr);
        reverse(0,(r%a)-1,arr);
        reverse(r%a,a-1,arr);
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}