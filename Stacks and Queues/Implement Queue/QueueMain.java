import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        CustomQueue queue = new CustomQueue(size);
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        queue.display();

        System.out.println("The polled element is : "+queue.poll());
        System.out.println("The polled element is : "+queue.poll());
        queue.display();
    }
}
