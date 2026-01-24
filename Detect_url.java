import java.util.Scanner;
public class Detect_url {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL : ");
        String url = sc.next();
        if(url.endsWith(".com")){
            System.out.println("It's a commercial website.");
        }
        else if(url.endsWith(".org")){
            System.out.println("It's a organisation website.");
        }
        else if(url.endsWith(".in")){
            System.out.println("It's a indian website.");
        }
    }
}
