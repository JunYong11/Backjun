import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class st_1417 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dasom = 0;
		int temp = 0;
		int j = 1;
		int num = sc.nextInt();
		int [] hu = new int[num];
		for(int i =0;i<hu.length;i++) {
			hu[i] = sc.nextInt();
		}
		vote(num,hu);
		/*
		dasom = hu[0];
		Arrays.sort(hu);
		while(true) {
			if(num == 1) {
				break;
			}
			if(dasom <= hu[j]) {
				dasom += 1;
				hu[j] -= 1;
				temp = 1;
				System.out.println(dasom);
				for(int a = 1; a<hu.length;a++) {
					System.out.println(hu[a]);
				}
				System.out.println("");
			}
			j++;
			
			if(j == num && temp == 0) {
				break;
			}
			else if(j == num && temp == 1) {
				j = 1;
				temp = 0;
			}
		}
		
		System.out.println(dasom - hu[0]);
		*/
		
	}
	
	static int vote(int num, int[] hu) {
		int dasom = hu[0];
		int [] hu1 = new int [num-1];
		
		for(int i =0;i<hu1.length;i++) {
			hu1[i] = hu[i+1];
		}
		
		while(true) {
			int j = 0;
			Arrays.sort(hu1,Comparator.reverseOrder());
			if(dasom <= hu1[j]) {
				dasom +=1;
				hu1[j] -=1;
			}
			else if(dasom > hu1[j]) {
				System.out.println(dasom);
				return dasom;
				
			}
		}
	}

}




