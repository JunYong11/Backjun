import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
public class st_14425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String arr1 [] = new String[N];
		String arr2 [] = new String[M];
		
		for(int i = 0;i<N;i++) {
			arr1[i] = sc.next();
		}
		for(int i = 0;i<M;i++) {
			arr2[i] = sc.next();
		}
		
		int count = 0;
		for(int i =0;i<N;i++) {
			for(int j = 0;j<M;j++) {
				if(arr1[i].equals(arr2[j])==true) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
*/

public class st_14425 {

	public static void main(String[] args) {
		Map<String, String> mp = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;
		String str;
		String str1;
		
		for(int i = 0;i<N;i++) {
			str = sc.next();
			mp.put(str, "true");
		}
		
		for(int i = 0;i<M;i++) {
			str1 = sc.next();
			if(mp.get(str1) == "true") {
				count ++;
			}
		}
		System.out.println(count);
	}

}