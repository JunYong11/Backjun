import java.util.Scanner;
public class st_14501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//일할수 있는 일수 입력
		int arr[][] = new int[2][N];
		
		int num = N-1;
		for(int i =0;i<N;i++) {
			arr[0][N] = sc.nextInt();	//걸리는 일수 입력
			arr[1][N] = sc.nextInt();	//금액 입력
		}
		int week = 0;
		int money = 0;
		int result = 0;
		int sum_week = 0;
		int sum_money = 0;
		for(int i = 0;i<N;i++) {
			week = arr[0][i];
			money = arr[1][i];
			sum_week += week;
			sum_money += money;
			
			for(int j = 0;j<N;j++) {
				
			}
			
		}
	}

}
