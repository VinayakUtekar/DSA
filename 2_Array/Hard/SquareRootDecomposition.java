public class SquareRootDecomposition {
    static int[] arr = new int[10000]; 
    static int query(int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
    }
 
    public static void main(String[] args) {
        int[] input = {1, 5, 2, 4, 6, 1, 3, 5, 7, 10};
        int n = input.length;
 
        System.arraycopy(input, 0, arr, 0, n);
 
        System.out.println("query(3,8) : " + query(3, 8));
        System.out.println("query(1,6) : " + query(1, 6));
        arr[8] = 0; 
        System.out.println("query(8,8) : " + query(8, 8));
    }
}
