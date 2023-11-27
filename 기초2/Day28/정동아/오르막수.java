package 기초2.Day28.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 오르막수 {
    //수의 길이 N이 주어졌을 때, 오르막 수의 개수 출력
    // 첫째 줄에 길이가 N인 오르막 수의 개수를 10,007로 나눈 나머지를 출력

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int N = Integer.parseInt(br.readLine());
        int [][] dp = new int [N+1][10];

        for (int i =0; i<10; i++){
            dp[0][i] = 1;
        }

        for (int i =1; i<N+1; i++){
            for (int j =0; j<10; j++){
                for (int k = j; k<10; k++){
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

        System.out.println(dp[N][0] %10007);
    }
}
