import java.util.Scanner;
public class st_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[28];
		int temp = 0;
		int [] student = new int[30];
		
		for(int i = 0;i<student.length;i++) {
			student[i] = i+1;
		}
		

		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int num2 = 0;
		int num =0;
		int [] result = new int[2];
		for(int i =0 ;i<student.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				if(student[i] == arr[j]) {
					num = 1;
					break;
				}
			}
			if(num == 0) {
				result[num2] = student[i];
				num2++;
			}
			if(num2 ==2) {
				break;
			}
			num = 0;
		}
		
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		
	}

}
