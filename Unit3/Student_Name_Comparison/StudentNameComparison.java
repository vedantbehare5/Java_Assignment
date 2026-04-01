import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if(name1.equals(name2)) {
            System.out.println("Same (case-sensitive)");
        } else {
            System.out.println("Different (case-sensitive)");
        }

        if(name1.equalsIgnoreCase(name2)) {
            System.out.println("Same (ignore case)");
        } else {
            System.out.println("Different (ignore case)");
        }
    }
}