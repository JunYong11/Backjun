
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Map;

public class Test {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		LinkedList<int []> list = new LinkedList<>();
		
		
		int test = sc.nextInt();
		
		for(int i =0;i<test;i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			for(int j = 0;j<N;j++) {
				list.add(new int[] {j,sc.nextInt()});
			}
			
			while(!list.isEmpty()) {
				int count = 0;
				int [] front = list.poll();
				boolean isMax = true;
				
				for(int j = 0;j<list.size();j++) {
					if(front[1] < list.get(i)[1]) {
						list.add(front);
						
						for(int a = 0;a<j;a++) {
							list.add(list.poll());
						}
						isMax = false;
						break;
					}
					
					if(isMax = false) {
						continue;
					}
								
				}
				count++;
				if(front [0] == M) {
					System.out.println(count);
					list.clear();
					test -= 1;
					break;
				}
				
			}
		}

		
		
		
	}
	

}
