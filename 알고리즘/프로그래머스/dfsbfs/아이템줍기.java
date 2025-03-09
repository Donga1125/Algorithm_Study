package 알고리즘.프로그래머스.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class 아이템줍기 {
    //겹쳐진 사각형의 모든 겉 둘레로 움직일 수 있다.
    // cx,cy에서 시작해 tx,ty로 도착하는 최단 거리를 리턴해라

    public static void main(String[] args) {

        int[][] rectangle = new int[][]{{1, 1, 7, 4}, {3, 2, 5, 5}, {4, 3, 6, 9}, {2, 6, 8, 8}};
        int characterX = 1;
        int characterY = 3;
        int itemX = 7;
        int itemY = 8;
        아이템줍기 main = new 아이템줍기();
        System.out.println(main.solution(rectangle, characterX, characterY, itemX, itemY));

    }
    //1. 사각형들의 겉 둘레만을 그리기
    //2. 둘레를 따라 움직이기
    //3. 최단거리로 움직이기 위해 x값이 0이라면 y만 더해주고 또 이렇게 사각형을 반복 (시계방향이 짧을 지 반시계가 짧을지도 계산해서 가야함

    // 1-1 2차원 행열을 탐색할 때 1로 포함된 부분으로 움직이는 이때 왼쪽 오른 쪽 둘 다 갈 수 있지만,
    // bfs탐색으로 더 깊은 곳으로만 이동하게끔 짜면 될 듯?
    // 좌하 xy, 우상 xy



    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] map = new int[102][102]; // 2배 크기로 확장된 맵
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 동, 남, 서, 북 방향

        // 1. **사각형을 2배로 확장하고 테두리 설정**
        // note 2배 확장하는 게 키 포인트!!
        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2, y1 = rect[1] * 2;
            int x2 = rect[2] * 2, y2 = rect[3] * 2;

            // 내부는 2로, 테두리는 1로 표시
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    if (i == x1 || i == x2 || j == y1 || j == y2) {
                        //note 사각형의 테두리는 항상 네개의 좌표를 하나는 무조건 갖고 있어야함 그러면 테두리임!

                        if (map[i][j] != 2) map[i][j] = 1; // 테두리만 1로 유지
                    } else {
                        map[i][j] = 2; // 내부는 2로 채우기
                    }
                }
            }

        }

        // 2. **BFS로 최단 거리 탐색**
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[102][102];

        // 시작 위치를 2배로 변환 후 큐에 추가
        int startX = characterX * 2, startY = characterY * 2;
        int endX = itemX * 2, endY = itemY * 2;
        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0], y = now[1], dist = now[2];

            // 목표 지점 도달 시 반환 (2배 확장했으므로 결과는 /2)
            if (x == endX && y == endY) return dist / 2;

            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                // 테두리(1)만 이동 가능
                if (nx >= 0 && nx < 102 && ny >= 0 && ny < 102 &&
                        map[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny, dist + 1});
                    visited[nx][ny] = true;
                }
            }
        }

        return -1; // 아이템에 도달할 수 없는 경우
    }
}
