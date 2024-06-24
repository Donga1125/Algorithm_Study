package 알고리즘.항해99.이주차;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리bfs {

    // 2차원 배열로 양 끝(시작과 끝)에서 서로 시작하는데, 상대방 진형에 먼저 도착하면 이기는 게임
    // 검은 색 벽이 존재하고 흰색 길로만 갈 수 있다.
    // 움직일 땐 동서남북 넷 중 하나로 움직이고, 맵 범위를 넘어갈 순 없다
    // 만약 가는 도착할 수 없다면 -1을 return
    // 가능한 경로 중 최단 거리의 이동횟수를 return 해라

    //maps는 n x m 크기의 게임 맵의 상태가 들어있는 2차원 배열로, n과 m은 각각 1 이상 100 이하의 자연수입니다.
    //n과 m은 서로 같을 수도, 다를 수도 있지만, n과 m이 모두 1인 경우는 입력으로 주어지지 않습니다.
    //maps는 0과 1로만 이루어져 있으며, 0은 벽이 있는 자리, 1은 벽이 없는 자리를 나타냅니다.
    //처음에 캐릭터는 게임 맵의 좌측 상단인 (1, 1) 위치에 있으며, 상대방 진영은 게임 맵의 우측 하단인 (n, m) 위치에 있습니다.



    private static final int[][] movement = new int[][]
            {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    //  왼  ,    오  ,    위   ,   아래
    private static boolean[][] isVisited;


    public static void main(String[] args) {
        int[][] arr = new int[][]
                {
                        {1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1},
                        {1, 1, 1, 0, 1},
                        {0, 0, 0, 0, 1}};
        게임맵최단거리bfs sol = new 게임맵최단거리bfs();
        System.out.println(sol.solution(arr));

    }

    private int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        isVisited = new boolean[n][m];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0}); // 큐에 시작 위치를 넣기
        int answer = 1; // 시작지점도 하나로 시작
        isVisited[0][0] = true; // 시작 지점을 방문했다고 표시

        while (!queue.isEmpty()) { // 큐가 비어있지 않으면 계속함
            int size = queue.size(); // 큐에 들어있는 값들만큼 돌아야함
            for (int i = 0; i < size; i++) { // 가능한 상하좌우들을 돌고 가능하다면 그 거리는 추가해주기
                int[] now = queue.poll();
                int x = now[0];
                int y = now[1];

                if (x == n - 1 && y == m - 1) { // x,y가 끝까지 도착한 경우라면 ? answer을 return
                    return answer;

                }

                for (int[] move : movement) { // 네 방향씩 탐색 (상하좌우)로 계속 탐색
                    int toX = x + move[0];
                    int toY = y + move[1];


                    if (n > toX && m > toY && toX >= 0 && toY >= 0) {
                        if (!isVisited[toX][toY] && maps[toX][toY] == 1) {

                            // 조건이 좀 많긴 한데, 방문할 곳이
                            // 1. 방문한 적이 없어야 하고,
                            // 2. 벽이 아니여야 하고 (1이여야함)
                            // 3. 0보다 크거나 같고 배열의 크기보다 작아야함 (배열 범위 안)
                            queue.offer(new int[]{toX, toY}); //만족한다면 queue에 넣어주고 (담 탐색이 되니까)
                            isVisited[toX][toY] = true; // 방문했다고 표시
                        }
                    }
                }
            }
            answer++; // 다 돌았으면 answer에 +1

        }
        return -1; // 다 돌았는데 안되면 -1 리턴
    }

}



