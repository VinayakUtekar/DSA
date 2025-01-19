import java.util.Scanner;

public class GenerateBinary{
    public static void generateStrings(String str, int index) {
        // Base case: If we have processed all characters, print the result
        if (index == str.length()) {
            System.out.println(str);
            return;
        }

        // If current character is '?', replace it with '0' and '1'
        if (str.charAt(index) == '?') {
            // Replace '?' with '0'
            generateStrings(str.substring(0, index) + '0' + str.substring(index + 1), index + 1);

            // Replace '?' with '1'
            generateStrings(str.substring(0, index) + '1' + str.substring(index + 1), index + 1);
        } else {
            // If the current character is not '?', move to the next character
            generateStrings(str, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string with wildcards: ");
        String str = sc.nextLine();

        System.out.println("Generated binary strings:");
        generateStrings(str, 0);

        sc.close();
    }
}
