package 알고리즘.단계별백준2.백트레킹;

import java.io.*;
import java.util.StringTokenizer;

public class 스타트와링크 {

    // n/2 했을 때 경우의 수 저장하고, ( ㅏ짝수 수 들어옴
    private static int[][] board;
    private static int t;
    private static boolean[] visit;

    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        board = new int[t][t];
        visit = new boolean[t];

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < t; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
            
        }

        backTracking(0, 0);
        System.out.println(min);






    }

    private static void backTracking(int idx, int count) { //count는 깊이 조합의 갯수

        if (count == t / 2) {

            //종료 조건에 만족하면 계산하는 식을 부르는 형식

            sum();
            return;

        }

        for (int i = idx; i < t; i++) {

            if (!visit[i]) {
                visit[i] = true;
                backTracking(i + 1, count + 1);
                visit[i] = false;
            }

        }

    }

    private static void sum() {
        int start = 0;
        int link = 0;


        for (int i = 0; i < t - 1; i++) { //12 ,13, 23 로 나눠서 팀 그 합을 맞추기
            for (int j = i + 1; j < t; j++) {

                if (visit[i] == true && visit[j] == true) {
                    start += board[i][j];
                    start += board[j][i];
                }
                // i 번째 사람과 j 번째 사람이 false라면 링크팀으로 점수 플러스
                else if (visit[i] == false && visit[j] == false) {
                    link += board[i][j];
                    link += board[j][i];
                }
            }
        }


        int val = Math.abs(start - link);

        /*
         * 두 팀의 점수차가 0이라면 가장 낮은 최솟값이기 때문에
         * 더이상의 탐색 필요없이 0을 출력하고 종료하면 된다.
         */
        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        min = Math.min(val, min);

    }}

