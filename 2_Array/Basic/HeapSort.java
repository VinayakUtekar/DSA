import java.util.Scanner;

public class HeapSort {
    static void Heapif(int arr[], int n, int i) {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            Heapif(arr, n, largest);
        }
    }

    public static void Heap(int arr []){
        int n = arr.length;
        for(int i=n/2-1; i>=0;i--){
            Heapif(arr,n,i);
        }
        for(int i=n-1; i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            Heapif(arr,i,0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        Heap(a);

        for (int i : a) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}