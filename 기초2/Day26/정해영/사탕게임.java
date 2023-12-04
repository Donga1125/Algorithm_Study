package 기초2.Day26.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사탕게임 {

    static char[][] board;
    static int n;
    static int max = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        board = new char[n][n];

        for(int i=0; i<n; i++){
            String s = br.readLine();

            for(int j=0; j<n; j++){
                board[i][j] = s.charAt(j);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                swap(i,j,i,j+1);
                search();
                swap(i,j+1,i,j);
            }
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n; j++){
                swap(i,j,i+1,j);
                search();
                swap(i+1,j,i,j);
            }
        }

        System.out.println(max);
        br.close();
    }

    public static void swap(int x1, int y1, int x2, int y2){
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    public static void search(){
        //행에서 탐색
        for(int i=0; i<n; i++){
            int count = 1;

            for (int j=0; j<n-1; j++){
                if(board[i][j] == board[i][j+1]){
                    count++;
                    max = Math.max(count,max);
                }else {
                    count = 1;
                }
            }
        }

        for (int i = 0 ; i < n; i ++) {
            int count = 1;
            for (int j = 0; j < n - 1; j++) {
                if (board[j][i] == board[j + 1][i]) {
                    count++;
                    max = Math.max(count, max);
                }else {
                    count = 1;
                }
            }
        }
    }
}
