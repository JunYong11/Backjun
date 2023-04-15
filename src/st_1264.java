import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;
public class st_1264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int temp = 0;
		
		while(true) {
			String arr = sc.nextLine();
			
			for(int i = 0;i<arr.length();i++) {
				char a = arr.charAt(i);
				
				if(a == '#') {
					temp++;
					break;
				}
				
				switch(a) {
				case 'a':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
				case 'A':
					count++;
					break;
				case 'I':
					count++;
					break;
				case 'E':
					count++;
					break;
				case 'O':
					count++;
					break;
				case 'U':
					count++;
					break;
					
				}
				
			}
			System.out.println(count);
			count = 0;
			if(temp == 1) {
				break;
			}
		}
	}

}
