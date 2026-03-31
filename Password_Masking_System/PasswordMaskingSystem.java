import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        String visible = password.substring(password.length() - 2);
        String masked = password.substring(0, password.length() - 2)
                                 .replaceAll(".", "*");

        System.out.println("Masked Password: " + masked + visible);
    }
}