package 기초1.Day05.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열분석 {
    //소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String input = br.readLine(); //문자 넣어줌

        while (input != null){ //작성이 종료되면 while루프를 종료하기 위해서
            int small = 0;  //소문자 개수
            int capital = 0;   //대문자 개수
            int number = 0;  //숫자 개수
            int space = 0;  //공백 개수
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == ' ') space++;
                if (Character.isUpperCase(c)) capital++;
                if (Character.isLowerCase(c)) small++;
                if (Character.isDigit(c)) number++;
            }
            sb.append(small + " " + capital + " " + number + " " + space + "\n");
        }
        System.out.print(sb);

        }

    }

