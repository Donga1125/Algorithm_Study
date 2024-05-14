package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 돌게임 {
    //9655
    // 1 or 3
    private static int[] dp;
    private static boolean[] dp1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        dp = new int[t + 1];

        System.out.println("SK");
        System.out.println("CY");

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;

        for (int i = 4; i <= t; i++) {

        }

    }
}
