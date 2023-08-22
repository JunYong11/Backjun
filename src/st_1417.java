import java.util.*;


public class st_1417 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Integer [] hu = new Integer[num];
		for(int i =0;i<hu.length;i++) {
			hu[i] = sc.nextInt();
		}
		if(num != 1) {
			vote1(num,hu);
		}
		else System.out.println(0);
		
	}
	
	
	static void vote1(int num, Integer[] hu) {
		int dasom = hu[0];
		int j = 1;
		int temp = 0;
		
		while(true) {
			if(dasom <= hu[j]) {
				dasom += 1;
				hu[j] -= 1;
				temp = 1;
			}
			j++;
			
			if(j == num && temp == 0) {
				break;
			}
			if(j == num && temp == 1) {
				j = 1;
				temp = 0;
			}
		}
		
		System.out.println(dasom - hu[0]);
	}
	
	static void vote2(int num, Integer[] hu) {
		int dasom = hu[0];
		
		while(true) {
			int j = 1;
			Arrays.sort(hu,1,num, Comparator.reverseOrder());
			if(dasom <= hu[j]) {
				dasom +=1;
				hu[j] -=1;
			}
			else if(dasom > hu[j]) {
				System.out.println(dasom-hu[0]);
				break;
				
			}
		}
	}
}




