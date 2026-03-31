abstract class Employee1 {
    abstract double calculateBonus();
}

class Manager extends Employee1 {
    double calculateBonus() {
        return 50000 * 0.2;
    }
}

class Developer extends Employee1 {
    double calculateBonus() {
        return 40000 * 0.1 + 5000;
    }
}

class Main {
    public static void main(String[] args) {
        Employee1 e;

        e = new Manager();
        System.out.println("Manager Bonus: " + e.calculateBonus());

        e = new Developer();
        System.out.println("Developer Bonus: " + e.calculateBonus());
    }
}