package 기초2.Day26.임한준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사탕_게임 {

    /**

     문제 3085
     상근이는 어렸을 적에 "봄보니 (Bomboni)" 게임을 즐겨했다.

     가장 처음에 N×N크기에 사탕을 채워 놓는다. 사탕의 색은 모두 같지 않을 수도 있다.
     상근이는 사탕의 색이 다른 인접한 두 칸을 고른다. 그 다음 고른 칸에 들어있는 사탕을 서로 교환한다. 이제, 모두 같은 색으로 이루어져 있는 가장 긴 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다.

     사탕이 채워진 상태가 주어졌을 때, 상근이가 먹을 수 있는 사탕의 최대 개수를 구하는 프로그램을 작성하시오.

     입력
     첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50)

     다음 N개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다. 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다.

     사탕의 색이 다른 인접한 두 칸이 존재하는 입력만 주어진다.

     출력
     첫째 줄에 상근이가 먹을 수 있는 사탕의 최대 개수를 출력한다.
     */

    //  일직선(행이든 열이든) 상 가장 길게 같은 색으로 맞춘 후 먹기
    // nn 배열에서 위나 아래 양 옆으로 이어진 수랑 비교해서 있다면 바꾸고 저장

    static int N,result;
    static char[][] board;
    static int[][] deltas = {{1,0},{0,1}};//아래쪽-오른쪽

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(in.readLine());
        board = new char[N][N];

        for(int i=0;i<N;i++) {
            board[i] = in.readLine().toCharArray();
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                result = Math.max(result,swapCandy(i,j));
            }
        }

        System.out.println(result);
    }

    private static int swapCandy(int r, int c) {
        int max = 0;

        for(int d=0;d<2;d++){
            int nr = r+deltas[d][0];
            int nc = c+deltas[d][1];
            if(nr>=0 && nr<N && nc>=0 && nc<N && board[r][c]!=board[nr][nc]){
                char tmp = board[r][c];
                board[r][c] = board[nr][nc];
                board[nr][nc] = tmp;

                max = Math.max(max,countCandy());

                board[nr][nc] = board[r][c];
                board[r][c] = tmp;
            }
        }
        return max;
    }

    private static int countCandy(){
        int tmpMax = 1;
        for(int i=0;i<N;i++){
            char nowH = board[i][0];
            char nowV = board[0][i];
            int cntH = 1;
            int cntV = 1;

            for(int j=1;j<N;j++){
                if(nowH!=board[i][j]){
                    tmpMax = Math.max(tmpMax,cntH);
                    nowH = board[i][j];
                    cntH = 1;
                }
                else ++cntH;

                if(nowV != board[j][i]){
                    tmpMax = Math.max(tmpMax,cntV);
                    nowV = board[j][i];
                    cntV = 1;
                }
                else ++cntV;

            }
            tmpMax = Math.max(tmpMax,cntH>cntV?cntH:cntV);
        }

        return tmpMax;
    }

}

