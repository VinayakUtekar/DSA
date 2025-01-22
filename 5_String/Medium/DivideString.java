import java.util.Scanner;

public class DivideString {
    public static String divideLargeNumber(String number, int divisor) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        int temp = number.charAt(index) - '0';

        while (temp < divisor && index < number.length() - 1) {
            temp = temp * 10 + (number.charAt(++index) - '0');
        }

        while (index < number.length()) {
            result.append(temp / divisor);
            temp = (temp % divisor) * 10 + (index + 1 < number.length() ? number.charAt(++index) - '0' : 0);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int divisor = sc.nextInt();
        System.out.println(divideLargeNumber(number, divisor));
        sc.close();
    }
}
