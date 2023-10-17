package 기초1.Day05.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 네수 {
    //A와 B를 붙인 수와 C와 D를 붙인 수의 합을 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String[] input = br.readLine().split(" ");

        Long num1 = Long.valueOf(input[0]+input[1]); // int ->Long 으로 바꿔서 런타임에러 해결함
        Long num2 = Long.valueOf(input[2]+input[3]);
        sb.append(num1 + num2);
        System.out.println(sb);
    }

}
