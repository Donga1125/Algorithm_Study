package 기초1.Day19.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _123더하기3 {
    //정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력
    //합을 나타낼 때는 수를 1개 이상 사용
    //각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 1,000,000,009로 나눈 나머지를 출력
    //ex_d[4] = (d[3]+1) + (d[2]+2) + (d[1]+3)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[1000001];

        //초기값
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int j = 0; j < T; j++) {
            int N = Integer.parseInt(br.readLine());

            for (int i = 4; i <= 1000000; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000009;
            }
            sb.append(dp[N]).append('\n');
        }

        System.out.println(sb);

    }
}
