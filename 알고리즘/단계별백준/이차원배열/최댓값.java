package 알고리즘.단계별백준.이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최댓값 {

    //모르겠는데 왜 출력 때 1 더해준거랑 저장할 때 1더한거랑 답이 다른 지 모르겠다;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int board[][] = new int[9][9];
        int max = 0;
        int c = 0;
        int r = 0;


        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {

                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] > max) {
                    max = board[i][j];
                    c = i;
                    r = j;
                }

            }
        }

        System.out.print(max);
        System.out.println();
        System.out.print((c +1) + " " + (r +1));


    }
}
