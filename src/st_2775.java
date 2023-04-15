import java.util.Scanner;
public class st_2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	

		int [][] dp = new int[15][15];
		
		for(int i=0;i<15;i++) {
			dp[0][i]=i;
		}
		
		for(int i = 1;i<15;i++) {
			for(int j = 1;j<15;j++) {
				dp[i][j] = dp[i][j-1]+dp[i-1][j];
			}
		}
		
		for(int i =0;i<T;i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(dp[k][n]);
		}
		
	}


}
