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
    static int dp[][];
    static int max = Integer.MIN_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        arr = new int[t+1];
        dp = new int[2][t+1];



        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= t; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

        }
        if (t == 1) {
            System.out.println(1); // 0인줄 알고 계속 풀었는데 1이면 연속하는 수열이 0개인 거 아닌가 ?.. 하나라도 하나로 친다고 봐야하네
            return;
        }



        dp[0][1] = 1; // 증가 값
        dp[1][1] = 1; // 감소 값

        for (int i = 2; i <= t; i++) {

            if (arr[i] >= arr[i - 1]) { // 증가의 경우

                dp[0][i] = dp[0][i - 1] + 1; //카운트 증가

            } else dp[0][i] = 1; // 반대의 경우 i를 다시 1부터 시작하게

            if (arr[i] <= arr[i - 1]) { // 감소의 경우

                dp[1][i] = dp[1][i - 1] + 1; //카운트 증가

            } else dp[1][i] = 1; // 반대의 경우 i를 다시 1부터 시작하게

            max = Math.max(max, Math.max(dp[0][i], dp[1][i])); // 매번 max 값 max에 저장해줌
        }

        System.out.println(max);
//
//        for (int i = 1; i <=t ; i++) {
//            System.out.print(dp[0][i]);
//            System.out.print(" ");
//
//        }
//        System.out.println();
//
//        for (int i = 1; i <=t; i++) {
//            System.out.print(dp[1][i]);
//            System.out.print(" ");
//        }

        }

    }



