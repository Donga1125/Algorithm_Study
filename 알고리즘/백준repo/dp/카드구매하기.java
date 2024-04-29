package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카드구매하기 {

    static int[] card;
    static int[] dp;

    //카드 갯수n  1,2,3,4 있고 금액으로 배열 저장하는데 n개를 사면서 금액이 가장 큰 걸 반환
    // 1 = 1
    // 2 = 1+1      , 2                              1+1이 arr[1] + arr[1]이라는 생각이 아니라 dp[1] + arr[1]이라고 생각해야함
    // 3 = 1+1+1    , 2+1    ,             3(c3+d0)
    // 4 = 1+1+1+1  , 2+1+1  , 2+2  ,      3+1  , 4
    // 5 = 1+1+1+1+1, 2+1+1+1, 2+2+1, 3+2, 3+1+1, 4+1

    //for 돌면서 각 경우의 수를 계산해서 dp[i]에 저장해준다.

    //f(n) = Math.max(dp[n-1] + dp[1] , arr[n]) 큰 값인데 이러면 2+2는 ?
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        card = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            card[i] = Integer.parseInt(st.nextToken());

        }
        br.close();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {

                dp[i] = Math.max(dp[i - j] + card[j], dp[i]); // j for문을 돌면서 max로 저장된 dp[i]를 계속 갱신해서 최대값 저장
                //dp[3] = dp[3],  card[1] + dp[2](3-1) // 3장 만들때 1+1+1, 2+1, 3인데
                //dp[3] = dp[3],  card[2] + dp[1](3-2)
                //dp[3] = dp[3],  card[3] + dp[0](3-3)
            }

        }
        System.out.println(dp[n]);
            
    }
}
