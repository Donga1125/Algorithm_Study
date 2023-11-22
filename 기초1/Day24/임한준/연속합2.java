package 기초1.Day24.임한준;

import java.io.*;
import java.util.StringTokenizer;

public class 연속합2 {

    /**
     문제 13398
     n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 수는 한 개 이상 선택해야 한다. 또, 수열에서 수를 하나 제거할 수 있다. (제거하지 않아도 된다)

     예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 여기서 수를 제거하지 않았을 때의 정답은 12+21인 33이 정답이 된다.

     만약, -35를 제거한다면, 수열은 10, -4, 3, 1, 5, 6, 12, 21, -1이 되고, 여기서 정답은 10-4+3+1+5+6+12+21인 54가 된다.

     입력
     첫째 줄에 정수 n(1 ≤ n ≤ 100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다. 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.

     출력
     첫째 줄에 답을 출력한다.
     */

    // 연속된 수 중 가장 큰 값인데 배열에서 수 하나 삭제 가능 (안해도 됨)
    // dp[n] = dp[n] + dp[n-1] x
    // 2차원 배열 1차원 배열 방식 ( 1차원은 왼쪽에서 더해준 수와 오른쪽에서 계산한 수를 합하여 max 계산 n번째 수가 빠질 수 있게)
    // n번째 수를 제외했을 때와 안했을 때의 max 값을 비교해 dp[n][0],dp[n][1]로 계산하여 큰 값 저장

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // BufferReader는 스트링 값으로 고정이라 형 변환 필수 (개행문자 단위)
        StringTokenizer st = new StringTokenizer(br.readLine()); // (개행단위라 공백 처리)

        int[] arr = new int[n];
        int[][] dp = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        dp[0][0] = arr[0];
        dp[0][1] = arr[0];

        for (int i = 1; i < n ; i++) {
            dp[i][0] = Math.max(dp[i - 1][0] + arr[i], arr[i]); //기존 제거하지 않고 다 더한 값을 [0][0]에 저장
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1] + arr[i]); // 앞자리를 제거할 경우에 기존에 저장한 값과 비교
            max = Math.max(max,Math.max(dp[i][0], dp[i][1]));
        }

        bw.write(max + "\n");
        bw.close();
//        System.out.println(max);
    }
}
