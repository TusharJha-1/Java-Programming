import java.util.*;
public class AddTwoArr {
    public static int[] getMinArray(int[] a, int[] b) {
        return a.length <= b.length ? a : b;
    }

    public static int[] getMaxArray(int[] a, int[] b) {
        if(getMinArray(a,b)==a){
            return b;
        }
        else{return a;}

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
                ans.set(max-1,(minn[i] + maxx[max-1] + carry));
                --max;
                carry = 0;
                continue;
            }
            ans.set(max-1,((minn[i] + maxx[max-1] +carry)%10));
            carry = 1;
            --max;
        }
        if(x!=min){
            for(int i=max-1;i>=0;--i){
                if(maxx[i]+carry<10){
                    ans.set(i,maxx[i] + carry);
                    carry = 0;
                    continue;
                }
                ans.set(i,(maxx[i] + carry)%10);
                carry = 1;
            }
        }if(carry==1){
            ans.add(0,1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        int max = Math.max(a.length,b.length);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<max;++i){
            ans.add(0);
        }
        System.out.print(answer(a,b,ans));
    }
}
