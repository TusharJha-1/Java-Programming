import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows in the matrix : ");
        int rows = sc.nextInt();
        System.out.print("Enter the no. of columns in the matrix : ");
        int cols = sc.nextInt();
        int [][]mat = new int[rows][cols];
        int [][]trans = new int[cols][rows];
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

        System.out.println("Transpose matrix is :-");
        for(int i=0;i<cols;++i){
            System.out.print("[");
            for(int j=0;j<rows;++j){
                trans[i][j]=mat[j][i];
                System.out.print(trans[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
