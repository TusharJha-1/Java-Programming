import java.util.ArrayList;

public class Subset {
    public static void subset(int n, ArrayList<Integer> list){
        if(n==0){
            for(int i=0;i<list.size();++i){
                System.out.print(list.get(i));
            }
            System.out.println();
            return;
        }
        //include
        list.add(n);
        subset(n-1,list);

        //not include
        list.remove(list.size()-1);
        subset(n-1,list);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        subset(n,list);
    }
}
