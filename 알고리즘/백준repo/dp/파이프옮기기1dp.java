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
    private static int dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n + 1][n + 1];
        dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

            }

        }
        arr[1][1] = arr[1][2] = 2;




    }
}
