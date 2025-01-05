import java.util.Scanner;

public class Binary {
    public static void Bin(int [] arr, int k){
        int l=0, h=arr.length-1;
        while(l <= h){
            int m = l + (h-l) / 2;
            if(arr[m]==k){
                System.out.println("Element at : " + m);
                break;
            }
            else if(arr[m] < k){
                l = m+1;
            }
            else if(arr[m] > k){
                h = m-1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Bin(arr,k);
        sc.close();
    }
}
