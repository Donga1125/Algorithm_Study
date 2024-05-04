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

        for (int i = 1; i <= n; i++) { //coin에 하나씩 저장된 수들을 돌면서 dp를 계속 갱신
            for (int j = coin[i]; j <= k; j++) { //coin[j] 값들 ex) 1,2,5로 k = 10까지 시작해서 쭉 갱신해줌

                dp[j] += dp[j - coin[i]]; //dp [j] 값은 dp[j] + dp[j - 여기서 이해가 안감.

            }


        }
        System.out.println(dp[k]);

    }
}
