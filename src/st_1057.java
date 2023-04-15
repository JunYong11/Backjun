import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class st_1057 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int kim,lm;
		int count =0;
		int N = Integer.parseInt(br.readLine());
		kim = Integer.parseInt(br.readLine());
		lm = Integer.parseInt(br.readLine());
		
		while(kim != lm) {
			kim = kim/2 + kim%2;
			lm = lm/2 + lm%2;
			count++;
		}
		
		System.out.print(count);
		
	}

}
