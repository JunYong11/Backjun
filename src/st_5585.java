import java.util.Scanner;
public class st_5585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int n = 1000 - number;
		System.out.println(n);
		int result = greedy(n);
		System.out.println(result);
		
	}
	
	static int greedy(int n) {
		int num1 = 0;
		int num2 = 0;
		
		if(n >= 500) {
			num1 += n % 500;
			num2 += n / 500;
			n %= 500;
			
			System.out.println(n);
		}
		if(n >= 100 || n < 500) {
			num1 += n % 100;
			num2 += n / 100;
			n %= 100;
			System.out.println(n);
		}
		if(n >= 50 || n < 100) {
			num1 += n % 50;
			num2 += n / 50;
			n %= 50;
			System.out.println(n);
		}
		if(n >= 10 || n < 50) {
			num1 += n % 10;
			num2 += n / 10;
			n %= 10;
			System.out.println(n);
		}
		if(n >= 5 || n < 10) {
			num1 += n % 5;
			num2 += n / 5;
			n %= 5;
			System.out.println(n);
		}
		if(n >= 1 || n < 5) {
			num1 += n % 1;
			num2 += n / 1;
			n %= 1;
			System.out.println(n);
		}
		
		return num2;
	}

}
