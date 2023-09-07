import java.util.Scanner;
import java.util.Stack;
public class st_10828 {
	static int n = 0;
	static String m;
	static int temp = 0;

	public static void main(String[] args) {	
		Stack<Integer> sk = new Stack<>();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			m = sc.next();
			switch(m){
			case "push":
				n = sc.nextInt();
				sk.push(n);
				break;
			case "pop":
				//temp = sk.pop();
				System.out.println(sk.pop());
				break;
			case "size":
				temp = sk.size();
				System.out.println(temp);
				break;
			case "empty":
				boolean temp1 = sk.empty();
				if(temp1 = true) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
				break;
			case "top":
				temp = sk.peek();
				System.out.println(temp);
				break;
			}
		}
	}
}
