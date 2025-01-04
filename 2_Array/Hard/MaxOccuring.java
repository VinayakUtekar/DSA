import java.util.Scanner;

public class MaxOccuring {
    public static void Occ(int [] L, int [] R){
        int maxRange = 1000000; 
        int[] freq = new int[maxRange + 2]; 
        for (int i = 0; i < L.length; i++) {
            freq[L[i]]++;
            freq[R[i] + 1]--;
        }
        int maxFreq = 0;
        int result = 0;
        int currentFreq = 0;
        for (int i = 0; i <= maxRange; i++) {
            currentFreq += freq[i];
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                result = i;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int [] a2 = new int[n];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        Occ(a,a2);
        sc.close();
    }
}