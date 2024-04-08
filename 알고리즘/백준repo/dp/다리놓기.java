package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다리놓기 {

    //1010 // 조합 문제
    static int n;
    static int m;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            dp = new Integer[m +1];
            System.out.println(dp(0));

        }

    }

    private static int combi(int n, int m) {


        if(n == m){
            return dp[n];
        }



        if (dp[n] == null) {

            return dp[n] = combi(1,2,) + combi(3,4)

        }

        return dp[n];

    }
}
