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
        }

        return dp[n];
    }
}
