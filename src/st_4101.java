import java.util.Scanner;
public class st_4101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if(num1 ==0&&num2 ==0) {
				break; 
			}
			
			if(num1 > num2) {
				System.out.println("Yes");
			}
			else if(num1<=num2) {
				System.out.println("No");
			}
			

			
		}
	}

}
