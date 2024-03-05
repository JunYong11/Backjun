import java.util.Scanner;
import java.util.StringTokenizer;
public class st_1541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String list = sc.next();
		String [] str = list.split("-");	//입력받은 연산을 -를 기준으로 분리 한다.
		int temp = 0;
		int result = Integer.MAX_VALUE;
		
		for(int i = 0;i<str.length;i++) {
			String [] add = str[i].split("\\+");	//-를 기준으로 분리한 값을 +를 기준으로 다시 불리한다.
			
			for(int j = 0;j<add.length;j++) {
				temp += Integer.parseInt(add[j]);	//각 값을 더하여 temp변수에 저장한다.
			}
			if(result == Integer.MAX_VALUE) {	//temp값이 가장 첫번째 값인지를 확인
				result = temp;
			}
			else {						
				result -= temp;		//구해진 값들을 -한다.
			}
			temp = 0;		//temp 초기화
		}
		System.out.println(result);
	}
}

