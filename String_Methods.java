import java.util.Scanner;
public class String_Methods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //LowerCase
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        //sc.nextLine();
        System.out.println(s1.toLowerCase());

        //Replace
        System.out.print("Enter a string: ");
        String s2 = sc.nextLine();
        System.out.println(s2.replace(' ','_'));

        //Letter format
        System.out.print("Enter a string: ");
        String s3 = sc.nextLine();
        String letter = "Dear <|name|>, Thanks a lot!!%n";
        System.out.format(letter.replace("<|name|>","%s"),s3);

        //Detecting double and triple spaces without loops
        System.out.print("Enter a string: ");
        String s4 = sc.nextLine();
        System.out.println(s4.indexOf("  "));
        System.out.println(s4.indexOf("   "));

        //Escape Sequence
        String letter1 = "\"Dear Tushar, You\'ll be successful in life.\"";
        System.out.println(letter1);
    }
}
