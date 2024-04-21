package 알고리즘.백준repo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점프 {
    //바텀업과 topdown의 방식이 혼합해서 자꾸 나오다보니 이도 저도 아닌 상태가 된다..
    // 너무 헷갈려서 개념을 잡고 싶은데도 그것도 힘드네..

    static int board[][];
    static int dp[][];
    static int count = 0;

    //1890
    //현재 수와 같은 행열의 수 중 0이 되는 수를 계속 탐색해서 저장하면 되지 않을까 ?

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        board = new int[t][t];
        dp = new int[101][101];

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < t; j++) {

                board[i][j] = Integer.parseInt(st.nextToken());

                
            }

            dp[0][0] = board[0][0];
            movement(0, 0);

            System.out.println(count);

            for (int j = 1; j < t; j++) {

                for (int k = 1; k <t ; k++) {
                    int a = board[j][k];
                    //현재 수를 저장하고 그만큼 움직이려면, 다음 점화식은


                    if (dp[j][k] == board[j][k]) {

                    }

                }

            }

            
        }



    }

    private static int movement(int n, int m) {

        if (board[n][m] == 0) {

            return count++;

        }
        int a = dp[n][m];
        int b =board[a][a];
        return movement(b, b);

    }
}
