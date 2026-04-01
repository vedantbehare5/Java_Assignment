import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

        if(withdraw > balance) {
            throw new ArithmeticException("Insufficient Balance");
        } else {
            balance -= withdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}