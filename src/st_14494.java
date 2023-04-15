import java.util.Scanner;
public class st_14494 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double max = Math.pow(10, 9)+7;
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		double arr[][];
		arr = new double[1010][1010];
		arr[1][1] = 1;
		
		if(n==1 && m ==1) {
			System.out.println(1);
			return;
		}
		else if(n == 0 || m == 0) {
			System.out.println(0);
			return;
		}
		else {
			for(int i =1;i<=n;i++) {
				for(int j = 1;j<=m;j++) {
					if(i*j != 1) {
						arr[i][j] = (arr[i-1][j]%max+arr[i][j-1]%max+arr[i-1][j-1]%max)%max;
					}
					
				}
			}
			
			System.out.println(arr[n][m]%max);
		}
		
	}

}
