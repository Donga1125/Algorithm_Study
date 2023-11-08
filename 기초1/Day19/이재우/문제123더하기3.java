package 기초1.Day19.이재우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제123더하기3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(bufferedReader.readLine());

        long[] arr = new long[1000001];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int i = 4 ; i < 1000001 ; i++) {
            //점화식 arr[n] = arr[n - 3] + arr[n - 2] + arr[n - 1]
            arr[i] = (arr[i - 3] + arr[i - 2] + arr[i - 1]) % 1000000009;
        }

        for(int i = 0 ; i < testCase ; i++) {
            int input = Integer.parseInt(bufferedReader.readLine());
            System.out.println(arr[input]);
        }
    }
}
