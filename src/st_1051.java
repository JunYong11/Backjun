import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class st_1051 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N, M;
		int [][]map;
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		
		int len = Math.min(N, M);
		
		for(int i = 0;i<N;i++) {
			String str = br.readLine();
			for(int j = 0;j<M;j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		while(len > 1) {
			for(int i =0;i<=N-len;i++) {
				for(int j = 0;j<=M-len;j++) {
					int num = map[i][j];
					if(num == map[i][j+len-1] && num == map[i+len-1][j] && num == map[i+len-1][j+len-1]) {
						System.out.print(len*len);
						return;
					}
				}
			}
			len --;
		}
		
		System.out.print(len*len);
		
		
	
	}

}
