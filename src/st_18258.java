import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class st_18258 {

	public static void main(String[] args) {
		Deque<Integer> qu = new LinkedList	<>();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int number = 0;
		
		for(int i = 0;i<num;i++	) {
			String word = sc.next();
			switch(word) {
			case "push":
				int temp = sc.nextInt();
				qu.add(temp);
				break;
				
			case "pop":
				Integer items = qu.poll();
				if(items == null) {
					System.out.println(-1);
					break;
				}
				else {
					System.out.println(items);
					break; 
				}
				
			case "size":
				System.out.println(qu.size());
				break;
				
			case "empty":
				Integer items1 = qu.peek();
				if(items1 == null) {
					System.out.println(1);
					break;
				}
				else 
					{
					System.out.println(0);
					break;
					}
			case "front":
				Integer items2 = qu.peek();
				if(items2 == null) {
					System.out.println(-1);
					break;
				}
				else {
					System.out.println(qu.peek());
					break;
				}
			case "back":
				Integer items3 = qu.peekLast();
				if(items3 == null) {
					System.out.println(-1);
					break;
				}
				else {
					System.out.println(items3);
					break;
				}
			default:
				System.out.println("문자를 잘못 입력하셨습니다.");
				break;
					
			}
		}	
	}
}
