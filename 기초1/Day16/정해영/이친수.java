package 기초1.Day16.정해영;

import java.util.Scanner;

public class 이친수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[][] dp = new long[n+1][2]; //int 형 선언시에 범위가 초과된다.

        /*
        이렇게 이해하자. n=2 일때, 2자리수 00 01 10 11 이렇게 나올것이다.
        여기서 dp[자리수][마지막뒷자리] = 이친수의 개수 로 선언하자.
        즉, dp[2][0] 이라면 {0}0 {0}1 이렇게 될것이고, 이친수의 갯수는 0이다. 왜나하면 제일앞에는 0일수가 없기때문.
        dp[2][1] 이라면 {1}0 {1}1 이렇게 될것이다. 이친수의 개수는 1이다.
         */

        dp[1][1] = 1;
        dp[1][0] = 0;

        for(int i=2; i<=n; i++){
            dp[i][0] = dp[i-1][0] + dp[i-1][1]; //[4][0] -> {100}0, {100}1
            dp[i][1] = dp[i-1][0]; // [4][1] -> {101}0 이런식으로...!
        }

        System.out.println(dp[n][0] + dp[n][1]);
        sc.close();
    }
}
