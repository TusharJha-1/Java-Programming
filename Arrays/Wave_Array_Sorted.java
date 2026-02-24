public class Wave_Array_Sorted {
    public static void wave(int []mat){
        int n = mat.length;
        for(int i=0;i<n-1;i+=2){
            int t = mat[i];
            mat[i] = mat[i+1];
            mat[i+1] = t;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        wave(arr);
        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i]+" ");
        }
    }
}
