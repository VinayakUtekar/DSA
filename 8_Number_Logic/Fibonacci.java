public class Fibonacci {
	public static void main(String[] args) {
        int n = 10; // Number of terms in the series
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }
    }
}