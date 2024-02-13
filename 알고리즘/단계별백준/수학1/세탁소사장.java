package 알고리즘.단계별백준.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세탁소사장 {
    // 그리디로 처음 큰 동전으로 다 반환 후 다음 꺼 대로
    // 0.25 , 0.10 0.05 0.01  먼저 0.25로 나누고

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());

            int q = m / 25;
            m = m % 25;

            int d = m / 10;
            m %= 10;

            int nickel = m / 5;
            m %= 5;

            int penny = m;

            System.out.println(q + " " + d + " " + nickel + " " + penny);
        }
    }
}
