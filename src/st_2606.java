import java.io.*;
import java.util.StringTokenizer;
public class st_2606 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int S = Integer.parseInt(br.readLine());
		int [][] com = new int[N][2];
		int [][] result = new int[N][2];
		
		for(int i = 0 ; i<S;i++) {
			com[i][0] = Integer.parseInt(br.readLine());
			com[i][1] = Integer.parseInt(br.readLine());
		}
		
		result[0][0] = com[0][0];
		result[0][1] = com[0][1];
		
		for(int i = 1;i<N;i++) {
			if(result[i-1][0] == com[i][0] || result[i-1][0] == com[i][1] || result[i-1][1] == com[i][0] || result[i-1][1] == com[i][1]) {
				result[i][0] = com[i][0];
				result[i][1] = com[i][1];
			}
			else continue;
		}
		int count = 0;
		for(int i = 0;i<N;i++) {
			System.out.print(result[i][0]+" ");
			System.out.println(result[i][1]);
			
		}
	}
}
