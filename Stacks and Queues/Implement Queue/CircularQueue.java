public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean offer(int value){
        if(isFull()){
            System.out.println("Overflow");
            return false;
        }
        data[end++] = value;
        end%=data.length;
        ++size;
        return true;
    }

    public int poll() throws Exception{
        if(isEmpty()){
            throw new Exception("Underflow");
        }
        --size;
        front%=data.length;
        return data[front++];

    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty queue");
        }
        return data[front];
    }

    public int last() throws Exception{
        if (isEmpty()) {
            throw new Exception("Empty queue");
        }
        return data[(end+data.length-1)%data.length];
    }

    public void display(){
        for(int i=front;i<end+data.length;++i){
            System.out.print(data[i%data.length]+" -> ");
        }
        System.out.println();
       // System.out.println("START");
    }
}