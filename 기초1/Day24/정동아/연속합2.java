package 기초1.Day24.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] array = new int[N];
        int [][] dp = new int[N][2];

        for (int i =0; i<N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

            int max = array[0];
            dp[0][0] = array[0];
            dp[0][1] = array[0];

            for (int i =1; i<N; i++){
                dp[i][0] = Math.max(dp[i-1][0] + array[i], array[i]);
                dp[i][1] = Math.max(dp[i-1][0], dp[i-1][1] + array[i]);
                max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
            }

        System.out.println(max);
        }
    }
