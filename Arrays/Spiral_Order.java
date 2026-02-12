import java.util.Scanner;

public class Spiral_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows in the matrix : ");
        int rows = sc.nextInt();
        System.out.print("Enter the no. of columns in the matrix : ");
        int cols = sc.nextInt();
        int [][]mat = new int[rows][cols];
        for(int i=0;i<rows;++i){
            for(int j=0;j<cols;++j){
                System.out.format("Enter the element at row index %d and column index %d : ",i,j);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is :-");
        for(int i=0;i<rows;++i){
            System.out.print("[");
            for(int j=0;j<cols;++j){
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
        int start_row = 0;
        int end_row = rows-1;
        int start_col = 0;
        int end_col = cols-1;
        while(start_row<=end_row && start_col<=end_col){
            //top boundary
            for(int j=start_col;j<=end_col;++j){
                System.out.print(mat[start_row][j]+" ");
            }
            ++start_row;
            //right boundary
            for(int i=start_row;i<=end_row;++i){
                System.out.print(mat[i][end_col]+" ");
            }
            --end_col;
            //bottom boundary
            if(start_row<=end_row){
                for(int j=end_col;j>=start_col;--j){
                    System.out.print(mat[end_row][j]+" ");
                }
                --end_row;
            }
            //left boundary
            if(start_col<end_col){
                for(int i=end_row;i>=start_row;--i){
                    System.out.print(mat[i][start_col]+" ");
                }
                ++start_col;
            }
        }
    }
}
