package 알고리즘.백준강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퇴사2 {
    //15486

    //n이 150,000이다 2^150.--- 이라 완탐 불가 dp류 해결

    //dp[i]에는 각각의 날짜까지의 상담을 했을 때 최대값을 저장해주자 i번째 일까지 상담했을 때의 최대 이익으로 생각해야 dp를 할 수 있ㅇ므

    //i가 1일이라면 0원을 벌고, 그다음




   private static int[][] dp;
    private static int n;
    private static int max = Integer.MIN_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());


        dp = new int[n][2];



        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dp[i][0] = Integer.parseInt(st.nextToken()); // 시간
            dp[i][1] = Integer.parseInt(st.nextToken()); // 금액

        }

        dfs();

        System.out.println(max);




    }

    private static void dfs() {

        int[] data = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int next = n + dp[n][0]; // 날짜
            if (next <= n) {
                data[next] = Math.max(data[n] + dp[n][1], data[next]);

            } else {
                data[n + 1] = Math.max(data[n], data[n + 1]);
            }

        }
        max = data[n];


    }


}
