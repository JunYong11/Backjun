import java.util.Scanner;
public class arg_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		int [] arr = new int[8];
		for(int i = 0;i<8;i++) {
			if(num < 10) {
				
				arr[i] = num;
			}
			else {
				arr[i] = num % 10;
				num = num / 10;
				
			}
		}
		int result = 0;
		
		for(int i =0;i<8;i++) {
			result = result + arr[i];
		}
		
		System.out.println("합은 "+result+"입니다.");
	}

}
