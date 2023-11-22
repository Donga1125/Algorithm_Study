package 기초1.Day09.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2진수8진수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String number = br.readLine();
        // 입력된 2진수 문자열의 길이 구하기
        int length = number.length();
        // 입력된 2진수 문자열을 3자리씩 끊어 8진수로 변환하기
        int remainder = length%3;// 나머지 부분의 길이를 계산

        // 나머지 부분이 1 또는 2자리인 경우 변환
        if(remainder > 0){
            sb.append(Integer.parseInt(number.substring(0,remainder),2));
        }

        while (remainder < length){
            // 2진수를 10진수로 변환함(3자리씩 끊었기때문에 최대 7임)
            sb.append(Integer.parseInt(number.substring(remainder,remainder+3),2));
            remainder +=3;
        }

        System.out.println(sb);
        br.close();
    }
}