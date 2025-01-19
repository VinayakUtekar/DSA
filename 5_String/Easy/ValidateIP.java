import java.util.Scanner;

public class ValidateIP {
    public static void Valid(String s) {
        String[] parts = s.split("\\.");
        if (parts.length != 4) {
            System.out.println("Not Valid");
            return;
        }

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) {
                    System.out.println("Not Valid");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Not Valid");
                return;
            }
        }
        System.out.println("Valid");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an IPv4 address:");
        String s1 = sc.nextLine();
        Valid(s1);
        sc.close();
    }
}
