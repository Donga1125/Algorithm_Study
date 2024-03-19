package 알고리즘.단계별백준2.백트레킹;

import java.io.*;
import java.util.StringTokenizer;

public class 스타트와링크 {

    // n/2 했을 때 경우의 수 저장하고, ( ㅏ짝수 수 들어옴
    private static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        board = new int[t][t];

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < t; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
            
        }






    }
}
