import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class st_1931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int time[][] = new int[N][2];
		int count = 1;
		int temp = 0;
		
		for(int i = 0;i<N;i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();	
		}
		Arrays.sort(time, new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
		    }
		});
			
		temp = time[0][1];
		for(int i =0;i<N-1;i++) {
			if(temp<=time[i+1][0]) {
				count++;
				temp = time[i+1][1];
			}
		}
		System.out.println(count);
	}
}


