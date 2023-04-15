import java.util.*;
public class st2083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String a = "#";
		int age, wegiht;
		
		while(true) {
			name = sc.next();
			age = sc.nextInt();
			wegiht = sc.nextInt();
		
			if(name.equals(a)==true&& age == 0 && wegiht == 0) {
				break;
			}
			if(age > 17 || wegiht >= 80) {
				System.out.print(name+" ");
				System.out.println("Senior");
			}
			else {
				System.out.print(name+" ");
				System.out.println("Junior");
			}
			
			
		}
	}

}
