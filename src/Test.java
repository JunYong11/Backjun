import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list[] = new ArrayList[5];
		
		for (int i = 0; i <= 4; i++) {
			list[i] = new ArrayList<Integer>();
		}

		list[4].add(1);
		list[3].add(2);
		list[3].add(3);
		list[2].add(3);
		list[1].add(4);
		
		System.out.println(list[0].size());
		System.out.println(list[1].size());
		System.out.println(list[2].size());
		System.out.println(list[3].size());
		System.out.println("");
		System.out.println(list[3].get(3));
		
		
		
	}

}
