import java.util.Scanner;

public class MaxOverlapPoint {
    public static void findMaxOverlap(int[] arrl, int[] exit) {
        int maxTime = 0; 
        int maxGuests = 0; 
        int guests = 0;
        int n = arrl.length;
        int[] timeline = new int[2 * n];
        for (int i = 0; i < n; i++) {
            timeline[i] = arrl[i];  
            timeline[n + i] = exit[i];  
        }
        java.util.Arrays.sort(timeline);
        for (int time : timeline) {
            for (int i = 0; i < n; i++) {
                if (time >= arrl[i] && time < exit[i]) {
                    guests++;
                }
            }
            if (guests > maxGuests) {
                maxGuests = guests;
                maxTime = time;
            }
            guests = 0; 
        }
        System.out.println("Time of maximum guests: " + maxTime);
        System.out.println("Maximum guests: " + maxGuests);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of guests:");
        int n = sc.nextInt();
        int[] arrl = new int[n];
        int[] exit = new int[n];
        System.out.println("Enter the arrival times:");
        for (int i = 0; i < n; i++) {
            arrl[i] = sc.nextInt();
        }
        System.out.println("Enter the exit times:");
        for (int i = 0; i < n; i++) {
            exit[i] = sc.nextInt();
        }
        findMaxOverlap(arrl, exit);
        sc.close();
    }
}
