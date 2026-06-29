public class Key_Com {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void keyCombination(String str, int index, String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String map = keypad[currChar-'0'];
        for(int i=0;i<map.length();++i){
            keyCombination(str,index+1,combination+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        keyCombination(str,0,"");
    }
}
