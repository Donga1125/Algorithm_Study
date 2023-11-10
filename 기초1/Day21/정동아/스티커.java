package 기초1.Day21.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;

public class 스티커 {
    //뗀 스티커의 왼쪽, 오른쪽, 위, 아래에 있는 스티커는 사용할 수 없다.
    //각 스티커에 점수를 매기고, 점수의 합이 최대가 되게 스티커를 떼어내려고 한다.
    //뗄 수 있는 스티커의 점수의 최댓값을 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i =0; i<T; i++){
            int N = Integer.parseInt(br.readLine());

            int [][] stickers = new int [2][N];
            int [][] dp = new int[2][N];
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j<N; j++){
                stickers[0][j] = Integer.parseInt(st1.nextToken());
                stickers[1][j] = Integer.parseInt(st2.nextToken());

            }

            //첫번째 컬럼은 자기 자신이므로 초기화
            dp[0][0] = stickers[0][0];
            dp[1][0] = stickers[1][0];
            int max = Math.max(dp[0][0], dp[1][0]);

            for (int j =1; j< N; j++){
                if (j == 1){
                    dp[0][j] = dp[1][0] + stickers[0][1];
                    dp[1][j] = dp[0][0] + stickers[1][1];
                    max = Math.max(dp[0][j], dp[1][j]);
                    continue;
                }
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + stickers[0][j];
                dp[1][j] = Math.max(dp[0][j-1],dp[0][j-2]) + stickers[1][j];
                max = Math.max(max, Math.max(dp[0][j], dp[1][j]));
            }

            sb.append(max+ "\n");
        }
        System.out.println(sb);
    }
}
