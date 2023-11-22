package 기초1.Day18.정해영;

import java.util.Scanner;

public class 제곱수의합 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n+1]; //n까지의 최소 count를 저장.

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){

            dp[i] = i; //처음 1의 제곱으로만 표현할수있는 개수로 초기화 시킴.

            for(int j=1; j*j<=i; j++){
                dp[i] = Math.min(dp[i], dp[i-j*j] + 1); // dp[4] = dp[4] , dp[3]+1=4  //dp[4-4] + 1 = 1
            }
        }

        System.out.println(dp[n]);
        sc.close();

    }
}
