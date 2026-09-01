import java.util.*;

public class Trees {
    private Node root;
    private int height;

    public Trees(){
        this.height = 0;
    }

    public static class Node{
        private int val;
        private Node left;
        private Node right;

        public Node(){
            this.val = 0;
            this.left = null;
            this.right = null;
        }

        public Node(int value){
            this.val = value;
            this.left = null;
            this.right = null;
        }

        public Node(int value, Node leftChild, Node rightChild){
            this.val = value;
            this.left = leftChild;
            this.right = rightChild;
        }
    }

    private static void insert(Scanner sc){
        System.out.print("Enter the root node value: ");
        int root = sc.nextInt();
        insertion(root);
    }
    private static void insertion(Scanner sc, Node node){
        System.out.print("Do you want to enter the left of "+node.val+" :");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter the value of left node : ");
            int value = sc.nextInt();
            node.left = new Node(value);
            insertion(sc, node);
        }

        System.out.print("Do you want to enter the right of " + node.val + " :");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.print("Enter the value of right node : ");
            int value = sc.nextInt();
            node.right = new Node(value);
            insertion(sc, node);
        }
    }
}
