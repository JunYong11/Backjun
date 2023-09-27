import java.io.*;
import java.util.*;

public class st_1012 {
	static int test;
	static int width;
	static int height;
	static int node;
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		test = Integer.parseInt(br.readLine());
		
		for(int i = 0;i<test;i++) {
			width = Integer.parseInt(st.nextToken());
			height = Integer.parseInt(st.nextToken());
			node = Integer.parseInt(st.nextToken());
			
			arr = new int[width][height];
			
			for(int j = 1;j<node;j++) {
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				arr[x][y] = 1;
			}
			arr_print();
		}
		

	}
	
	
	static void arr_print() {
		for(int i = 0;i<height+1;i++) {
			for(int j = 0;j<width+1;j++) {
				System.out.print(arr[height][width]+" ");
			}
			System.out.println("");
		}
	}
	
	static int search() {
		for(int j = 0;j<height;j++) {
			for(int k = 0;k<width;k++) {
				if(arr[height][width] == 1) {
					
				}
			}
		}
		return 0;
	}

}
