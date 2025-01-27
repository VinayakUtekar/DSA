public class LengthLongestPalindrome {
    public static int Find(String st, int s, int e, int count){
        if(s>e){
            return count;
        }
        if(s==e){
            return count+1;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = Find(s,0,s.length(),0);
        System.out.println(count);
    }
}
