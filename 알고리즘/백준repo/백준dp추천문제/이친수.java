package 알고리즘.백준repo.백준dp추천문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이친수 {

    //2193

    // 0과 1로 이루어진 이진수인데 인수는 특수한 성질을 갖는다.
    // 0으로 시작 x, 1이 연속으로 못온다

    //dp[n] 은 두가지 경우다 dp[n-1]은 두가지 경우, dp[n-2]는 한가지 경우
    //dp[1] 은 1로 한가지, dp[2]는 10으로 한가지, dp[3]은 101, 100 두가지다
    // dp[3]은 dp[2]에서 1을 붙인 하나의 경우와, 0을 붙인 2가지 경우가 있다.
    private static int t;
    private static int count = 0;
    private static String str;
    private static Integer dp[];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());



        long [] answer = new long[t+1];

        answer[0] = 0;
        answer[1] = 1;

        for (int i = 2; i <= t; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        System.out.println(answer[t]);
    }
}



