public class Merge_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,7};
        int[] arr2 = {1,3,9};
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                ans[k] = arr1[i];
                ++k;++i;
            }
            else{
                ans[k] = arr2[j];
                ++k;++j;
            }
        }
        if(i==arr1.length){
            while(j<arr2.length){
                ans[k] = arr2[j];
                ++k;++j;
            }
        }
        else{
            while(i<arr1.length){
                ans[k] = arr1[i];
                ++k;++i;
            }
        }
        for(int x=0;x<ans.length;++x){
            System.out.print(ans[x]);
        }
    }
}