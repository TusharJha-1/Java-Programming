import java.util.*;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is already full.");
            return false;
        }
        data[++ptr] = value;
        return true;
    }
    
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack Underflow!!");
        }
        int removed = data[ptr--];
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty!!");
        }
        int top = data[ptr];
        return top;
    }

    public int size(){
        return ptr+1;
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack : ");
        int n = sc.nextInt();
        CustomStack stack = new CustomStack(n);
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);
        // stack.push(50);
        if(stack.isFull()){
            System.out.println("Stack is full");
            System.out.println("The popped element is : "+stack.pop());
        }
        else if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        System.out.println("The top-most element is "+stack.peek());
        System.out.println("The size of the stack is "+stack.size());
        System.out.println("The stack looks like:");
        sc.close();
    }
}

