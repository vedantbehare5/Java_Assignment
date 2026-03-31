class Bank1 {
    final float rate = 5.0f;

    void calculate(double amt) {
        System.out.println("Interest: " + (amt * rate / 100));
    }

    public static void main(String[] args) {
        Bank1 b = new Bank1();
        b.calculate(1000);
    }
}