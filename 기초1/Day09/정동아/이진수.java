package 기초1.Day09.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이진수 {
    //-2진수 문제
    //10진수 값을 2로 나눈 나머지 값을 역순으로 읽으면 됨.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int input = Integer.parseInt(br.readLine());

        if (input ==0){
            System.out.println(0);
        }else {
            while (input != 1){
                sb.append(Math.abs(input % -2)); //나머지에 절대값 씌워서 양수로 만듦
                input = (int) Math.ceil((double) input/ (-2));
                //ceil 올림 기능을 사용하기 위해 double로 형변환
                //나머지를 양수로 만들기위해 몫을 올림처리해서 다음에 나누는 수로 만듦
            }
            sb.append(input);
            System.out.println(sb.reverse());
        }
    }
}
