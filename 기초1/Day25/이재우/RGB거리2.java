package 기초1.Day25.이재우;

import java.io.*;
import java.util.StringTokenizer;

public class RGB거리2 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 최대 비용 값
    private static final int INF = 1_000 * 1_000;

    static int n;

    // cost[i][j] i번째 집을 j(R(0),G(1),B(2))칠하는 비용
    static int cost[][];

    // dp[i][j] i는 몇번째 집인지, j는 0,1,2 각각 R, G, B의 색을 칠했을 때 최솟값
    static int dp[][];
    static int answer = INF;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        cost = new int[n + 1][3];
        dp = new int[n + 1][3];

        // 입력 값 저장
        for(int i = 1 ; i <= n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 3; j++){
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // k = 0 -> RED, 1 -> GREEN, 2 -> BLUE로 첫 집을 칠하는 경우이다.
        for(int k = 0; k < 3; k++) {
            //RED, GREEN, BLUE로 칠하는 경우 각 색을 제외한 나머지는 INF로 초기화 해준다.
            for(int i = 0 ; i < 3; i++) {
                if(i == k) dp[1][i] = cost[1][i];
                else dp[1][i] = INF;
            }

            // 열의 값인 0 -> RED, 1 -> GREEN, 2 -> BLUE로 칠했을 때의 최소값을 의미한다.
            for (int i = 2; i <= n; i++) {
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0];
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1];
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2];
            }

            for(int i = 0 ; i < 3; i++)
                if(i != k) answer = Math.min(answer, dp[n][i]);
        }

        bw.write(answer + "\n");

        bw.close();
        br.close();
    }
}
