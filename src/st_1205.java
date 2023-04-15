import java.util.Scanner;

public class st_1205 {

	public static void main(String[] args)throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int score = sc.nextInt();
		int P = sc.nextInt();
		
		int [] arr;
		arr = new int[N];
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		if(N==P && score <= arr[arr.length-1]) {
			System.out.print(-1);
		}
		else {
			int count = 1;
			for(int i = 0;i<arr.length;i++) {
				if(score <arr[i]) {
					count++;
				}
				else break;
			}
			System.out.print(count);
		}
	}

}
