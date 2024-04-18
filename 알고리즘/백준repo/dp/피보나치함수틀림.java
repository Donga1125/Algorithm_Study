package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치함수틀림 {

    //1003 0 or 1 얼마나 많이 출력 하는 지 배열 형태로

    private static Integer[] dp;
    private static int[] or;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            dp = new Integer[41];



            or = new int[2];



            fibo(n);

            sb.append(or[0]).append(" ").append(or[1]).append('\n');


        }

        System.out.println(sb);


    }

    private static int fibo(int n) {

        dp[0] = 0;
        dp[1] = 1;

        if (n == 0) {
            or[0]++;
        }
        if (n == 1) {
            or[1]++;
        }



        if (dp[n] == null) {

            return dp[n] = fibo(n - 1) + fibo(n - 2);

        }

        return dp[n];

    }
}
