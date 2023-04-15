
/*
import java.util.Scanner;
public class st_1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	//테스트케이스
		int N = 0;	//건물갯수
		int K = 0;	//규칙갯수
		int [] NTime = new int[N];	//건설시간
		int [] Nnumber = new int[N];
		int [][] Knum = new int[2][K];	//규칙설정
		int W = 0;	//승리하기 위한 건물 번호
		
		int num = 0;
		while(num == T) {
			N = sc.nextInt();
			K = sc.nextInt();
			for(int i=0;i<N;i++) {	//건물 번호 넣기
				Nnumber[i] = i;
			}
			for(int i =0;i<N;i++) {		//건설시간 입력
				NTime[i] = sc.nextInt();
			}
			for(int i = 0;i<K;i++) {
				for(int j=0;j<2;j++) {		//규칙설정 입력
					Knum[i][j] = sc.nextInt();
				}
			}
			W = sc.nextInt();
			
			for(int i = 0;i<K;i++) {
				for(int j=0;j<2;j++) {
					
				}
			}
			
			
		}

	}
}
*/


import java.util.*;

public class st_1005 {
    public static int v; // 노드의 개수(V)
    public static int e; // 간선(Union 연산)의 개수(E)

    // 노드의 개수는 최대 100,000개라고 가정
    // 모든 노드에 대한 진입차수는 0으로 초기화
    public static int[] indegree = new int[100001];

    // 각 노드에 연결된 간선 정보를 담기 위한 연결 리스트 초기화
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // 위상 정렬 함수
    public static void topologySort() {
    	ArrayList<Integer> result = new ArrayList<>(); // 알고리즘 수행 결과를 담을 리스트
        Queue<Integer> q = new LinkedList<>(); // 큐 라이브러리 사용

        // 처음 시작할 때는 진입차수가 0인 노드를 큐에 삽입
        for (int i = 1; i <= v; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            // 큐에서 원소 꺼내기
            int now = q.poll();

            result.add(now);

            // 해당 원소와 연결된 노드들의 진입차수에서 1 빼기
            for (int i = 0; i < graph.get(now).size(); i++) { // 연결된 노드만큼 반복
                indegree[graph.get(now).get(i)] -= 1;

                // 새롭게 진입차수가 0이 되는 노드를 큐에 삽입
                if (indegree[graph.get(now).get(i)] == 0) {
                    q.offer(graph.get(now).get(i));
                }
            }
        }

        // 위상 정렬을 수행한 결과 출력
        result.stream()
                .map(integer -> integer + " ")
                .forEach(System.out::print);
    }
    
    
    

    /*
     7 8
     1 2
     1 5
     2 3
     2 6
     3 4
     4 9
     5 6
     6 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        v = sc.nextInt();
        e = sc.nextInt();

        // 그래프 초기화
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 방향 그래프의 모든 간선 정보를 입력 받기
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b); // 정점 A에서 B로 이동 가능

            // 진입 차수를 1 증가
            indegree[b] += 1;
        }

        topologySort();
    }
}




















