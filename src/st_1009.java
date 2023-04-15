import java.util.Scanner;
public class st_1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		int count = 0;
		long num = 1;
		while(true) {
			if(count == test) {
				break;
			}
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			for(int i = 0;i<b;i++) {
				num = num * a;
			}
			long result = num;
			num = 1;
			System.out.println(result);
			count++;
			
		}
	}

}
