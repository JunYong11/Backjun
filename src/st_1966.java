import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class st_1966 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		LinkedList<int []> list = new LinkedList<>();
		
		int t = sc.nextInt();	//테스트 케이스
		
		while(t == 0) {
			int N = sc.nextInt();	//문서갯수
			int M = sc.nextInt();	//찾고자 하는 문서 위치
			
			for(int i = 0;i<N;i++) {
				list.add(new int[] { i, sc.nextInt() });
			}
			
			int count = 0;
			int [] front = list.poll();
		} 
	}

}
