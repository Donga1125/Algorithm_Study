package 기초1.Day09.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팔진수2진수 {
    //8진수->2진수 변환
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String input = br.readLine();
        //각 8진수 숫자를 3자리인 2진수로 변환
        for (int i = 0; i<input.length(); i++){
            char c = input.charAt(i);
            String binary = octalToBinary(c);
            //첫번째 자리에 0이면 제거(문자열앞에 나타나는 모든 0을 제거)
            if (i == 0){
                sb.append(binary.replaceFirst("^0+(?!$)", ""));
            }else {
                sb.append(binary);
            }

        }

        System.out.println(sb);
    }

    public static String octalToBinary (char octal){
        switch (octal){
            case '0':
                return "000";
            case '1':
                return "001";
            case '2':
                return "010";
            case '3':
                return "011";
            case '4':
                return "100";
            case '5':
                return "101";
            case '6':
                return "110";
            case '7':
                return "111";
            default:
                return ""; //유효하지않은 경우 빈 문자열
        }
    }
}
