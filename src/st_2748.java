import java.util.Scanner;

public class st_2748 {
	
	static int [] dp;
	
	static int Fibo(int n) {
		if(dp[n] == -1) {
			dp[n] = Fibo(n-1)+Fibo(n-2);
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		dp = new int[num+1];
		for(int i = 0;i<num+1;i++) {
			dp[i] = -1;
		}
		
		dp[0] = 0;
		dp[1] = 1;
		
		System.out.println(Fibo(num));
		
	}
	
	

}
