package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 점화식 {

    private static long[] dp;
    //13699

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        dp = new long[36];

        dp[0] = 1;
        dp[1] = 1;


        for (int i = 2; i < 36; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = dp[i] + (dp[j] * dp[i - 1 - j]);
            } // 처음에 dp[i]의 값이 어디서 가져오지 했는데 기본 0의 값부터 시작햇 ㅓ계속 더해 가는 걸 놓쳤다..

        }
        System.out.println(dp[t]);

    }}
