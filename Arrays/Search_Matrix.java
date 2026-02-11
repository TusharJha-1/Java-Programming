import java.util.Scanner;

public class Search_Matrix {
    public static void search(int num,int arr[][],int r,int c){
        System.out.format("The element %d is present at index : ",num);
        int cc=0;
        for(int i=0;i<r;++i){
            for(int j=0;j<c;++j){
                if(arr[i][j]==num){
                    System.out.format("(%d,%d), ",i,j);
                    ++cc;
                }
            }
        }
        if(cc==0){
            System.out.format("The element %d is not present in the given matrix",num);
        }
    }
    public static void display(int arr[][],int r,int c){
        System.out.println("The matrix is :-");
        for(int i=0;i<r;++i){
            System.out.print("[");
            for(int j=0;j<c;++j){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows in the matrix : ");
        int rows = sc.nextInt();
        System.out.print("Enter the no. of columns in the matrix : ");
        int cols = sc.nextInt();
        System.out.print("Enter the number to be searched : ");
        int n = sc.nextInt();
        int [][]mat = new int[rows][cols];
        for(int i=0;i<rows;++i){
            for(int j=0;j<cols;++j){
                System.out.format("Enter the element at row index %d and column index %d : ",i,j);
                mat[i][j] = sc.nextInt();
            }
        }
        display(mat,rows,cols);
        search(n,mat,rows,cols);
    }
}
