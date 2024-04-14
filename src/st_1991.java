import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이진 트리의 노드를 나타내는 클래스
class Node {
    char data;  // 노드의 데이터
    Node left;  // 왼쪽 자식 노드
    Node right; // 오른쪽 자식 노드

    // 노드 생성자
    Node(char data) {
        this.data = data;
    }
}

// 이진 트리를 나타내는 클래스
class Tree {
    public Node root;  // 트리의 루트 노드

    // 새로운 노드를 생성하고 트리에 추가하는 메서드
    public void createNode(char data, char leftData, char rightData) {
        // 트리가 비어있는 경우 새로운 노드를 루트로 설정
        if (root == null) {
            root = new Node(data);
            // 왼쪽 자식 노드 생성
            root.left = leftData != '.' ? new Node(leftData) : null;
            // 오른쪽 자식 노드 생성
            root.right = rightData != '.' ? new Node(rightData) : null;
        } else {
            // 트리가 비어있지 않은 경우 노드를 찾아서 새로운 노드 추가
            searchNode(root, data, leftData, rightData);
        }
    }

    // 특정 노드를 찾아서 새로운 노드를 추가하는 메서드
    public void searchNode(Node node, char data, char leftData, char rightData) {
        // 노드가 비어있는 경우 종료
        if (node == null) {
            return;
        } else if (node.data == data) { // 노드가 찾는 노드인 경우
            // 왼쪽 자식 노드 생성
            node.left = leftData != '.' ? new Node(leftData) : null;
            // 오른쪽 자식 노드 생성
            node.right = rightData != '.' ? new Node(rightData) : null;
        } else { // 찾는 노드가 아닌 경우 재귀적으로 탐색
            // 왼쪽 서브트리 탐색
            searchNode(node.left, data, leftData, rightData);
            // 오른쪽 서브트리 탐색
            searchNode(node.right, data, leftData, rightData);
        }
    }

    // 전위순회 Preorder : Root -> Left -> Right
    public void preOrder(Node node) {
        if (node != null) {
            // 루트 출력
            System.out.print(node.data);
            // 왼쪽 서브트리 순회
            if (node.left != null) {
                preOrder(node.left);
            }
            // 오른쪽 서브트리 순회
            if (node.right != null) {
                preOrder(node.right);
            }
        }
    }

    // 중위순회 Inorder : Left -> Root -> Right
    public void inOrder(Node node) {
        if (node != null) {
            // 왼쪽 서브트리 순회
            if (node.left != null) {
                inOrder(node.left);
            }
            // 루트 출력
            System.out.print(node.data);
            // 오른쪽 서브트리 순회
            if (node.right != null) {
                inOrder(node.right);
            }
        }
    }

    // 후위순회 Postorder : Left -> Right -> Root
    public void postOrder(Node node) {
        if (node != null) {
            // 왼쪽 서브트리 순회
            if (node.left != null) {
                postOrder(node.left);
            }
            // 오른쪽 서브트리 순회
            if (node.right != null) {
                postOrder(node.right);
            }
            // 루트 출력
            System.out.print(node.data);
        }
    }
}

public class st_1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 노드의 개수 입력
        Tree t = new Tree(); // 트리 객체 생성

        // 노드 정보 입력 및 트리 생성
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
            char root = st.nextToken().charAt(0); // 부모 노드
            char left = st.nextToken().charAt(0); // 왼쪽 자식 노드
            char right = st.nextToken().charAt(0); // 오른쪽 자식 노드
            t.createNode(root, left, right); // 노드 생성 및 트리에 추가
        }

        // 전위순회 출력
        t.preOrder(t.root);
        System.out.println();
        // 중위순회 출력
        t.inOrder(t.root);
        System.out.println();
        // 후위순회 출력
        t.postOrder(t.root);

        br.close(); // 입력 스트림 닫기
    }
}
