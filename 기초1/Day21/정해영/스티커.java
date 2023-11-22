package 기초1.Day21.정해영;

import java.util.Scanner;

public class 스티커 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt(); //테스트 케이스

        for(int k=0; k<t; k++){

            int n = sc.nextInt(); //2xn개 의 스티커

            int[][] arr = new int[2][n];
            int[][] dp = new int[2][n];

            for(int i=0; i<2; i++){
                for(int j=0; j<n; j++){
                    arr[i][j] = sc.nextInt(); //arr 할당
                }
            }

            dp[0][0] = arr[0][0]; //초기값 할당
            dp[1][0] = arr[1][0]; //초기값 할당

            int max = Math.max(dp[0][0], dp[1][0]);

            dp[0][1] = arr[1][0] + arr[0][1];
            dp[1][1] = arr[0][0] + arr[1][1];

            for(int i=2; i<n; i++){
                dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + arr[0][i];
                dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + arr[1][i];
                max = Math.max(max, Math.max(dp[0][i], dp[1][i]));
            }
            sb.append(max).append("\n");
        }
        System.out.print(sb);
        sc.close();
    }
}
