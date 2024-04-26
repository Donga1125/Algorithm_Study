package 알고리즘.백준repo.백준dp추천문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부녀회장이될테야 {
    //2775
    // 바로 아래층의 누적합을 구해


    // 입력값에 따라 그때의 0층 0호부터 n호까지 있는건지 잘 모르겠ㅇ

    // 구간합 공식 dp[i][j] = dp[i][j-1] +

    static int[][] dp;


    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {

            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            dp = new int[k+1][n+1];

            dp[0][0] = 0;


            for (int j = 0; j <= k; j++) {
                for (int l = 1; l <= n; l++) {
                    dp[j][l] = dp[j][l - 1] + l;
                }


            }
            System.out.println(dp[k-1][n]);

        }
            
    }
}
