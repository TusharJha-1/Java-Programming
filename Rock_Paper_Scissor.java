import java.util.*;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int round = 1;
        int CPU = 0;
        int USER = 0;
        System.out.println("Read the instruction and choose your input:-\n1.) Rock\n2.) Paper\n3.) Scissor");
        while(round<=5){
            System.out.format("\n!!!!!!!ROUND NO. %d!!!!!!!\n",round);
            int cpu = rd.nextInt(3) + 1;
            System.out.print("\nEnter your input : ");
            int user = sc.nextInt();
            if(cpu==1 && user==1){
                System.out.format("CPU choice : %d\nUSER choice : %d\n",cpu,user);
                System.out.println("!!!!It's a DRAW!!!!");
                System.out.format("CPU score : %d\nUSER score : %d\n",CPU,USER);
            }
            else if(cpu==1 && user==2){
                System.out.format("CPU choice : %d\nUSER choice : %d\n",cpu,user);
                System.out.println("!!!!User wins this round!!!!");
                USER+=1;
                System.out.format("CPU score : %d\nUSER score : %d\n",CPU,USER);
            }
            else if(cpu==1 && user==3){
                System.out.format("CPU choice : %d\nUSER choice : %d\n",cpu,user);
                System.out.println("!!!!CPU wins this round!!!!");
                CPU+=1;
                System.out.format("CPU score : %d\nUSER score : %d\n",CPU,USER);
            }
            else if(cpu==2 && user==1){
                System.out.format("CPU choice : %d\nUSER choice : %d\n",cpu,user);
                System.out.println("!!!!CPU wins this round!!!!");
                CPU+=1;
                System.out.format("CPU score : %d\nUSER score : %d\n",CPU,USER);
            }
            else if(cpu==2 && user==2){
                System.out.format("CPU choice : %d\nUSER choice : %d\n",cpu,user);
                System.out.println("!!!!It's a DRAW!!!!");
                System.out.format("CPU score : %d\nUSER score : %d\n",CPU,USER);
            }
            else if(cpu==2 && user==3){
                System.out.format("CPU choice : %d\nUSER choice : %d\n",cpu,user);
                System.out.println("!!!!User wins this round!!!!");
                USER+=1;
                System.out.format("CPU score : %d\nUSER score : %d\n",CPU,USER);
            }
            else if(cpu==3 && user==1){
                System.out.format("CPU choice : %d\nUSER choice : %d\n",cpu,user);
                System.out.println("!!!!User wins this round!!!!");
                USER+=1;
                System.out.format("CPU score : %d\nUSER score : %d\n",CPU,USER);
            }
            else if(cpu==3 && user==2){
                System.out.format("CPU choice : %d\nUSER choice : %d\n",cpu,user);
                System.out.println("!!!!CPU wins this round!!!!");
                CPU+=1;
                System.out.format("CPU score : %d\nUSER score : %d\n",CPU,USER);
            }
            else if(cpu==3 && user==3){
                System.out.format("CPU choice : %d\nUSER choice : %d\n",cpu,user);
                System.out.println("!!!!It's a DRAW!!!!");
                System.out.format("CPU score : %d\nUSER score : %d\n",CPU,USER);
            }
            else{
                System.out.format("CPU choice : %d\nUSER choice : %d\n",cpu,user);
                System.out.println("Invalid Argument");
                break;
            }
        round+=1;
        }
        if(USER>CPU){
            System.out.println("\n!!!!User won the game of Rock-Paper-Scissor!!!!");
        }
        else if(USER<CPU){
            System.out.println("\n!!!!CPU won the game of Rock-Paper-Scissor!!!!");
        }
        else{
            System.out.println("\n!!!!The game of Rock-Paper-Scissor is Drawn!!!!");
        }

    }
}
