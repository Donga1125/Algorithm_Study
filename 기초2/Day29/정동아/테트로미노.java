package 기초2.Day29.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 테트로미노 {
    static int N, M, max = Integer.MIN_VALUE;
    static int[][] map;
    static boolean[][] visited;

    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int x = 0; x < M; x++) {
                map[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                visited[y][x] = true;
                dfs(y, x, 1, map[y][x]);
                visited[y][x] = false;

                combi(0, 0, y, x, map[y][x]);	//인접한 4칸 중 3칸 고르기(ㅗ,ㅓ,ㅏ,ㅜ 모양)
            }
        }

        System.out.println(max);

        br.close();

    }

    private static void combi(int cnt, int start, int y, int x, int sum) {
        if(cnt == 3) {
            max = Math.max(max, sum);
            return;
        }

        for (int d = start; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];

            if(ny<0 || ny>=N || nx<0 || nx>=M) continue;

            combi(cnt+1, d+1, y, x, sum+map[ny][nx]);
        }
    }


    private static void dfs(int y, int x, int cnt, int sum) {

        if(cnt == 4) {
            max = Math.max(max, sum);
            return;
        }

        for (int d = 0; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];

            if(ny<0 || ny>=N || nx<0 || nx>=M) continue;
            if(visited[ny][nx]) continue;

            visited[ny][nx] = true;
            dfs(ny, nx, cnt+1, sum+map[ny][nx]);
            visited[ny][nx] = false;
        }

    }
}
