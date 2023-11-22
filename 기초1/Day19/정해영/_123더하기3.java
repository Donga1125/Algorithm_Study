package 기초1.Day19.정해영;

import java.util.Scanner;

public class _123더하기3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        long[] dp = new long[1_000_001];

        //이전에 풀었던 123더하기 문제와 동일한데 고려할점이 있다.
        //1. 제한 범위가 생김. > 모듈러 연산.
        //n이 1,000,000 까지 범위라면, dp점화식을 채우는 덧셈을 생각해보자.
        //피보나치를 구할때 n=47일때부터 int의 범위를 초과한다.
        //즉, 나머지연산을 하기전의 (dp[i-1] + dp[i-2] + dp[i-3]) 의 값이 1000000009 x 1000000009 가 나올수 있는 것이므로
        //long으로 해결한다.

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<dp.length; i++){
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1_000_000_009;
        }

        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
        sc.close();
    }
}
