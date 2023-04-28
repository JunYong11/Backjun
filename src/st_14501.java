import java.util.LinkedList;
import java.util.Scanner;
public class st_14501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();	//입력받은 일수
		
		int [] time = new int[day];		//걸리는 시
		int [] money = new int[day];	//받는돈
		
		int [] result = new int[day];	//결과값 저장
		
		for(int i = 0;i<day;i++) {
			time[i] = sc.nextInt();
			money[i] = sc.nextInt();
			
			
		}
		
		for(int i = 0;i<day;i++) {
			if(i+time[i] <=day) {
				result[i+time[i]] = Math.max(result[i+time[i]], result[i]+money[i]);			
				}
			
			
		}
		
		
	}

}
