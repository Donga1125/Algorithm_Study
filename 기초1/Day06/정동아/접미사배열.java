package 기초1.Day06.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 접미사배열 {
    //주어진 문자열의 모든 접미사를 사전순으로 정렬한다음 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String input = br.readLine(); //문자 넣어줌
        String [] arr = new String[input.length()];

        for (int i =0; i<input.length(); i++){ //하나씩 잘라서 넣기
            arr[i] = input.substring(i,input.length());
        }
        Arrays.sort(arr); //알파벳순으로 정렬
        for (String s : arr){
            System.out.println(s);
        }

    }
}
