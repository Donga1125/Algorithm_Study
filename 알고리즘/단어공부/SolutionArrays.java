package 알고리즘.단어공부;

import java.io.*;
import java.util.ArrayList;
//문제
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//입력
//첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//출력
//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

public class SolutionArrays {


    //    public char Solution(String str) throws IOException {
    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();



        int[] count = new int[26]; // 알파벳은 26개이다.

        int maxValue = 0;
        char maxCh = '?';
//        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'A'; // 이 개념은 i가 A라면 0, B라면 1 즉 i번째의 인덱스를 가지고 있게 된다.
            ++count[idx]; // i번째 idx 값을 늘려준다. A를 예로 들면, A는 1이 추가되는 거

            if (maxValue < count[idx]) {
                maxValue = count[idx];
                maxCh = str.charAt(i);
            } else if (maxValue == count[idx])
                maxCh = '?';
        }

        bw.write(maxCh);

        br.close();
        bw.flush();
        bw.close();


    }}


//    public static void main (String[]args) throws IOException {
//        SolutionArrays sol = new SolutionArrays();
//        String str = "MiSsiSsipi";
//        System.out.println(sol.Solution(str));
//
//    }

