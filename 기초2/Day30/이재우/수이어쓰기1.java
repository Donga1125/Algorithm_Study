package 기초2.Day30.이재우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수이어쓰기1 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        int digit = 1;
        int range = 10;

        for(int i = 1 ; i <= N ; i++) {
            if (i % range == 0) {
                digit++;
                range *= 10;
            }
            answer += digit;
        }

        System.out.println(answer);
    }
}
