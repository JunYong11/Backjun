import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class st_10816 {
	static int N = 0;
	static int M = 0;
	static int Narr[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Narr = new int[N];
		for(int i = 0;i<N;i++) {
			Narr[i] = sc.nextInt();
		}
		Arrays.sort(Narr);

		M = sc.nextInt();
	
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<M;i++) {
			int key = sc.nextInt();
			sb.append(upperBound(Narr, key) - lowerBound(Narr, key)).append(' ');
		}
		System.out.println(sb);
	}
	
	public static int lowerBound(int[] arr,int key) {
		int low = 0;
		int hight = arr.length;
		
		while(low<hight) {
			int mid = (low+hight) / 2;
			
			if(key <= arr[mid]) {
				hight = mid;
			}
			
			else {
				low = mid+1;
			}
		}
		return low;
	}
	
	public static int upperBound(int[] arr, int key) {
		int low = 0;
		int hight = arr.length;
		
		while(low < hight) {
			int mid = (low+hight) / 2;
			
			if(key < arr[mid]) {
				hight = mid;
			}
			
			else {
				low = mid+1;
			}
		}
		return low;
	}

}
