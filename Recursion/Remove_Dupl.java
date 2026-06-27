public class Remove_Dupl {
    public static String dup(String s, boolean []arr, int index) {
        if(index==s.length()){
            return "";
        }
        if(arr[s.charAt(index)-'a']==false){
            arr[s.charAt(index)-'a']=true;
            return s.charAt(index)+dup(s,arr,index+1);
        }
        else{
            return dup(s,arr,index+1);
        }
    }
    public static void main(String[] args) {
        boolean []arr = new boolean[26];
        System.out.println(dup("aabbccdd",arr,0));
    }
}
