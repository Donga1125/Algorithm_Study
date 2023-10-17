package 기초1.Day05.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열분석 {
    //소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {// 입력이 종료되면 루프를 종료하기위해 사용
            String input = br.readLine();
            if (input == null || input.isEmpty()) {
                break;
            }

            int small = 0;
            int capital = 0;
            int number = 0;
            int space = 0;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == ' ') space++;
                if (Character.isUpperCase(c)) capital++;
                if (Character.isLowerCase(c)) small++;
                if (Character.isDigit(c)) number++;
            }

            sb.append(small).append(" ").append(capital).append(" ").append(number).append(" ").append(space).append("\n");
        }
        System.out.print(sb);
    }
}



