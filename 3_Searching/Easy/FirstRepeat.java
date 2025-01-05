package Easy;

import java.util.Scanner;

public class FirstRepeat {
    public static void Miss(int [] arr){
        int repeating = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    repeating = arr[i];
                    break;
                }
            }
        }
        System.out.println("Repeating: " + repeating);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Miss(arr);
        sc.close();
    }
}
