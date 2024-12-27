import java.util.Scanner;

public class Large3 {
    public static void Larg(int[] arr){
        int [] ans = new int[3];
        ans[0] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=ans[0]){
                ans[1] = ans[0];
                ans[0] = arr[i];
            }
            else if(arr[i]<ans[0] && arr[i]>=ans[1]){
                ans[3] = ans[2];
                ans[2] = ans[i];
            }
            else if(arr[i]<ans[0] && arr[i]<ans[1] && arr[i]>=ans[2]){
                ans[3] = arr[i];
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Larg(arr);
        sc.close();
    }

}
