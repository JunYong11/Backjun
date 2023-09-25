import java.io.*;
import java.util.*;
public class Graph_P {
	
	static int [][] graph;
	static int node = 0;
	static int line = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
				
		node = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		
		graph = new int[node+1][node+1];
		
		for(int i = 0;i<line;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			graph[x][y] = 1;
			graph[y][x] = 1;
			
		}
		
		for(int i = 1;i<node+1;i++) {
			for(int j = 1; j<node+1;j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
