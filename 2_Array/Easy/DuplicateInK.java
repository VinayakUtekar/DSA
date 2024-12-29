import java.util.Scanner;

public class DuplicateInK {
    public static void Dup(int[] a, int k){
        boolean b = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j<=k && (i+j)<a.length; j++) {
                int c = i + j;
                if(a[i] == a[c]){
                    b = true;
                }
            }
        }
        if(b){
            System.out.println("Duplicate");
        }
        else{
            System.out.println("No Duplicate");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Dup(arr,k);
        sc.close();
    }
}
