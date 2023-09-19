import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class st_10828 {
	static int n = 0;
	static String m;
	static int [] arr;
	static int count = 0;
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		arr = new int[num];
		
		for(int i = 0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String m = st.nextToken();
			switch(m) {
			
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "top":
				sb.append(top()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
	
	static void push(int n) {
		arr[count] = n;
		count++;
	}
	static int pop() {
		if(count == 0) {
			return -1;
		}
		else {
			int temp = arr[count - 1];
			count --;
			return temp;
		}
	}
	static int top() {
		if(count == 0) {
			return -1;
		}
		else {
			return arr[count - 1];
		}
	}
	static int empty() {
		if(count == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	static int size() {
		return count;
	}
}