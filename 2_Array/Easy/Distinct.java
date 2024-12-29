import java.util.ArrayList;
import java.util.Scanner;

public class Distinct{
    public static void Dist(int[]arr){
        ArrayList<Integer> a = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(!a.contains(arr[index])){
                a.add(arr[index]);
            }
        }
        for (Integer integer : a) {
            System.out.print(integer + " ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Dist(arr);
        sc.close();
    }
}