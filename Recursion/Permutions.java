import java.util.HashSet;
public class Permutions {
    public static void permutation(String str,String ans, HashSet<String> set){
        if(str.length()==0){
            set.add(ans);
            return;
        }
        for(int i=0;i<str.length();++i){
            char currChar = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            permutation(newstr,ans+currChar, set);
        }
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        permutation(str,"",set);
        for(String s:set){
            System.out.println(s);
        }
    }
}

