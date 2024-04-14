import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class st_9934 {
	static List<Integer> list[];
	static int Tree[];
	static int K = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt();
		int N = (int) Math.pow(2, K);
		list = new ArrayList[K+1];
		
		for(int i =0;i<K+1;i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		Tree = new int[N-1];
		for(int i =0;i<N-1;i++) {
			Tree[i] = sc.nextInt();
		}
		Inorder(0,Tree.length-1,0);
		
		for(int i =0;i<K;i++) {
			for(int j = 0;j<list[i].size();j++) {
				int result = list[i].get(j);
				System.out.print(result+" ");
			}
			System.out.println("");
		}
		
	}
	static void Inorder(int num, int size, int deep) {
		if(deep == K) {
			return;
		}
		int root = (num+size)/2;
		list[deep].add(Tree[root]);
		Inorder(num,root-1,deep+1);
		Inorder(root+1,size,deep+1);
	}
}

