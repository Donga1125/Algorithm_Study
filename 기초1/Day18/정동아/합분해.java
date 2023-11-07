package 기초1.Day18.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 합분해 {
    //0부터 N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 수를 출력
    //덧셈의 순서가 바뀐 경우는 다른 경우로 센다(1+2와 2+1은 서로 다른 경우)
    //한 개의 수를 여러 번 쓸 수 있음
    //첫째 줄에 답을 1,000,000,000으로 나눈 나머지를 출력
    //ex_20 2이 주어지면 0~20까지 정수2개를 더해서 그 합이 N이 되는 경우를 구해야함

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][]dp = new int[K+1][N+1]; //k번 더해서 n이 되는 경우의 수
        for (int i =1; i<=K; i++){
            dp[i][0] = 1;
        }

        for (int i =1; i<=K; i++){
            for (int j =1; j<=N; j++){
                dp[i][j] = (dp[i][j-1] + dp[i-1][j])%1000000000;
            }
        }

        System.out.println(dp[K][N]);
    }
}
