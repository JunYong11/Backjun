import java.util.Scanner;
public class arg_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp = 1;
		int number = 0;
		int now_wt;
		int last_wt;
		System.out.print("현재몸무게 : ");
		now_wt = sc.nextInt();
		System.out.print("목표몸무게 : ");
		last_wt = sc.nextInt();
		while(true) {
			System.out.print(temp+"주차 몸무게 :");
			number = sc.nextInt();
			now_wt = now_wt - number;
			if(now_wt <= last_wt) {
				System.out.println(now_wt+"kg 달성!! 축하합니다 !");
				break;
			}
			temp++;
		}
		
	}
	
	

}
