import java.util.Scanner;
public class st_4999 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String voice1 = sc.nextLine();
		String voice2 = sc.nextLine();
		
		if(voice1.length()>voice2.length()) {
			System.out.print("Go");
		}
		else System.out.print("No");
	}

}

