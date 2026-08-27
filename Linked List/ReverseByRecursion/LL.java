import java.util.*;

public class LL {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LL() {
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

    public void insertRec(ListNode tempHead, int value, int index) {
        if (index == 0) {
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            ++size;
            return;
        }

        if (tempHead == null || index < 0) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 1) {
            ListNode newNode = new ListNode(value);
            newNode.next = tempHead.next;
            tempHead.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
            ++size;
        } else {
            if (tempHead.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
            insertRec(tempHead.next, value, index - 1);
        }

    }

    public void reverseRec(ListNode tempHead){
        if(tempHead==null){
            return;
        }
        if(tempHead==tail){
            head = tail;
            return;
        }
        reverseRec(tempHead.next);

        tail.next = tempHead;
        tail = tempHead;
        tail.next = null;
    }
    public void display(ListNode tempHead){
        while(tempHead!=null){
            System.out.print("["+tempHead.val+"] -> ");
            tempHead = tempHead.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        list.insertRec(list.head, 1, 0);
        list.insertRec(list.head, 2, 1);
        list.insertRec(list.head, 3, 2);
        list.insertRec(list.head, 4, 3);
        list.insertRec(list.head, 5, 4);
        System.out.println("The linked list is :");
        list.display(list.head);
        list.reverseRec(list.head);
        System.out.println("The reversed linked list is :");
        list.display(list.head);
        System.out.println("The size of the linked list is : " + list.size);

        sc.close();
    }
}