import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class st_1966 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		LinkedList<int[]> list = new LinkedList<>();
		
		int test = sc.nextInt();
		
		while(test != 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			for(int i =0;i<N;i++) {
				list.add(new int[] {i,sc.nextInt()}	);
			}
			
			int count = 0;
			
			while(!list.isEmpty()) {
				int f_number [] = list.poll();	//첫번째 값 저장
				boolean is_Max = true;
				
				for(int i = 0;i<list.size();i++) {
					
					if(f_number[1] < list.get(i)[1]) {
						list.add(f_number);
						
						for(int j = 0;j<i;j++) {
							list.add(list.poll());
						}
						
						is_Max = false;
						break;
					}
				}
				
				if(is_Max == false) {
					continue;
				}
				
				count++;
				if(f_number[0] == M) {
					System.out.println(count);
					list.clear();
					test -= 1;
					break;
				}
			}
			
		}
				
	}
	
}
