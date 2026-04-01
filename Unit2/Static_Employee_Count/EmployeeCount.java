class EmployeeCount {
    static int count = 0;

    EmployeeCount() {
        count++;
    }

    static void show() {
        System.out.println("Total Employees: " + count);
    }

    public static void main(String[] args) {
        new EmployeeCount();
        new EmployeeCount();
        new EmployeeCount();

        show();
    }
}