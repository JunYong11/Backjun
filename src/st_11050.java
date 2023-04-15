import java.util.Scanner;

public class st_11050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		int [][] arr = new int[n+1][r+1];
		
		System.out.print("");

	}
	
	int fac(int n, int r) {
		
		if(fac(n,r)>0) {
			return fac(n,r);
		}
		if(n == r || r == 0) {
			return 1;
		}
		return fac(n-1,r-1) + fac(n-1,r);
	}
	
	

}
