package 기초1.Day22.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_큰_증가하는_부분수열 {
    //수열 A가 주어졌을 때, 그 수열의 증가하는 부분 수열 중에서 합이 가장 큰 것을 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N+1]; //입력받은 수열이 들어갈 배열
        int[] dp = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i <= N; i++) { //입력받은 수열을 배열에 넣어줌
            seq[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = seq[1];

        for (int i = 1; i <= N; i++) {
            dp[i] = seq[i];

            for (int j = 1; j < i; j++) {

                if (seq[i] > seq[j]) {
                    dp[i] = Math.max(dp[j]+seq[i],dp[i]);

                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i :dp){
            max = Math.max(i,max);
        }

        System.out.println(max);
    }
}
