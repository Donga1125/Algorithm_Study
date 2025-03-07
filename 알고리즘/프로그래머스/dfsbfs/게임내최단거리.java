package 알고리즘.프로그래머스.dfsbfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 게임내최단거리 {



    // 동남서북로 움직이는 게 효율적으로보임 1,1에 서있으니까

    //dfs와 bfs 중 dfs를 사용했는데 사실 최단거리는 bfs를 사용하면 처음 만나는 게 최단거리라서 bfs를 써야함
    // dfs는 모두 다 탐색해야해서 별로


    public static void main(String[] args) {

        int[][] map = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}};

        게임내최단거리 main = new 게임내최단거리();
        System.out.println(main.solution(map));;
    }

    public int solution(int[][] maps) {
        int[][] DIRS = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] isVisited = new boolean[n][m];


        //큐가 빌때까지 계속 해주는데,
        //큐에서 조건이 만족하면 4방향 중 되는 걸 넣어줌
        // 다음 큐에서 꺼내서 반복


        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0, 0, 1});
        isVisited[0][0] = true;


        while (!queue.isEmpty()) {

            int now[] = queue.poll();

            int x = now[0];
            int y = now[1];
            answer = now[2];
            if (x == n - 1 && y == m - 1) { // x,y가 끝까지 도착한 경우라면 ? answer을 return

                return answer;

            }
            for (int[] dir : DIRS) {


                int nowX = dir[0] + x;
                int nowY = dir[1] + y;

                if (nowX >= 0 && nowX < n && nowY >= 0 && nowY < m) {
                    if (maps[nowX][nowY] == 1
                            && !isVisited[nowX][nowY]) {

                        queue.offer(new int[]{nowX, nowY, answer + 1});
                        isVisited[nowX][nowY] = true;

                    }
                }
            }
        }
        return -1;

    }
}
