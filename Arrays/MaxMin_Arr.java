import java.util.Scanner;

public class MaxMin_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the matrix : ");
        int n = sc.nextInt();
        int []mat = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;++i){
            System.out.format("Enter the element at index %d : ",i);
            mat[i] = sc.nextInt();
        }

        System.out.println("The matrix is :-");
        System.out.print("[");
        for(int i=0;i<n;++i){
            System.out.print(mat[i]+" ");
        }
        System.out.println("]");
        
        for(int i=0;i<n;++i){
            if(mat[i]<min){
                min = mat[i];
            }
            if(mat[i]>max){
                max = mat[i];
            }
        }
        System.out.println("The maximum element in the array is "+ max);
        System.out.println("The minimum element in the array is "+ min);
    }
}
