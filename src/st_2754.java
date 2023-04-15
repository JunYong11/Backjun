import java.util.Scanner;
public class st_2754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String point = sc.nextLine();
		double result = 0;
		for(int i = 0;i<point.length();i++) {
			char c = point.charAt(i);
			switch(c) {
			
			case 'A':
				result = 4;
				break;
				
			case 'B':
				result = 3;
				break;
				
			case 'C':
				result = 2;
					break;
			case 'D':
				result = 1;
				break;
				
			case 'F':
				result = 0;
				break;
				
			default:
				break;
			}
			switch(c) {
			case '+':
				result += 0.3;
				break;
			case '-':
				result -= 0.3;
				break;
			default:
				 break;
			}
			
		}
		
		System.out.print(result);

	}

}
