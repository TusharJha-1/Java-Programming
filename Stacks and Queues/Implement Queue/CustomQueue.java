public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = -1;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end==data.length-1;
    }

    public boolean isEmpty(){
        return end==-1;
    }

    public boolean offer(int value){
        if(isFull()){
            return false;
        }
        data[++end] = value;
        return true;
    }

    public int poll() throws Exception{
        if(isEmpty()){
            throw new Exception("Underflow error!!");
        }
        int removed = data[0];
        for(int i=1;i<=end;++i){
            data[i-1] = data[i];
        }
        --end;
        return removed;
    }
    
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        return data[0];
    }

    public int last() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty!!");
        }
        return data[end];
    }

    public void display(){
        for(int i=0;i<=end;++i){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }
}
