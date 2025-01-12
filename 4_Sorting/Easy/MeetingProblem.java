import java.util.Scanner;

public class MeetingProblem {
    public static void Meet(int[][] a, int n) {
        boolean res = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][1] > a[j][0] && a[i][0] < a[j][1]) {
                    res = false;
                }
            }
        }
        if (res) {
            System.out.println("No Meeting Overlap");
        } else {
            System.out.println("Meeting Overlap");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of meetings:");
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        System.out.println("Enter the start and end times of each meeting:");
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt(); 
            a[i][1] = sc.nextInt(); 
        }
        Meet(a, n);
        sc.close();
    }
}
