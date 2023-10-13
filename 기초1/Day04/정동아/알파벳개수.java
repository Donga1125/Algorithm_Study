package 기초1.Day04.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳개수 {
    //각 알파벳이 단어에 몇개 포함되어있는지 출력

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String input = br.readLine(); //문자 넣어줌
        int [] result = new int[26]; //소문자만 들어가니까 26개 배열 생성

        for (int i =0; i< input.length(); i++){
            int index = input.charAt(i) - (int)'a'; //int형으로 형변환한 a를 뺀 값으로 알파벳 인덱스 위치로 지정
            result[index]++; //result[index] = result[index] +1
        }

        for (int i =0; i< result.length; i++){ //각 알파벳이 카운트된 수 출력하기 위해
            sb.append(result[i]).append(" "); //출력 + 주어진 형식 맞춰 출력
        }
        br.close();
        System.out.println(sb);
    }
}
