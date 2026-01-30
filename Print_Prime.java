import java.util.Scanner;
public class Print_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers you want to print : ");
        int num = sc.nextInt();
        int count = 0;
        int j=3;
        if(num>=1){
            System.out.print(2+", ");
            count++;
        }
        while(count<num){
            for(int i=2;i<j;++i){
                if(j%i==0){
                    break;
                }
                else{
                    if(i==j-1){
                        ++count;
                        System.out.print(j+", ");
                    }
                }

            }
            ++j;
        }
    }
}
