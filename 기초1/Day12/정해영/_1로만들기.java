package 기초1.Day12.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1로만들기 {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n+1];

        dp[0] = dp[1] = 0;

        System.out.println(recursion(n));
        br.close();

    }

    static int recursion(int n){

        //6으로 나눠지는 경우
        if(dp[n] == null){

            if(n % 6 == 0){
                dp[n] = Math.min(recursion(n-1), Math.min(recursion(n/3), recursion(n/2)))+1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(recursion(n/3), recursion(n-1))+1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(recursion(n/2), recursion(n-1))+1;
            }else {
                dp[n] = recursion(n-1)+1;
            }
        }

        return dp[n];
    }
}
