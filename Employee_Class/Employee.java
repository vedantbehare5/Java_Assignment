import java.util.Scanner;

class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Emp No: ");
        empno = sc.nextInt();
        System.out.print("Enter Name: ");
        ename = sc.next();
        System.out.print("Enter Basic: ");
        basic = sc.nextFloat();
        System.out.print("Enter HRA: ");
        hra = sc.nextFloat();
        System.out.print("Enter DA: ");
        da = sc.nextFloat();

        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " NetPay: " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata();
        e.dispdata();
    }
}