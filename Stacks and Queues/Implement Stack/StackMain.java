import java.util.*;
public class StackMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack : ");
        int n = sc.nextInt();
        // CustomDynamicStack stack = new CustomDynamicStack(n);
        CustomStack stack = new CustomStack(n);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.peek());
        sc.close();
    }
}
