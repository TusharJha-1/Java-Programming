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
    }

    public void insertRec(ListNode tempHead,int value,int index){
        if(index==0){
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
            if(tail==null){
                tail = newNode;
            }
            ++size;
            return;
        }

        if(tempHead==null || index<0){
            System.out.println("Index out of bounds");
            return;
        }
        if(index==1){
            ListNode newNode = new ListNode(value);
            newNode.next = tempHead.next;
            tempHead.next = newNode;
            if(newNode.next==null){
                tail = newNode;
            }
            ++size;
        }
        else{
            if(tempHead.next==null){
                System.out.println("Index out of bounds");
                return;
            }
            insertRec(tempHead.next,value,index-1);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        list.insertRec(list.head, 1, 0);
        list.insertRec(list.head, 9, 0);
        list.insertRec(list.head, 5, 0);
        list.insertRec(list.head, 3, -1);
        list.insertRec(list.head, 7, 4);

        ListNode temp = list.head;
        System.out.println("The currentlinked list is :");
        while (temp != null) {
            System.out.print("[" + temp.val + "] -> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("The size of the linked list is : " + list.size);
        sc.close();
    }

}