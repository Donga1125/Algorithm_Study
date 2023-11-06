package 기초1.Day18.이재우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 제곱수의합 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] numberOfSquares = new int[n + 1];

        for(int i = 1 ; i < n + 1 ; i++) {
            numberOfSquares[i] = i;

            for(int j = 1 ; i >= j * j ; j++) {
                if(numberOfSquares[i] >= numberOfSquares[j * j] + numberOfSquares[i - j * j]) {
                    numberOfSquares[i] = numberOfSquares[j * j] + numberOfSquares[i - j * j];
                }

                if(i == j * j) {
                    numberOfSquares[i] = 1;
                }
            }
        }

        System.out.println(numberOfSquares[n]);
    }
}