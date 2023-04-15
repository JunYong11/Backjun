import java.util.LinkedList;
import java.util.Scanner;


public class st_1021 {

	public static void main(String[] args)  {
		LinkedList<Integer> deque = new LinkedList	<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i =0 ;i<N;i++) {
			deque.offer(i+1);
		}
		
		int count = 0;
		
		int [] arr = new int[M];
		
		for(int i = 0;i<M;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ;i<M;i++) {
			int target_index = deque.indexOf(arr[i]);
			int half_index;
			
			if(deque.size() % 2 == 0) {
				half_index = deque.size() / 2 - 1;
			}
			else {
				half_index = deque.size() / 2;
			}
					
			if(target_index <= half_index) {
				for(int j =0;j<target_index;j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					count++;
				}
			}
			
			else {
				for(int j = 0;j<deque.size() - target_index;j++) {
					
					int temp = deque.pollLast();
					deque.offerFirst(temp);
					count++;
					
				}
			}
			deque.pollFirst();
		}
		System.out.println(count);
	}
}
