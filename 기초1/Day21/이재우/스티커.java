package 기초1.Day21.이재우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 스티커 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0 ; i < testCase ; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            int[][] stickerCost = new int[2][n + 1];
            int[][] maximumScore = new int[2][n + 1];

            String[] input0 = bufferedReader.readLine().split(" ");
            String[] input1 = bufferedReader.readLine().split(" ");

            for(int j = 1 ; j < n + 1 ; j++) {
                stickerCost[0][j] = Integer.parseInt(input0[j - 1]);
                stickerCost[1][j] = Integer.parseInt(input1[j - 1]);
            }

            maximumScore[0][1] = stickerCost[0][1];
            maximumScore[1][1] = stickerCost[1][1];

            //점화식, 대각선 뒤로 한칸 or 두칸 떨어진 스티커를 고를 때
            for(int k = 2 ; k < n + 1 ; k++) {
                maximumScore[0][k] = Math.max(maximumScore[1][k - 1], maximumScore[1][k - 2]) + stickerCost[0][k];
                maximumScore[1][k] = Math.max(maximumScore[0][k - 1], maximumScore[0][k - 2]) + stickerCost[1][k];
            }

            System.out.println(Math.max(maximumScore[0][n], maximumScore[1][n]));
        }
    }
}
