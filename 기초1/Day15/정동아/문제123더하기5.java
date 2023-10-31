package 기초1.Day15.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제123더하기5 {
    //정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int max = 0;
        int[] ns = new int[t];
        for (int i = 0 ; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            ns[i] = n;
            max = Math.max(max, n);
        }
        long[][] dp = new long[100001][4];
        dp[1][0] = dp[1][3] = 1;
        dp[2][1] = dp[2][3] = 1;
        dp[3][0] = dp[3][1] = dp[3][2] = 1;
        dp[3][3] = 3;
        for (int i = 4; i <= max; i++) {
            dp[i][0] = ((dp[i-1][1]%1000000009) + (dp[i-1][2]%1000000009))%1000000009;
            dp[i][1] = ((dp[i-2][0]%1000000009) + (dp[i-2][2]%1000000009))%1000000009;
            dp[i][2] = ((dp[i-3][0]%1000000009) + (dp[i-3][1]%1000000009))%1000000009;
            dp[i][3] = (dp[i][0]+dp[i][1]+dp[i][2]) % 1000000009;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int num = ns[i];
            sb.append(dp[num][3] + "\n");
        }
        System.out.print(sb);
    }
}

