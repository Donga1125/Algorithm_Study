package 기초1.Day18.이재우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 합분해 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[][] arr = new int[k + 1][n + 1];

        for(int i = 0 ; i < n + 1 ; i++) {
            arr[1][i] = 1; //K = 1 일 때 경우의 수는 N과 무관하게 무조건 1
        }

        for(int i = 0 ; i < k + 1 ; i++) {
            arr[i][0] = 1; //N = 0 일 때 경우의 수는 K와 무관하게 무조건 1
        }

        for(int i = 1 ; i < k + 1 ; i++) {
            for(int j = 1 ; j < n + 1 ; j++) {
                //점화식
                arr[i][j] = (arr[i][j - 1] + arr[i - 1][j]) % 1000000000;
            }
        }

        System.out.println(arr[k][n]);
    }
}