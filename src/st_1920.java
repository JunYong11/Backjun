import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class st_1920 {
	
	static int N = 0;
	static int []Narr;
	static int M = 0;
	static int [] Marr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		N = Integer.parseInt(br.readLine());
		Narr = new int[N];
		String input = br.readLine();
		String[] numbersAsString = input.split("\\s+");
		for(int i = 0;i<N;i++) {
			Narr[i] = Integer.parseInt(numbersAsString[i]);
		}
		
		Arrays.sort(Narr);
		
		M = Integer.parseInt(br.readLine());
		Marr = new int[M];
		input = br.readLine();
		String[] numbersAsString1 = input.split("\\s+");
		for(int i = 0;i<M;i++) {
			Marr[i] = Integer.parseInt(numbersAsString1[i]);
		}
			
		for(int i = 0;i<M;i++) {
			int key = Marr[i];
			int result =0;
			result = binarysearch(key, 0, N-1);
			if(result != -1) {
				System.out.println(1);
			}
			else System.out.println(0);
			
		}
	}
	
	static int binarysearch(int key, int low , int higt) {
		int mid = 0;
		if(low <= higt) {
			mid = (low+higt) / 2;
			
			if(key == Narr[mid]) {
				return mid;
			} else if(key < Narr[mid]) {
				return binarysearch(key, low, mid-1);
			}else {
				return binarysearch(key,mid+1,higt);
			}
		}
		return -1;
	}
}
