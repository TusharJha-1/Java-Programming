import java.util.*;

public class LL{
    private ListNode head;
    private ListNode tail;
    
    private int size;
    public LL(){
        this.size = 0;
    }

    public class ListNode{
        private int val;
        private ListNode next;

        public ListNode(){
            this.val = 0;
            this.next = null;
        }
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
        public ListNode(int val,ListNode nextNode){
            this.val = val;
            this.next = nextNode;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        System.out.print("Enter the initial no.of nodes to create :");
        int n = sc.nextInt();
        for(int i=0;i<n;++i){
            System.out.print("Enter the value for node " + (i+1) + " : ");
            int value = sc.nextInt();
            ListNode newNode = list.new ListNode();
            newNode.val = value;
            if(list.head == null){
                list.head = newNode;
                list.tail = newNode;
            }
            else{
                list.tail.next = newNode;
                list.tail = newNode;
            }
        }
        System.out.println("The linked list is :");
        ListNode temp = list.head;
        while(temp!=null){
            System.out.print("["+temp.val+"] -> ");
            temp = temp.next;
            ++list.size;
        }
        System.out.println("null");
        System.out.println("The size of the linked list is : " + list.size);
        sc.close();
    }
}

