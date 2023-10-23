package 기초1.Day10.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해 {
    //정수 N이 주어졌을 때, N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력
    //N이 1인 경우 아무것도 출력하지 않는다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int t = Integer.parseInt(br.readLine());

        for (int i = 2; i <= Math.sqrt(t); i++) {
            while (t % i == 0) {//2부터 나누면서 출력
                sb.append(i).append('\n');
                t /= i;
            }
        }
        if (t != 1) {
            sb.append(t);
        }
        System.out.println(sb);

    }

}
