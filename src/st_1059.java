import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class st_1059 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(br.readLine());
		int [] S ;
		int temp =0;
		int temp1 = 1;
		S = new int[L];
		
		for(int i=0;i<L;i++) {
			S[i] = sc.nextInt();
		}
		
		
		int n = Integer.parseInt(br.readLine());
			
		for(int i = 0;i<L;i++) {
			if(n == S[i]) {
				System.out.print(0);
				return;
			}
			
			else if(n < S[i]) {
				int []arr = new int[S[i]-S[i-1]-1];
				for(int j =0;j<S[i]-S[i-1]-1;j++) {
					arr[j] =S[i-1]+temp1;
					temp1++;
				}
				int count = 0;
				for(int a = 0;a<arr.length;a++) {
					for(int b = a+1;b<arr.length;b++) {
						if(arr[a] > n) {
							temp =1;
							break;
						}
						else count++;
					}
					if(temp ==1) {
						break;
					}
				}
				System.out.print(count);
				return;
			}
		}
	}

}
