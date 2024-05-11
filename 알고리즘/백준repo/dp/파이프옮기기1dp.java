package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 파이프옮기기1dp {
    //17070
    // 벽이 존재할 수 있다 1로 주어짐 그럴 거긴 예외로 처리
    // 파이프는 45도만 가능하고 초기ㅇ ㅔ놓인 조건에 따라 즉 - 이면 \,  \ 이면 ㅣ,- ㅣ이면 \
    // 첫 파이프는 1,1 1,2를 가로의 모양으로 차지하고 있
    // 일단 먼저 1인지 아닌지 확인 후 3가지 갈래로 나눠야할듯 ? 전의 좌표의 모양에 따라 좌지우지
    private static int arr[][];
    private static int dp[][][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n + 1][n + 1];
        dp = new int[n + 1][n + 1][2]; // 0은 가로, 1은 세로 , 2는 대각

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

            }

        }
        dp[1][2][0] = 1; // 최초 세팅인데, 1,1로 지정해줘야 하는 걸로 헷갈림
        dp[1][1][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 3; j <= n; j++) {

                if (j - 1 > 0 && arr[i][j] == 0) { // 전 수가 가로일 때 올 전부의 수와 대각 전부의 수
                    dp[i][j][0] = dp[i][j - 1][0] + dp[i][j - 1][2]; // 선이라 헷갈림 현재 가로가 된 경우는 전수가 가로거나 대각

                }
                if (i - 1 > 0 && arr[i][j] == 0) { // 전 수가 세로일 때 전체 경우의 수와 대각 전체 경우의 수
                    dp[i][j][1] = dp[i - 1][j][1] + dp[i - 1][j][2];
                }
                if (i - 1 > 0 && j - 1 > 0 && arr[i][j] == 0 && arr[i - 1][j] == 0 && arr[i][j - 1] == 0) {
                    // 전 수가 대각일 땐 현재 벽도 없어야하고 대각으로 움직이려면 벽을 긁으면 안되기에 세로 가로에 벽이 없는지도 확인
                    dp[i][j][2] = dp[i - 1][j - 1][2] + dp[i - 1][j - 1][1] + dp[i - 1][j - 1][0];
                }
            }

            System.out.println(dp[n+1][n+1][0] +dp[n+1][n+1][1] + dp[n+1][n+1][2]);
        }




    }
}
