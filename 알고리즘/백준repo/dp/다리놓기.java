package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다리놓기 {

    //1010 // 조합 문제
    static int n;
    static int m;
    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            System.out.println(combi(m, n));


        }

    }

    private static int combi(int n, int r) {


        if (dp[n][r] > 0) {
            return dp[n][r];}

            if (n == r || r == 0) {

                return dp[n][r] = 1;

            }
            return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }}




