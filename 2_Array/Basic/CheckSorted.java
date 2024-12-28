import java.util.Scanner;

public class CheckSorted {
    public static void Check(int [] arr){
        boolean g = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    g = false;
                }
            }
        }

        if(g){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Check(arr);
        sc.close();
    }
}
