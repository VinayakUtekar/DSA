import java.util.Scanner;

public class RearrangeArrayAiI{
    public static void Find(int [] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == i){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                arr[i] = -1;
            }
        }
        for (int i : arr) {
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
        Find(arr);
        sc.close();
    }
}