public class Segregate_0s_1s {
    public static int[] segregate0and1(int []mat){
        int n = mat.length;
        int zero = 0;
        for(int i=0;i<n;++i){
            if(mat[i]==0){++zero;}
        }
        for(int i=0;i<n;++i){
            if(i<zero){mat[i]=0;}
            else{mat[i]=1;}
        }
        return mat;
    }
    public static void main(String[] args) {
        int []arr = {0,1,1,0,1,1,0,0,0};
        arr = segregate0and1(arr);
        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i]);
        }

    }
}
