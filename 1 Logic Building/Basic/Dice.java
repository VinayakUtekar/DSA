import java.util.Scanner;
public class Dice{
    public static void Dic(int n){
        if(n<0 || n>6){
            System.out.println("Invalid");
        }
        else if(n==1){
            System.out.println(6);
        }
        else if(n==2){
            System.out.println(5);
        }
        else if(n==3){
            System.out.println(4);
        }
        else if(n==4){
            System.out.println(3);
        }
        else if(n==5){
            System.out.println(2);
        }
        else if(n==6){
            System.out.println(1);
        }
    }
    public static void Dic1(int n){
        System.out.println(7-n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dic(n);
        Dic1(n);
        sc.close();
    }
}