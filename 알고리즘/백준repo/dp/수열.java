package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수열 {

    //2491

    // 연속해서 증가하거나 연속해서 감소하는 경우의 ( 같은 것도 포함해서) 그 길이 반환
    // 연속해서 증가 or 감소하는 경우가 없음 일반적인 2를 반환 (고려할 필요 없을듯)

    // 현재 값과 비교할 때
    // 증가하는 dp와 감소하는 dp를 같이 불러서 확인해야 하나 ? 아니면 둘다 계산하는데 그 중 수열의 길이가 더 큰걸로 ?
    // 아님 다음 수가 현재 수 보다 큰 지 작은 지만 비교해서 반환 ?

    // 정답은 dp를 2차원 배열로 증가하는 수와 감소하는 수 두개를 저장하는 것

    static int arr[];
    static int dp[];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        arr = new int[t];
        dp = new int[t];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

        }

        dp[0] = 1;



    }

    private static int dp(int n) {


        if (dp[n] == 0) {
            if (dp[n - 1] <= dp[n]) {
              return dp[n] = dp()

            }

        }
    }


}
