import java.util.Scanner;

public class CycleSort {
    public static void Cycle(int [] arr){
        int n = arr.length;
        for(int c=0; c<n-2; c++){
            int it = arr[c];
            int p = c;
            for(int i=c+1; i<n; i++){
                if(arr[i]<it){
                    p++;
                }
            }
            if(p==c){
                continue;
            }
            while(it==arr[p]){
                p++;
            }
            int t = arr[p];
            arr[p] = it;
            it = t;
            while (p != c){
                p=c;
                for(int i=c+1; i<n; i++){
                    if(arr[i] < it){
                        p++;
                    }
                }
                while(it==arr[p]){
                    p++;
                }
                t = arr[p];
                arr[p] = it;
                it = t;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        Cycle(a);

        for (int i : a) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}