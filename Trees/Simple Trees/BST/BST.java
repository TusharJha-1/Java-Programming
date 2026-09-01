public class BST{
    private Node root;

    public class Node{
        private int val;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.val = value;
        }

        public int getValue(){
            return val;
        }
    }

    public BST(){

    }

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display(root,"Root Node : ");
    }
    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left Child of "+node.getValue()+" : ");
        display(node.right, "Right Child of " + node.getValue() + " : ");
    }

    public void insert(int value){
        insert(value,root);
    }
    private Node insert(int value, Node node){
        if(node==null){
            node = new Node(value);
        }
        if(value<node.val){
            node.left = insert(value, node.left);
        }
        else{
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left),height(node.right));
        return node;
    }

    public static void main(String[] args) {
        
    }
}