import java.io.*;
import java.util.*;
public class st_2606 {
	
	static int node;
	static int line;
	static boolean visit[];
	static int arr[][];
	static int result = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		 
		node = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		
		visit = new boolean[node+1];
		arr = new int[node+1][node+1];
		
		for(int i = 0;i<line;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = 1;
		}

		DFS(1);
		
		System.out.println(result);
		
	}
	
	static void DFS(int N) {
		visit[N] = true;

		for(int i=1; i<node+1; i++) {

			if(arr[N][i] == 1 && visit[i] == false) {
				DFS(i);
				result++;
			}
		}
	}
}
