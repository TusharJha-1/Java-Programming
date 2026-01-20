//As per complexities both have same but 
//If the goal is to just print the reversed string (Go for code 1)
//If the goal is to actually modify the string to reversed string in memory (Go for code 2)

//Code 1

// public class Abc {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello");
//         for(int i=sb.length()-1;i>=0;i--){
//             System.out.print(sb.charAt(i));
//         }
//     }
// }

//Code 2

public class Abc{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        for(int i=0;i<sb.length()/2;i++){
            char front=sb.charAt(i);
            char back=sb.charAt(sb.length()-1-i);
            sb.setCharAt(i, back);
            sb.setCharAt(sb.length()-1-i, front);
        }
        System.out.print(sb);
    }
}