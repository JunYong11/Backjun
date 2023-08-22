import java.util.*;


public class st_1417 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Integer [] hu = new Integer[num];
		for(int i =0;i<hu.length;i++) {
			hu[i] = sc.nextInt();
		}
		/*
		for(int i =0 ;i<hu.length;i++) {
			System.out.println(hu[i]);
		}
		System.out.println("------------------------------------");
		
		Arrays.sort(hu,1,num, Comparator.reverseOrder());
		
		for(int i =0 ;i<hu.length;i++) {
			System.out.println(hu[i]);
		}
		*/
		
		
		if(num != 1) {
			vote3(num,hu);
		}
		else {
			System.out.println(0);
		}
		
	}
	
	
	static void vote1(int num, Integer[] hu) {
		int dasom = hu[0];
		int j = 0;
		int temp = 0;
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
	}
	
	static void vote2(int num, Integer[] hu) {

		int dasom = hu[0];
		Integer[] hu1 = new Integer[num - 1];
		
		for(int i =0;i<hu1.length;i++) {
			hu1[i] = hu[i+1];
		}
		
		while(true) {
			int j = 0;
			Arrays.sort(hu1, Comparator.reverseOrder());
			if(dasom <= hu1[j]) {
				dasom +=1;
				hu1[j] -=1;
			}
			else if(dasom > hu1[j]) {
				System.out.println(dasom-hu[0]);
				break;
				
			}
		}
	}

	static void vote3(int num, Integer[] hu) {
		int dasom = hu[0];
		
		while(true) {
			int j = 1;
			Arrays.sort(hu,1,num, Comparator.reverseOrder());
			for(int i =1;i<hu.length;i++) {
				System.out.println(hu[i]);
			}
			System.out.println("");
			System.out.println("-------------------------------------");
			
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




