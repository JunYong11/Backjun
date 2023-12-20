import java.io.*;
import java.util.StringTokenizer;
public class st_10816 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N = 0;
	static int M = 0;
	static int Narr[];
	static int Marr[];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		N = Integer.parseInt(br.readLine());
		Narr = new int[N];
		String input =br.readLine();
		String[] numbersAsString = input.split("\\s+");
		for(int i = 0;i<N;i++) {
			Narr[i] = Integer.parseInt(numbersAsString[i]);
		}
		M = Integer.parseInt(br.readLine());
		Marr = new int[M];
		input = br.readLine();
		numbersAsString = input.split("\\s+");
		for(int i = 0;i<M;i++) {
			Marr[i] = Integer.parseInt(numbersAsString[i]);
		}
		resultData();
	}
	
	static void resultData() throws IOException {
		int count[] = new int[M];
		for(int i = 0;i<M;i++) {
			for(int j = 0;j<N;j++) {
				if(Marr[i] == Narr[j]) {
					count[i] ++;
				}
			}
		}
		for(int i = 0;i<M;i++) {
			bw.write(String.valueOf(count[i]));
			bw.write(" ");
		}
		bw.flush();
		bw.close();
	}
}
