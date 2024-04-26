package 알고리즘.백준repo.백준dp추천문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부녀회장이될테야 {
    //2775
    // 바로 아래층의 누적합을 구해


    // 입력값에 따라 그때의 0층 0호부터 n호까지 있는건지 잘 모르겠ㅇ

    // 구간합 공식을 써야겠다. 쉬프트 어려움 그러려면 일단 배열을 만들어놓자(안만들어서 헷갈림) 그리고 구간합 + 그 배열 수를 더해주자

    // 구간합 공식  dp[j][l] = dp[j - 1][l] + dp[j][l-1];


    static int[][] dp;
    static int[][] arr; //
    static StringBuilder sb;


    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        sb = new StringBuilder();






        for (int i = 0; i < t; i++) {

            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            dp = new int[k+1][n+1];





            for (int j = 1; j <= n; j++) {
                dp[0][j] = j;

            }

            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= n; l++) {
                    dp[j][l] = dp[j - 1][l] + dp[j][l-1];

                }
            }
            sb.append(dp[k][n]).append('\n');


        }
        br.close();
        System.out.println(sb);
            
    }
}
