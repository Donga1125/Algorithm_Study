package 알고리즘.유기농배추;

import java.io.*;
import java.util.StringTokenizer;

//인접한 다른 배추로 상하좌우 이동 -> dfs/bfs
// 서로 연결되었다는 정보를 어떻게 하나 자료구조로 통합 ? 2차원배열 vs arraysList
// 재방문을 방지하려면 ?
// visited를 없애려면 ?
public class Joon1012 {

    final static int max = 50 + 10; // 최대 50개까지 들어올 수 있는데 여분 10개
    static boolean map[][];
    static boolean visited[][]; // 없이 map을 그냥 false로 바꾸면 생략해도 된다
    static int T, N, M , K;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};

    static void dfs(int y, int x) {
        visited[y][x] = true;
//        dfs(y + 1, x);  4가지의 경우지만 같은코드가 중복되고, 예외처리 어려워짐 그래서 포문으로 바꿔보자
//        dfs(y - 1, x);
//        dfs(y, x + 1);
//        dfs(y, x - 1);
        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i]; // 4가지를 확인할 때 range를 벗어나는지 확인해야함 그니까 0,0의 무조건
            // 존재하게 되고 밑 조건에선 무조건 탈락하게 됨 그래서 저렇게 만드는 게 유리

            int newX = x + dirX[i];

            if (map[newY][newX] && visited[newY][newX] == false) { //받은 좌표 중 인접한 것인 새로운 좌표에서 다시 dfs 호출하기
                dfs(newY, newX);
            }
        }

    }



    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화 과정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        while (T-- > 0) { // 테스트 케이스마다 한번씩 모든 동작 수행
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new boolean[max][max]; // false 값으로 다 초기화
            visited = new boolean[max][max];

            // 1. map 정보를 입력 받은 값으로 넣어주기
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y + 1][x + 1] = true; // 이게 실제로 입력받은 배추의 map 있으면 1이 표시되어 있다.
            }

            // 2.dfs 수행
            int answer = 0;
            for (int i = 1; i <= N ; i++) { // 0이 아닌 1로 map을 만드는 이유는 ? dfs에 가서 확인해봐
                for (int j = 1; j <= M; j++) {
                    if (map[i][j] && visited[i][j] == false) { // 맵에 배추가 존재하고 && 내가 방문하지 않은 곳이라면
                        answer++;
                        dfs(i, j);
                    }
                }
            }
            // 3. 출력
            bw.write(String.valueOf(answer));
            bw.newLine();




        }

        br.close();
        bw.close();
    }
}
