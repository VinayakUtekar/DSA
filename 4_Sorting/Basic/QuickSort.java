import java.util.Scanner;

public class QuickSort {
    public static void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int Part(int[] arr, int l, int h){
        int p = arr[h];
        int i = l-1;
        for (int j = l; j < h; j++) {
            if(arr[j]< p){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }
    public static void Quick(int [] a, int l, int h){
        if(l<h){
            int pii = Part(a,l,h);
            Quick(a,l,(pii-1));
            Quick(a,(pii+1),h);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        Quick(a,0,nu-1);

        for (int i : a) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}