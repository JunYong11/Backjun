import java.util.Scanner;
public class st_1052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int num = 0;
		int result = 0;
		int i = 0;
		int count = 0;
		
		if(K>=N) {
			System.out.println(0);
			return;
		}
		
		while(true) {
			num = N+i;
			result = N+i;
			count = 0;
			while(num != 0) {
				if(num % 2 ==1) {
					count++;
					num = num / 2;
				}
				else if(num % 2 ==0) {
					num = num / 2;
				}
			}
			if(K>=count) {
				System.out.println(result - N);
				break;
			}
			i++;
		}
	}
}
