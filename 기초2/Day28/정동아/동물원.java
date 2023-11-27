package 기초2.Day28.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 동물원 {
    // 2*N 배열에 사자를 배치하는 경우의 수가 몇 가지인지 출력
    // 사자를 배치하는 경우의 수를 9901로 나눈 나머지를 출력
    /*
    * dp[i][j] : i번째 줄의 j번째 칸에 동물을 놓을 수 있는 경우의 수
    * j = 0 : 아무 동물도 놓지 않음
    * j = 1 : 첫 번째 칸에 동물을 놓음
    * j = 2 : 두 번째 칸에 동물을 놓음
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int N = Integer.parseInt(br.readLine());
        long [][] dp = new long[N+1][3];

        dp[1][0] = dp[1][1] = dp[1][2] = 1;

        for (int i = 2; i<=N; i++){
            dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) %9901;
            dp[i][1] = (dp[i-1][0] + dp [i-1][2]) %9901;
            dp[i][2] = (dp[i-1][0] +dp[i-1][1])%9901;
        }

        long ans = (dp[N][0] + dp[N][1] + dp[N][2])%9901;
        System.out.println(ans);

    }
}
