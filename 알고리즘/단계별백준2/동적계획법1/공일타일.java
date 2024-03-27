package 알고리즘.단계별백준2.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 공일타일 {
    //01타일인데 0을 쓰려면 00이 무조건 붙어 있어야 한다

    // 수열이 피보나치처럼 증가한다 피보랑 똑같은 식
    private static int[] dp = new int[1000001];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = - 1;
        }
        System.out.println(fibo(t));
            
    }

    private static int fibo(int n) {



        if (dp[n] == -1) {

            dp[n] = (fibo(n - 1) + fibo(n - 2)) % 15746;

        }
        return dp[n];



    }
}
