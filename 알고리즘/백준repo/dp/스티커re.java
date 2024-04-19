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

            sticker = new int[2][n];
            dp = new int[2][100001];



            for (int j = 0; j <2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());


                for (int k = 0; k < n; k++) {
                    sticker[j][k] = Integer.parseInt(st.nextToken());

                }
            }
            dp[0][0] = sticker[0][0];
            dp[0][1] = sticker[0][1];




                for (int k = 1; k < n; k++) {

                    for (int j = 0; j < 2; j++) {

                        if (j == 0 && k +1 < n && k+2 < n ) {
                            dp[j][k] = dp[j][k] + Math.max(sticker[j +1][k + 1], sticker[j+1][k + 2]);

                        }

                        if (j == 1 && k +1 < n && k+2 < n) {
                            dp[j][k] = dp[j][k] + Math.max(sticker[j -1][k + 1], sticker[j -1][k + 2]);
                        }


                    }
                }

            sb.append(Math.max(dp[0][n-1], dp[1][n-1])).append('\n');



        }

        System.out.println(sb);
    }
}
