package 기초1.Day13.정동아;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문제123더하기{
//정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력
    public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();

    int T = Integer.parseInt(br.readLine());

    for (int t = 0; t < T; t++) { //dp[4] = dp[3] + dp[2] + dp[1]
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        sb.append(dp[n]).append('\n');

    }
}
}

