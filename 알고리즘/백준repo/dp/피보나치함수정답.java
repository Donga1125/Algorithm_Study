package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치함수정답 {

    //1003 0 or 1 얼마나 많이 출력 하는 지 배열 형태로
    // 지금 피보나치 함수도 구하고, 0 1도 구했는데 피보나치 함수만 dp로 저장해서 틀렸다

    private static Integer[][] dp;
    private static int[] or;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            dp = new Integer[41][2];







            fibo(n);

            sb.append(dp[n][0]).append(" ").append(dp[n][1]).append('\n');


        }

        System.out.println(sb);


    }

    private static Integer[] fibo(int n) {

        dp[0][0] = 1; // n이 0이라면 0 1 중 0이 하나 올라가야하고
        dp[0][1] = 0; //  n이 0이라면 0 1 중 0은 안올라가야하고
        dp[1][0] = 0; //  n이 1이라면 0 1 중 0은 안올라가야하고
        dp[1][1] = 1; //  n이 1이라면 0 1 중 1은 하나 올라가야한다


        if (dp[n][0] == null || dp[n][1] == null) {

            dp[n][0] = fibo(n - 1)[0] + fibo(n - 2)[0];
            dp[n][1] = fibo(n - 1)[1] + fibo(n - 2)[1];

        }
        // N에 대한 0과 1, 즉 [N][0]과 [N][1] 을 담고있는 [N]을 반환한다.

        return dp[n];

    }
}
