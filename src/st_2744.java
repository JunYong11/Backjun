import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class st_2744 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String number = br.readLine();
		for(int i =0;i<number.length();i++) {
			char c = number.charAt(i);
			
			if(Character.isUpperCase(c)) {
				System.out.print(String.valueOf(c).toLowerCase());
				
			}
			else System.out.print(String.valueOf(c).toUpperCase());
		}

	}

}
