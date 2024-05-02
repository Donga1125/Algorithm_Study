package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이동하기 {
    //11048
    //nxm 미로에 갇혀있다. 11부터 nm까지..
    // 움직임은 오,밑,대각오밑 세개로만 움직일 수 있으며 방문 때 마다 놓여있는 사탕을 가질수도아닐수도 있다
    // 이동할 때 마다 최종합이 가장 큰 수를 구해서 반환해라
    // 사실 상 대각선은 바로 이동하기보다 왼이나 아래 더해주고, 다시 이동하는 경우라 오 밑 중 큰 값을 따라간다
    private static int maze[][];
    private static int dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        maze = new int[n + 1][m + 1];
        dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                maze[i][j] = Integer.parseInt(st.nextToken());
//                System.out.print(maze[i][j] + " ");
            }
//            System.out.println();
        }

        dp[1][1] = maze[1][1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = maze[i][j] + Math.max(dp[i - 1][j - 1], Math.max(dp[i - 1][j], dp[i][j - 1]));
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

//        System.out.println(dp[n][m]);



    }
}
