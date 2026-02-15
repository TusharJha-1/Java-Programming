public class Reverse_Arr {
    public static void main(String[] args) {
        int []arr = {2,6,0,-7,1};
        int n = arr.length;
        int i = 0, j = n-1;
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            ++i;--j;
        }
        for(int k=0;k<n;++k){
            System.out.print(arr[k]+" ");
        }
    }
}
