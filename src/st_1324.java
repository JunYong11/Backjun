import java.util.Scanner;
public class st_1324 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] arr1 = new int[t];
		int [] arr2 = new int[t];
		int temp = 0;
		int count = 0;
		
		for(int i = 0;i<t;i++) {
			arr1[i] = sc.nextInt();
		}
	
		for(int i = 0;i<t;i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int i = 1;i<t;i++) {
			for(int j=i;j<t;j++) {
				if(arr1[i-1] <= arr1[j]) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
					break;
				}
			}
		}
		
		for(int i = 1;i<t;i++) {
			for(int j=i;j<t;j++) {
				if(arr2[i-1] <= arr2[j]) {
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
					break;
				}
			}
		}
		
		for(int i =1;i<t;i++) {
			if(arr1[i-1]>arr1[i]||arr1[i-1] == 0) {
				arr1[i]=0;
			}
		}
		
		for(int i =1;i<t;i++) {
			if(arr2[i-1]>arr2[i]||arr2[i-1] == 0) {
				arr2[i]=0;
			}
		}
		
		for(int i = 0;i<t;i++) {
			for(int j = 0;j<t;j++) {
				if(arr2[i] == arr1[j] && arr2[i] != 0) {
					count++;
					arr1[j] = 0;
					break;
				}
				else if(arr2[i] == 0) {
					break;
				}
				else continue;
				
			}
		}
		System.out.println(count);
		
	}
	

}
