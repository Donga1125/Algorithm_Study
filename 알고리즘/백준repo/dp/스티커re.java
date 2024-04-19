package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스티커re {
    // 9465

    //2행 n열로 되어 있는 스티커를 떼면 인접한 스티커는 못떼게 되고 최대한 많은 점수를 가진 스티커를 떼자

    static int[][] sticker;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            sticker = new int[2][n +1];
            dp = new int[2][100001];



            for (int j = 0; j <2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());


                for (int k = 1; k <= n; k++) {
                    sticker[j][k] = Integer.parseInt(st.nextToken());

                }
            }
            dp[0][1] = sticker[0][1];
            dp[1][1] = sticker[1][1];

            for (int j = 2; j <= n; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + sticker[0][j];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + sticker[1][j];
                // max값으로 더 큰 dp에 바로 직전 누적합을 가져오고 현재 값을 더해서 저장

                // 예제1의 경우 dp에 저장되는 값은
                // 50 60 200 150 250
                // 30 100 130 210 260 으로 예제1의 가장 큰 스티커의 합은 260이 된다..
            }






            sb.append(Math.max(dp[0][n], dp[1][n])).append('\n');



        }

        System.out.println(sb);
    }
}
