import java.util.Arrays;
import java.util.Scanner;
public class st_1015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a[] = new int[num];
		int b[] = new int[num];
		int B[] = new int[num];
		int bp[] = new int[num];
		int BP[] = new int[num];
		int temp = 0;
		for(int i =0;i<num;i++) {
			a[i] = sc.nextInt();
			bp[i] = a[i];
			BP[i] = a[i];
		}
		
		for(int i =0;i<bp.length;i++) {
			for(int j =i+1;j<bp.length;j++) {
				if(bp[i] > bp[j]) {
					temp = bp[j];
					bp[j] = bp[i];
					bp[i] = temp;
				}
			}
		}
		
		for(int i = 0;i<b.length;i++) {
			for(int j = 0;j<b.length;j++) {
				if(bp[i] == BP[j]) {
					b[i] = j;
					B[i] = j;
					BP[j] = 1001;
					break;
				}
			}
		}

		for(int i = 0;i<b.length;i++) {
			for(int j = i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					temp = b[j];
					b[j] = b[i];
					b[i] = temp;
				}
			}
		}

		for(int i = 0;i<b.length;i++) {
			for(int j = 0;j<b.length;j++) {
				if(b[i] == B[j]) {
					System.out.print(j+" ");
					B[j] = 1001;
					break;
				}
			}
		}
		
		

		
	}

}
