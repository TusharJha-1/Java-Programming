public class Total_Paths {
    public static int count = 0;
    public static void paths(int row, int col,int m, int n){
        if(row==m-1 && col==n-1){
            ++count;
            return;
        }
        if(row==m-1){
            paths(row,col+1,m,n);
        }
        else if(col==n-1){
            paths(row+1,col,m,n);
        }
        else{
            //for right
            paths(row,col+1,m,n);
            //for down
            paths(row+1,col,m,n);
        }
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        paths(0,0,m,n);
        System.out.println(count);
    }
}