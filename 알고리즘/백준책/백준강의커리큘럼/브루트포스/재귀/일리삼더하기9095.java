package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

import java.io.*;

public class 일리삼더하기9095 {

    //일리삼 더하기 dp로
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int[] dp = new int[11];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
            }

            sb.append(dp[n]).append('\n');

        }

        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
            
    }
}
