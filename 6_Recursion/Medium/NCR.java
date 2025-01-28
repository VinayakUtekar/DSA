import java.util.Scanner;

public class NCR{
    public static int cmob(int n, int r){
        if(n<r){
            return 0;
          }
          if(r == 0){
              return 1;
          }
          if(r == 1){
              return n;
          }
          if(n == 1){
              return 1;
          }
          return cmob(n-1,r-1)+cmob(n-1,r);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int res = cmob(n, r);
        System.out.println(res);
        sc.close();
    }
}