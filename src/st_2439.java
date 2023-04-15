import java.util.Scanner;
public class st_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0;i<num;i++) {
			for(int j = num;j>i+1;j--) {
				System.out.print(" ");
			}
			for(int s = 0;s<i+1;s++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
