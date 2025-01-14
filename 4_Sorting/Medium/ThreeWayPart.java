import java.util.ArrayList;
import java.util.Scanner;

public class ThreeWayPart {
    public static void Part(int[] a, int n, int l, int h){
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> mid = new ArrayList<>();
        ArrayList<Integer> high = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i] < l){
                low.add(a[i]);
            }
            else if((a[i]>=l)&& (a[i]<=h)){
                mid.add(a[i]);
            }
            else if(a[i]>h){
                high.add(a[i]);
            }
        }
        for (int i : low) {
            System.out.print(i + " ");
        }
        for (int i : mid) {
            System.out.print(i + " ");
        }
        for (int i : high) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int h = sc.nextInt();
        Part(a, n, l, h);
        sc.close();
    }
}
