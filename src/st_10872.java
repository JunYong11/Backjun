import java.util.Scanner;
public class st_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		int result = fibo(N);
		
		System.out.println(result);
		
	}
	static int fibo(int N) {
		if(N <= 1) {
			return 1;
		}
		return N*fibo(N-1);
	}

}
