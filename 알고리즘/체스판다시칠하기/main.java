package 알고리즘.체스판다시칠하기;

import java.io.*;

public class main {


    public class Main {

        public static void main(String[] args) throws NumberFormatException, IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String NM_str = br.readLine();
            int N = Integer.parseInt(NM_str.split(" ")[0]);
            int M = Integer.parseInt(NM_str.split(" ")[1]);

            String[][] arr = new String[N][M];

            // 배열로 보드를 저장
            for(int i = 0 ; i < N ; i++) {
                String str = br.readLine();

                for(int j = 0 ; j < M ; j++) {
                    if(str.charAt(j) == 'W') {
                        arr[i][j] = "W";
                    }else {
                        arr[i][j] = "B";
                    }
                }
            }

            int min = 64;

            for(int i = 0 ; i < N - 7 ; i++) { // 세로의 경우의 수
                for(int j = 0 ; j < M - 7 ; j++) { // 가로의 경우의 수
                    min = Math.min(min, cal(i, j, arr)); // 최소값을 저장
                }
            }

            bw.write(String.valueOf(min));

            br.close();
            bw.flush();
            bw.close();
        }

        public static int cal(int x, int y, String[][] WB) {

            int count = 0;

            String color = "W"; // 첫번째 칸을 W를 기준으로 색칠

            for(int i = x ; i < x + 8 ; i++) { // 시작컬럼부터 8개까지
                for(int j = y ; j < y + 8 ; j++) { //시작컬럼부터 8개까지

                    // color는 정상적인 체스판이고 WB[i][j]와 비교
                    if(!WB[i][j].equals(color)) {
                        count++;
                    }

                    if(color.equals("W")) { // 컬러 변경
                        color = "B";
                    }else {
                        color = "W";
                    }
                }

                if(color.equals("W")) { // 줄이 바뀌면 바로 윗칸과 색깔이 달라야 함
                    color = "B";
                }else {
                    color = "W";
                }
            }

            count = Math.min(count, 64 - count);

            return count;

        }
    }
}
