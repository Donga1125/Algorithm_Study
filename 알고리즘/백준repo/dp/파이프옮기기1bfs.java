package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 파이프옮기기1bfs {
    //17070
    // 벽이 존재할 수 있다 1로 주어짐 그럴 거긴 예외로 처리
    // 파이프는 45도만 가능하고 초기ㅇ ㅔ놓인 조건에 따라 즉 - 이면 \,  \ 이면 ㅣ,- ㅣ이면 \
    // 첫 파이프는 1,1 1,2를 가로의 모양으로 차지하고 있
    // 일단 먼저 1인지 아닌지 확인 후 3가지 갈래로 나눠야할듯 ? 전의 좌표의 모양에 따라 좌지우지

    // bfs, dp 두가지 방법
    private static int arr[][];
    private static int count = 0;
    private static int n;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n + 1][n + 1];


        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

            }

        }
        dfs(1, 2, 0);
        System.out.println(count);




    }
    // state  0 가로, 1 세로, 2 대각
    private static void dfs(int row, int col, int state) {

        if (row > n || col > n || arr[row][col] == 1) {
            return;
        }

        if (state == 2) { // 현재가 대각일 땐  도착 지점의 가로 옆나 세로 위가 벽이 있음 빈 공간  도릴ㄹ 때 벽긁기때문에 예외추가
            if (arr[row - 1][col] == 1 || arr[row][col - 1] == 1) {
                return;
            }
        }
        if (row == n && col == n) { // 기저 조건 도착의 경우임
            count++;
            return;
        }

        if (state == 0) {
            dfs(row, col + 1, 0);
            dfs(row + 1, col + 1, 2);
        }
        else if (state == 1) {
            dfs(row + 1, col, 1);
            dfs(row + 1, col + 1, 2);
        }
        else if (state == 2) {
            dfs(row, col + 1, 0);
            dfs(row + 1, col + 1, 2);
            dfs(row + 1, col, 1);
        }
    }
}
