import java.util.Scanner;
import java.util.Stack;
public class st_10828 {
	static int n = 0;
	static String m;
	static int [] arr;
	static int count = 0;
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		arr = new int[num];
		
		for(int i = 0;i<num;i++) {
			
			m = sc.next();
			
			switch(m) {
			
			case "push":
				n = sc.nextInt();
				push(n);
				break;
			case "pop":
				pop();
				break;
			case "top":
				top();
				break;
			case "empty":
				empty();
				break;
			case "size":
				size();
				break;
			}
		}
	}
	
	static void push(int n) {
		arr[count] = n;
		count++;
	}
	static void pop() {
		if(count == 0) {
			System.out.println(-1);
		}
		else {
			count--;
			System.out.println(arr[count]);
			arr[count] = 0;
		}
	}
	static void top() {
		if(count == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(arr[count-1]);
		}
		
	}
	static void empty() {
		if(count == 0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	static void size() {
		System.out.println(count);
	}
}
