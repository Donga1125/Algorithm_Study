package 기초1.Day18.정해영;

import java.util.Scanner;

public class 합분해 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //합
        int k = sc.nextInt();

        int[][] dp = new int[n+1][k+1];

        //초기화 : 0개로 만들수있는 개수는 0개, 1개로 만들수있는것은 1개이다.
        for(int i=0; i<=n; i++){
            dp[i][0] = 0;
            dp[i][1] = 1;
        }

        //n=1일경우 만들수있는 개수는 k개.
        for(int i=0; i<=k; i++){
            dp[1][i] = i;
        }

        for(int i=2; i<=n; i++){
            for(int j=2; j<=k; j++){
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1_000_000_000;
            }
        }

        System.out.println(dp[n][k]);
        sc.close();
    }
}
