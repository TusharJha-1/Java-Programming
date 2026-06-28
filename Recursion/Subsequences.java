git public class Subsequences{
    public static void subs(String s, int index, String ans){
        if(index==s.length()){
            System.out.println(ans);
            return;
        }
        char currChar = s.charAt(index);
        //to be 
        subs(s,index+1,ans+currChar);
        //not to be
        subs(s,index+1,ans);
    }
    public static void main(String[] args) {
        String s = "abcd";
        subs(s,0,"");
    }
}