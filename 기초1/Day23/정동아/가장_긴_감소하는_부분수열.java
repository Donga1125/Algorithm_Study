package 기초1.Day23.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_긴_감소하는_부분수열 {
    //수열 A가 주어졌을 때, 가장 긴 감소하는 부분 수열을 출력

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N+1]; //입력받은 수열이 들어갈 배열
        int[] dp = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i <= N; i++) { //입력받은 수열을 배열에 넣어줌
            seq[i] = Integer.parseInt(st.nextToken());
        }


        int max = 0;

        for (int i = 1; i <= N; i++) {
            dp[i] = 1;

            for (int j = 1; j < i; j++) {

                if (seq[i] < seq[j]) { //시작값과 이전 값을 비교했을 때 이전 값이 크다면

                    //dp[j]는 이전까지 감소하는 부분 수열의 길이
                    //현재길이와 이전까지 연결된 최대길이 +1이랑 비교해서 최대를 저장함
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
            }
            max = Math.max(max,dp[i]);
        }

        System.out.println(max);

    }
}
