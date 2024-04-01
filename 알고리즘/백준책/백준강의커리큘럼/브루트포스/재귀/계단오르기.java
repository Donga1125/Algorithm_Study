package 알고리즘.백준책.백준강의커리큘럼.브루트포스.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 계단오르기 {
    //2579
    static Integer dp[];
    static int arr[];

    // 점화식은 f(n-1) + f(n-2)
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());

        }
    }

    private static int dfs(int n) {

        if (dp[n] == null) {
            dp[n] = Math.max(dfs(n - 2), dfs(n - 3) + arr[n - 1]) + arr[n];

            //연속된 세 계단을 밟을 수 없기에 n까지 오는 경우엔 n-1이면 그전은 무조건 n-3을 밟고 난 후고
            // 아닌 경우라면 n-2만 밟는 두 경우의 수만 존재

            // 또 n-1을 재귀 호출 안하고 n-3 + arr[n-1]을 하는 이유가 어려운데 n-1을 할 경우
            // dp[4]를 호출하고 그 경우 dp[4] -3의 경우를 찾기 힘들기에 n-3 호출 후 그 값 n-1을 더해주는 형식
        }

        return dp[n];
    }
}
