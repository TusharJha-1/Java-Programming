public class Tiling_Prob {
    public static int tiles(int m, int n){
        if(n==m){
            return 2;
        }
        else if(n<m){
            return 1;
        }
        //vertical
        int vertical = tiles(m,n-m);
        //horizontal
        int horizontal = tiles(m,n-1);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        System.out.println(tiles(2,4));
    }
}
