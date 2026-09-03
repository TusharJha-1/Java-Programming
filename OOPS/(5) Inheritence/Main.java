import java.util.*;
public class Main {
    public static void main(String[] args) {
        Box box = new Box(1,3,2);
        Box box2 = new Box(box);
        System.out.println("Length : "+box2.length+"\nWidth : "+box2.width+"\nHeight : "+box2.height);
    }
    
}
