package 기초1.Day13.정동아;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 타일링2 {
    //2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 출력
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007; //n번째 타일의 경우의 수는(n - 1번째 타일의 경우의 수) + (n - 2번째 타일의 경우의 수의 두 배)
        }

        System.out.println(dp[n]);
    }
}
