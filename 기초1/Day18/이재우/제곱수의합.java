package 기초1.Day18.이재우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 제곱수의합 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        // 배열의 인덱스를 제곱수들의 합으로 표현할 떄 그 항의 최소개수를 해당 인덱스의 요소로 갖는 배열
        int[] numberOfSquares = new int[n + 1];

        for(int i = 1 ; i < n + 1 ; i++) {
            numberOfSquares[i] = i;

            for(int j = 1 ; i >= j * j ; j++) {
                if(numberOfSquares[i] >= numberOfSquares[j * j] + numberOfSquares[i - j * j]) {
                    //점화식
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