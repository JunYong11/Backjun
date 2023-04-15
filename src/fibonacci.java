import java.util.Scanner;
public class fibonacci {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[41];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		for(int i =3;i<41;i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		int n = sc.nextInt();
		int number[] = new int[n];
		for(int i=0;i<number.length;i++) {
			number[i] = sc.nextInt();
		}
		for(int i =0;i<n;i++) {
			if(number[i]==0) {
				System.out.println("1 0");
			}
			else if(number[i]==1) {
				System.out.println("0 1");
			}
			else {
				System.out.println(arr[number[i]-1]+" "+arr[number[i]]);
			}
		}
	
		
	}

}
