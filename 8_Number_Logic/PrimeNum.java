public class PrimeNum {

	public static void main(String[] args) {
		int n = 23, count=2;
		if(n == 0 || n ==1 ) {
			System.out.println(n + " not a prime number");
		}
		else{
			for(int i=2; i<=n/2; i++)
			{
				if(n % i ==0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(n + " is a prime number");
			}
			else {
				System.out.println(n + " not a prime number");
			}
		}
	}

}