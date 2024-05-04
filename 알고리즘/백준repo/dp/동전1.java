package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전1 {

    private static int[] coin;
    private static int[] dp;
    //n개의 동전으로 k 수 만들기 몇개든 사용가

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        coin = new int[n + 1];
        dp = new int[k + 1];

        for (int i = 1; i<=n; i++) {

            coin[i] = Integer.parseInt(br.readLine());

        }
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = coin[0]; j <= k; j++) {
                if (j < coin[i]) {
                    continue;

                }
                dp[j] += dp[j - coin[i]];

            }


        }
        System.out.println(dp[k]);

    }
}
