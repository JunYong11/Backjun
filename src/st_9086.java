import java.util.Scanner;
public class st_9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		int al = 0;
		while(al != test) {
			
			String arr = sc.next();
			
			for(int j = 0;j<arr.length();j++) {
				char a = arr.charAt(j);
				if(arr.length() == 1) {
					System.out.print(a+""+a);
					break;
				}
				if(j==0 || j == arr.length()-1) {
					System.out.print(a);
				}
			}
			System.out.println(" ");
			al++;
		}
	}

}

