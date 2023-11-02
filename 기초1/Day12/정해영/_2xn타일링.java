package 기초1.Day12.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2xn타일링 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[1002];

        //bottom up 방식 적용
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++){
            // mod 연산을 한 결과값을 출력할때는 반드시 연산할때마다 mod 연산을 해야한다.
            // 마지막에만 mod시에 Overflow가 발생할수도 있기 때문.
            dp[i] = (dp[i-2] + dp[i-1]) % 10007;
        }

        System.out.println(dp[n]);
        br.close();
    }
}
