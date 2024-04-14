import java.util.*;
public class st_11725 {
	
	static int[] result;
	static int count = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list[] = new ArrayList[N+1];
		
		boolean visit[] = new boolean[N + 1];
		result = new int[N + 1];
		
		for(int i = 0;i<N+1;i++	){
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i<N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		dfs(list, N, visit, 1);
		
		 for (int i = 2; i < result.length; i++) {
	            System.out.println(result[i]);
	        }
	}
	
	static void dfs(List<Integer> list[],int N, boolean[] visit, int root) {
		 if (visit[root]) {
	            return;
	        }
	        for (int i = 0; i < list[root].size(); i++) {
	            if (visit[list[root].get(i)]) {
	                continue;
	            }
	            result[list[root].get(i)] = root;
	            visit[root] = true;
            
	            dfs(list, N, visit, list[root].get(i));
	            visit[root] = false;
	        }
	}
}
