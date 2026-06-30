public class Invitations {
    public static int invites(int n){
        if(n==1 || n==2){
            return n;
        }
        else{
            //single + pair
            return invites(n-1) + (n-1)*invites(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(invites(4));
    }
}
