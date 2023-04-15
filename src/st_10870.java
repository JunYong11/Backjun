import java.util.Scanner;
public class st_10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(fibona(num));
		
	}
	static int fibona(int num) {
		if(num == 0) {
			return 0;
		}
	    if(num==1) {
			return 1;
		}
	
		return fibona(num-1)+fibona(num-2);
		
	}

}
