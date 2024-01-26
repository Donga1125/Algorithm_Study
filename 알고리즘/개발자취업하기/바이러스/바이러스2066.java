package 알고리즘.개발자취업하기.바이러스;

import java.util.*;

public class 바이러스2066 {

    static boolean[][] graph;
    static boolean[] visited;
    static int n , m;
    static int answer;

    public static void dfs(int idx){
        visited[idx] = true;
        answer++;
        for (int i = 1; i <= n ; i++) { // 연결된 컴퓨터의 갯수만큼 돌아야하네 그래프전체 탐색이니까
            if (!visited[i] && graph[idx][i])
                dfs(i);

        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new boolean[n + 1][n + 1]; //n번 인덱스까지 만들려고
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = true;
            graph[y][x] = true;
        }
        dfs(1);

        System.out.println(answer -1); // -1은 1번부터 찾으니까 1번은 카운팅에서 빼기 위해
        sc.close();

    }
}
