import java.util.Scanner;
public class TwoSum{
    public static void Find(int [] a, int t){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if(sum == t){
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        Find(arr,t);
        sc.close();
    }
}