import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class st_9372 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			
			int m=Integer.parseInt(st.nextToken());
			for(int j=0;j<m;j++) {
				st = new StringTokenizer(br.readLine());
			}
			System.out.println(n-1);
		}

	}

}