import java.util.Scanner;
public class st_14244 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		int [] arr = new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i] = i;
		}
		
		if(m == 2) {
			for(int i = 0;i<n-1;i++) {
				System.out.print(arr[i]+" "+arr[i+1]);
				System.out.println("");
			}
		}
		else {
			for(int i = 0;i<n-1;i++) {
				if(n-i == m) {
					for(int j = i+1;j<n;j++) {
						System.out.print(arr[i]+" "+arr[j]);
						System.out.println("");
					}
					break;
				}
				System.out.print(arr[i]+" "+arr[i+1]);
				System.out.println("");

			}
		}
	}
}
