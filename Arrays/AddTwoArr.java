import java.util.*;
public class AddTwoArr {
    public static int[] getMinArray(int[] a, int[] b) {
        return a.length <= b.length ? a : b;
    }

    public static int[] getMaxArray(int[] a, int[] b) {
        return a.length >= b.length ? a : b;
    }
    public static ArrayList<Integer> answer(int[] a, int[] b, ArrayList<Integer> ans){
        int min = Math.min(a.length,b.length);
        int max = Math.max(a.length,b.length);
        int x = max;
        int[] minn = getMinArray(a,b);
        int[] maxx = getMaxArray(a,b);
        int carry = 0;
        for(int i=min-1;i>=0;--i){
            if(minn[i] + maxx[max-1] + carry<10){
                // ans[max-1] = minn[i] + maxx[max-1] + carry;
                ans.set(max-1,(minn[i] + maxx[max-1] + carry));
                --max;
                carry = 0;
                //return ans;
                continue;
            }
            // ans[max-1] = (minn[i] + maxx[max-1] +carry)%10;
            ans.set(max-1,((minn[i] + maxx[max-1] +carry)%10));
            carry = 1;
            --max;
        }
        if(x==max+min &&  x!=min){
            for(int i=max-1;i>=0;--i){
                ans.set(i,maxx[i]);
            }
            return ans;
        }
        ans.add(0,1);
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {9,9,9};
        int[] b = {9,9,9};
        int min = Math.min(a.length,b.length);
        int max = Math.max(a.length,b.length);
        int[] minn = getMinArray(a,b);
        int[] maxx = getMaxArray(a,b);
        // int[] ans = new int[max];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<max;++i){
            ans.add(0);
        }
        System.out.print(answer(a,b,ans));
    }
}
