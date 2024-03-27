package 알고리즘.단계별백준2.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일로만들기dp배열 {

    //1463
    private static int max = Integer.MAX_VALUE;
    static Integer dp[];




    // 3으로 나누거나 2로 나누거나 -1로 하거나 세가지 경우인데 최소여도 3부터가 아니라 다 경우의 수 따져야 함

    // 함정은 ㅣㅍ했는데 나눴을 때 더 작은 걸 선택하는 dfs 구현이 어렵다.. 나눴을 때 dfs 호출 시 선택 지를 하나가아니라 여러개로
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;


        System.out.println(dfs(n));

            
    }

    private static int dfs(int n) {

        if (dp[n] == null) {

            if (n % 6 == 0) {
                dp[n] = Math.min(dfs(n - 1), Math.min(dfs(n / 3), dfs(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(dfs(n / 3), dfs(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(dfs(n / 2), dfs(n - 1)) + 1;
            } else
                dp[n] = dfs(n - 1) + 1;


        }
        return dp[n];



    }}

