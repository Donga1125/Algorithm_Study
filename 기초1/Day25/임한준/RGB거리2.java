package 기초1.Day25.임한준;

import java.io.*;
import java.util.StringTokenizer;

public class RGB거리2 {

    /**
     문제 17404
     RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.

     집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때, 아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.

     1번 집의 색은 2번, N번 집의 색과 같지 않아야 한다.
     N번 집의 색은 N-1번, 1번 집의 색과 같지 않아야 한다.
     i(2 ≤ i ≤ N-1)번 집의 색은 i-1, i+1번 집의 색과 같지 않아야 한다.
     입력
     첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다. 집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.

     출력
     첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.
     */

    // 마지막 집이 첫번 째랑 달라야 한다.. 1!=n

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][4];
        int[][] cost = new int[n+1][4];
        int ans = 1_000_001;

        for(int i=1; i<=n; i++) {
            String[] arr = br.readLine().split(" ");
            for(int j=1; j<=3; j++) { cost[i][j] = Integer.parseInt(arr[j-1]); }
        }

        for(int i=1; i<=3; i++) {
            for(int j=1; j<=3; j++) {
                dp[1][j] = i==j ? cost[1][j] : 1_000_001;
            }

            for(int j=2; j<=n; j++) {
                dp[j][1] = Math.min(dp[j-1][2], dp[j-1][3])+cost[j][1];
                dp[j][2] = Math.min(dp[j-1][1], dp[j-1][3])+cost[j][2];
                dp[j][3] = Math.min(dp[j-1][1], dp[j-1][2])+cost[j][3];
            }

            for(int j=1; j<=3; j++) {
                if(i!=j) { ans = Math.min(ans, dp[n][j]); }
                else { continue; }
            }
        }

        System.out.println(ans);
    }


}
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int dp[][] = new int[0][3];
//        int cost[][] = new int[n][3];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 3; j++) {
//
//                cost[i][j] = Integer.parseInt(st.nextToken());
//
//            }
//        }
//
//
//        for (int i = 0; i < n; i++) { // r g b 0 1 2
//            dp[n][0] = Math.min(dp[n - 1][1], dp[n - 1][2]) + cost[n][0];
//            dp[n][1] = Math.min(dp[n - 1][0], dp[n - 1][2]) + cost[n][1];
//            dp[n][2] = Math.min(dp[n - 1][1], dp[n - 1][0]) + cost[n][2];
//
//        }
//
//    }
