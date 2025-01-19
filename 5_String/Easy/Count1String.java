import java.util.Scanner;

public class Count1String{
    public static int countStringsWithConsecutiveOnes(int n) {
        int totalStrings = (int) Math.pow(2, n);
        int countWithConsecutiveOnes = 0;

        for (int i = 0; i < totalStrings; i++) {
            String binaryString = Integer.toBinaryString(i);
            while (binaryString.length() < n) {
                binaryString = "0" + binaryString;
            }
            if (binaryString.contains("11")) {
                countWithConsecutiveOnes++;
            }
        }
        return countWithConsecutiveOnes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of binary strings (n): ");
        int n = sc.nextInt();

        int result = countStringsWithConsecutiveOnes(n);
        System.out.println("Number of strings with consecutive 1's: " + result);

        sc.close();
    }
}
