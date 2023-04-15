import java.util.Scanner;
public class arg_2 {
	static int number = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [][]arr = new int[num][num];
		
		int temp = 0;
		for(int i =0;i<num;i++) {
			if(i == 0 || i % 2 == 0) {
				for(int j = 0;j<num;j++) {
					arr[i][j] = number;
					number++;
				}
				continue;
			}
			else {
				for(int j = 0;j<num;j++) {
					arr[i][(num-1)-j] = number;
					number++;
				}
				
				continue;
			}
		}
		
		for(int i =0;i<num;i++) {
			for(int j = 0;j<num;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
