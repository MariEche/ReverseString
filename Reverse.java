import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        String s = " ";
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something to reverse:");
        s = scanner.nextLine();
        scanner.close();

        for (int i = s.length() - 1 ; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
