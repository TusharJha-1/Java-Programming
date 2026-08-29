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

    public void display(){
        for(int i=0;i<=ptr;++i){
            System.out.println("[ "+data[i]+" ]");
        }
        System.out.println("END");
    }
}

