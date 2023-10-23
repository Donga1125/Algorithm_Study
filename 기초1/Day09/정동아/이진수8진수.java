package 기초1.Day09.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이진수8진수 {
    //2진수 -> 8진수로 변환
    //소수점을 기준으로 숫자를 3자리씩 묶는다.
    //묶은 값에 2의 0승, 2의 1승, 2의 2승 값을 하나씩 메겨준다.
    //2진수값과 2의 N승 값을 곱한 후 전체를 더하면 8진수가 된다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String binary = br.readLine();
        int length = binary.length();

        //2진수 길이를 3의 배수로 만들기위해 앞에 0 추가
        while (length % 3 !=0){
            binary = "0" + binary;
            length++;
        }

        //3자리씩 잘라서 8진수로 변환
        for (int i =0; i<length; i+=3){
            int num = 4*(binary.charAt(i) -'0') + 2*(binary.charAt(i+1)-'0') + (binary.charAt(i+2)-'0');
            sb.append(num);
        }

        System.out.println(sb);

    }
}
