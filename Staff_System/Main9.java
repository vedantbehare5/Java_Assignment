class Staff {
    void work() { System.out.println("Staff Working"); }
}

class Doctor extends Staff {
    void work() { System.out.println("Treating Patients"); }
}

class Nurse extends Staff {
    void work() { System.out.println("Assisting Doctor"); }
}

class Receptionist extends Staff {
    void work() { System.out.println("Managing Desk"); }
}

class Main9 {
    public static void main(String[] args) {
        Staff s;

        s = new Doctor();
        s.work();

        s = new Nurse();
        s.work();

        s = new Receptionist();
        s.work();
    }
}