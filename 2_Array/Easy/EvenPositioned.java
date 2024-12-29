import java.util.Scanner;

public class EvenPositioned {
    public static void Even(int[]a){
        for (int i = 0; i < a.length; i++) {
            if(i!=0){
                if(a[i-1]>= a[i]){
                    if(i%2==1){
                        int temp = a[i-1];
                        a[i-1] = a[i];
                        a[i] = temp; 
                    }
                }
                else if(a[i-1]<= a[i]){
                    if(i%2==0){
                        int temp = a[i-1];
                        a[i-1] = a[i];
                        a[i] = temp; 
                    }
                }
            }
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Even(arr);
        sc.close();
    }
}
