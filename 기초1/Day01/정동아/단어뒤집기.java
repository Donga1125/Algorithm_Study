package 기초1.Day01.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어뒤집기 {
    //문장이 주어졌을 때 단어를 모두 뒤집어서 출력
    //첫째줄에 문장 개수 주어짐.

    public static void main(String[] args) throws IOException {
        //방법1for문으로 배열에 넣고 다음이 빈칸이면 지금 배열 다른 곳에 넣어줘서 출력 (스택)
        //방법2띄어쓰기 기준으로 단어 잘라서 해당 단어 reverse 기능 이용함 -> 이방식으로 품

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int t = Integer.parseInt(br.readLine());  //throws IOException 추가해줘야함

        for (int i = 0; i<t; i++){
            String[] words = br.readLine().split(" ");

            for (String word : words){
                StringBuilder stringBuilder = new StringBuilder(word);
                System.out.print(stringBuilder.reverse().toString()+" ");
            }
        }
        br.close();
    }

}
