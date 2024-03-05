 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class st_1946 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st = new StringTokenizer(br.readLine());
        
		int test = Integer.parseInt(st.nextToken());
		int [] number = new int[test];
		int [][] score;
		int result;
		for(int i =0;i<test;i++) {
			st = new StringTokenizer(br.readLine());
			number[i] = Integer.parseInt(st.nextToken());
			result = 0;
			score = new int[number[i]][2];
			
			for(int j = 0;j<number[i];j++) {
				st = new StringTokenizer(br.readLine());
				score[j][0] = Integer.parseInt(st.nextToken());
				score[j][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(score, new Comparator<int[]>() {
			    @Override
			    public int compare(int[] o1, int[] o2) {
			        return o1[0]-o2[0]; 
			    
			    }
			});
			int min = score[0][1];
			for(int j = 1;j<number[i];j++) {
				if(min > score[j][1]) {
					result++;
					min = score[j][1];
				}
			}
			System.out.println(result+1);;
		}
	}

}
