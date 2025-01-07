import java.util.Scanner;

public class ThreeCloseThreeArray {
    public static void Find(int [] a, int [] a2, int [] a3){
        int min = Integer.MAX_VALUE;
        int [] res = new int [3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                for (int j2 = 0; j2 < a3.length; j2++) {
                    int d = Math.max(Math.abs(a[i]-a2[j]), Math.max(Math.abs(a2[j]-a3[j2]), Math.abs(a3[j2]-a[i])));
                    if(d<min){
                        min = d;
                        res[0] = a[i];
                        res[1] = a2[j];
                        res[2] = a3[j2];
                    }
                }
            }
        }
        for (int i : res) {
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
        int n2 = sc.nextInt();
        int [] arr2 = new int [n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int n3 = sc.nextInt();
        int [] arr3 = new int [n3];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }
        Find(arr, arr2, arr3);
        sc.close();
    }
}
