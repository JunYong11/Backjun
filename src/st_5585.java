import java.util.Scanner;
public class st_5585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int n = 1000 - number;
		System.out.println(greedy1(n));
	}
	
	static int greedy(int n) {
		int num1 = 0;
		int num2 = 0;
		
		if(n >= 500) {
			num1 += n % 500;
			num2 += n / 500;
			n %= 500;
		}
		if(n >= 100 || n < 500) {
			num1 += n % 100;
			num2 += n / 100;
			n %= 100;
		}
		if(n >= 50 || n < 100) {
			num1 += n % 50;
			num2 += n / 50;
			n %= 50;
		}
		if(n >= 10 || n < 50) {
			num1 += n % 10;
			num2 += n / 10;
			n %= 10;
		}
		if(n >= 5 || n < 10) {
			num1 += n % 5;
			num2 += n / 5;
			n %= 5;
		}
		if(n >= 1 || n < 5) {
			num1 += n % 1;
			num2 += n / 1;
		}
		
		return num2;
	}
	
	static int greedy1(int n) {
		int [] coin = {500, 100, 50, 10, 5, 1};
		int result = 0;
		for(int i = 0;i<6;i++) {
			if(n >= coin[i]) {
				result = result + n / coin[i];
				n = n % coin[i];
				if(n == 0) {
					break;
				}
			}
		}
		return result;
	}
}