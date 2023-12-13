import java.util.Scanner;
public class st_9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Lnum = 0;
		int Rnum = 0;
		
		int number = sc.nextInt();
		String arr[] = new String [number];
		
		for(int i = 0;i<number;i++) {
			arr[i] = sc.next();
		}
		
		for(int i =0;i<number;i++) {
			String temp = arr[i];
			String [] c = temp.split("");
			int check = 0;
			if(c.length % 2 ==0) {
				for(int j =0;j<c.length;j++) {
					if(c[j].contains("(")) {
						Lnum ++;
					}
					else {
						Rnum++;
						
						if(Rnum >Lnum) {
							System.out.println("NO");
							check = 1;
							Lnum = 0;
							Rnum = 0;
							break;
						}
					}
				}
				if(check == 0 && Lnum == Rnum) {
					System.out.println("YES");
					Lnum = 0;
					Rnum = 0;
				}
				else if(check == 0) {
					System.out.println("NO");
					Lnum = 0;
					Rnum = 0;
				}	
			}
			else {
				System.out.println("NO");
				continue;
			}
		}
	}
}
