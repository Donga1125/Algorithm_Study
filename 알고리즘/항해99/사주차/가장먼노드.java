package 알고리즘.항해99.사주차;

import java.util.*;

public class 가장먼노드 {

    //n개의 노드가 있는 그래프 각 노드는 1번부터 번호대로
    // 1번부터 가장 멀리 떨어 노드의 갯수를 구하라
    // 이 말은 노드가 최단경로로이동했을때 간선의 갯수가 가장 많은 노드

    //dfs로 구현하면 될 것 같은데 방문여부를 판단하고, 현재 노드에서 움직였는데
    // 다시 돌아오는 노드가 있다면 ? check로 확인 ?
    // 근데 다른 경로로 출발해도 만나게 되는 노드가 어디서 출발하냐에 따라 달라지는데 이걸 최단경로가 아니니
    // 같거나 적은 것의 경로가 그 노드까지의 경로로 저장
    // 이러면 중복이동이 좀 많을 것 같은데 더 효율적으로 움직일 순 없을까
    // 전체탐색해야 하긴 하는데 제일 깊은 걸 찾아야 하는 거라 bfs로 구현해보자



    public static void main(String[] args) {

        int[][] vertex = new int[][]{
                {3, 6},
                {4, 3},
                {3, 2},
                {1, 3},
                {1, 2},
                {2, 4},
                {5, 2}};
        int n = 6;
        가장먼노드 main = new 가장먼노드();
        System.out.println(main.solution(n, vertex));

    }
    public int solution(int n, int[][] edge) {

        int answer = 0;

        List<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <=n; i++) {

            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge.length; i++) {

            int u = edge[i][0];
            int v = edge[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }




        int[] distance = new int[n+1]; // 1에서 얼마나 떨어져있는지 적어줘야함
        boolean[] visited = new boolean[n+1]; // 노드들이 방문한 적이 있는 지 확인

        Queue<Integer> queue = new LinkedList<>(); //bfs는 queue로
        queue.offer(1);
        visited[1] = true;


        while (!queue.isEmpty()) {
            int node = queue.poll(); // 꺼내온 queue 지금 값

            for (int now : graph.get(node)) { // 노드에 들어있는 수를 돌자
                if (!visited[now]) {
                    visited[now] = true;
                    distance[now] = distance[node] + 1; //현재 now의 수는 원래의 노드의 수와 +1만큼 떨어져있다
                    //왜냐하면 현재 node에서 인접한 다음 노드들을 불러온 거라 +1해주면 됨 (1이 기준이니 계속 거리를 벌리기 위함)
                    queue.offer(now);
                }
            }
        }

        int maxDist = 0;
        for (int i : distance) {

            if (maxDist < i) {
                maxDist = i;
            }

        }


        for (int i : distance) {
            if (maxDist == i) {
                answer++;
            }
        }

        return answer;

    }


}
