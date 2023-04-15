import java.util.Scanner;
public class st_1158 {
	static int [] result;
	static int [] arr;
	static int count = 0;
	static int i = 0;
	static int j = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		arr = new int [n];
		
		for(i =0;i<n;i++) {
			arr[i] = i+1;
		}
	
		
		result = new int [n];
		i=0;
		
		
		while(true) {
			if(result[n-1] != 0) {
				break;
			}
			if(arr[i] != 0 ) {
				count++;
			}
			if(count == k) {
				result[j] = arr[i];
				j++;
				arr[i] = 0;
				count = 0;
			}
			i++;
			if(i == n) {
				i = 0;
			}
		}
		
		System.out.print("<");
		for(int a = 0;a<n;a++) {
			if(a == n-1) {
				System.out.print(result[a]);
				break;
			}
			System.out.print(result[a]+", ");
		}
		System.out.print(">");

	}

}
