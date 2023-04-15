import java .util.Scanner;
public class st_10974 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        // n을 입력받습니다.
        int n = sc.nextInt();
        sc.close();
 
        // 1부터 n까지의 수를 담는 배열을 생성합니다.
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	 arr[i] = i+1;
        }
          
        // n개 중에서 r개를 뽑는 경우를 출력하는 메소드 perm을 호출합니다.
        int[] output = new int[n];
        boolean[] visited = new boolean[n];
        perm(arr, output, visited, 0, n, n);        
    }
 
    // 순서를 지키면서 n 개중에서 r 개를 뽑는 경우를 출력하는 메소드입니다.
    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if(depth == r) { // 현재까지 뽑은 숫자의 개수가 r개와 같다면
            print(output, r); // 배열 output을 출력하는 메소드 print를 호출합니다.
            return;
        }
    
        for(int i=0; i<n; i++) { // 0부터 n-1까지의 숫자를 반복합니다.
            if(visited[i] != true) { // 만약 i번째 수가 아직 뽑히지 않았다면
                visited[i] = true; // i번째 수를 뽑았다는 표시를 합니다.
                output[depth] = arr[i]; // 현재까지 뽑은 숫자를 배열 output에 저장합니다.
                perm(arr, output, visited, depth + 1, n, r); // 다음 숫자를 뽑기 위해 perm을 재귀 호출합니다.
                visited[i] = false; // i번째 수를 다시 뽑을 수 있도록 표시를 변경합니다.
            }
        }
    }
 
    // 배열을 출력하는 메소드입니다.
    static void print(int[] arr, int r) {
        for(int i=0; i<r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

		