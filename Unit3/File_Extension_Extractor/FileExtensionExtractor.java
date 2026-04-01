import java.util.Scanner;

class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        int index = fileName.lastIndexOf('.');
        String ext = fileName.substring(index + 1);

        System.out.println("Extension: " + ext);
    }
}