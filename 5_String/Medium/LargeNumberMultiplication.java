import java.math.BigInteger;

public class LargeNumberMultiplication {
    public static String multiplyStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2];

        // Reverse iterate through each digit of both numbers
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // Convert result array to string
        StringBuilder product = new StringBuilder();
        for (int num : result) {
            if (!(product.length() == 0 && num == 0)) { // Skip leading zeros
                product.append(num);
            }
        }

        return product.length() == 0 ? "0" : product.toString();
    }

    public static void main(String[] args) {
        String num1 = "654154154151454545415415454";
        String num2 = "63516561563156316545145146514654";

        System.out.println("Product: " + multiplyStrings(num1, num2));
    }
}
