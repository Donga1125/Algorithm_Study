package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 파스칼의삼각형 {
    //15489
    //n번째 행엔 n개의 수, 첫 번째 행은 1부터, 양옆은 1이고 나머지 수는 인접한 위 수의 합

    //n번째 행의 k번째 수 나타내라

    private static int dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        dp = new int[31][31];



        dp[1][1] = 1;


        for (int i = 2; i <= 30; i++) {
            dp[i][1] = 1;
            for (int j = 2; j <= i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }

        }

        System.out.println(dp[n][k]);




    }
}
