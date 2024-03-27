package 알고리즘.단계별백준2.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파도반수열 {
    //9461

    //점화식 f(n) = f(n-2) + f(n-3)
    // 피보랑 한 스텝 다른 데 이걸 어떻게 알아채냐..
    private static long[] dp = new long[1000001];
    //100이 들어올 수 있기에 long
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        sb = new StringBuilder();


        for (int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());

            dp[0] = 0;

            dp[1] = dp[2] = dp[3] = 1;

            for (int j = 3; j < dp.length; j++) {
                dp[j] = -1;
            }

            sb.append(dfs(n)).append('\n');


        }
        System.out.println(sb);

    }

    private static long dfs(int n) {




        if (dp[n] == -1) {

            dp[n] = dfs(n - 2) + dfs(n - 3);
        }

        return dp[n];
    }
}
