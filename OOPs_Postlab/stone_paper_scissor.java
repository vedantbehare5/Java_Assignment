import java.util.Random;
import java.util.Scanner;
class WhosWin{
    String user1;
    String user2;
    WhosWin(String user1,String user2){
        this.user1=user1;
        this.user2=user2;
    }
    int result(String user1,String user2){
        if(user1.equals(user2)){
            return 0;
        }
        else if(user1.equals("Rock") && user2.equals("Scissor")){
            return 1;
        }
        else if(user1.equals("Paper") && user2.equals("Rock")){
            return 1;
        }
        else if(user1.equals("Scissor") && user2.equals("Paper")){
            return 1;
        }
        else{
            return -1;
        }
    }
}
class stone_paper_scissor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ra=new Random();
        int ravar=ra.nextInt(100);
        String user1;
        if(ravar<30){
            user1="Rock";
        }else if(ravar>30 && ravar<60){
            user1="Paper";
        }else{
            user1="Scissor";
        }
        
        System.out.print("Enter your choice : ");
        String user2=sc.nextLine();
       System.out.println("Computer choice is :"+user1);
        WhosWin a=new WhosWin(user1,user2);
        int indicates=a.result(user1,user2);
        if(indicates==-1){
            System.out.println("Computer chose "+user1+".You win!");
        }else if(indicates==0){
            System.out.println("Computer chose "+user1+".Match Draw!");
        }else{
            System.out.println("Computer chose "+user1+".You Lose!");
        }
    }
    }
