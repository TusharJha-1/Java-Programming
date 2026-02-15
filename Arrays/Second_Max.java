public class Second_Max {
    public static void main(String[] args) {
        int []arr = {-1,5,8,0,-100,4};
        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>x){
                y = x;
                x=i;
            }

        }
        System.out.println(y);
    }
}
