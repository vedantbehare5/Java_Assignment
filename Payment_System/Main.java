abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Net Banking Payment: " + amount);
    }
}

class Main {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay(500);

        p = new UPIPayment();
        p.pay(1000);

        p = new NetBankingPayment();
        p.pay(1500);
    }
}