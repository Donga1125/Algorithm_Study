package 알고리즘.프로그래머스.항해99.오주차;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class reorderedPowerof2 {

    //integer 타입의 숫자가 하나 주어지면 String으로 생각해서
    // 단어들을 재배열 하는데 ex) 12 = '1' '2' 12, 21이 2의 거듭제곱인지 판별해서 반환
    // 10^9까지 들어옴 10억
    // 기본적으로 312이 주어지면 ? 123, 132, 213, 231, 312, 321 다봐야한다
    // 그러면 들어오는 숫자는 10억이지만 숫자는 10개 0이 먼저할 수 없는 위치에 따라
    //987,654,321이라면 9! = 최대 362,880개를 하나씩 다 2의 거듭제곱이 맞는 지 확인
    // 그렇다면 그냥 2의 거듭제곱 테이블 만들고 있는 지 비교 o(n^2)

    // 먼저 들어온 숫자를 String으로 바꾸고, 순열을 재귀로 만들기
    // 만들어진 수열
    private static String now;
    private static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) {
        int n = 312;


        reorderedPowerof2 main = new reorderedPowerof2();
        main.reorderedPowerOf2(n);
    }

    public boolean reorderedPowerOf2(int n) {


        now = String.valueOf(n);



        dfs("", new boolean[now.length()]);




        return true;

    }

    private void dfs(String s, boolean[] isVisited) {

        int length = now.length();

        if (s.length() == length) {

            set.add(s);

            return;

        }

        for (int i = 0; i < length; i++) { // 3번씩 계속 반복

            if (!isVisited[i]) {

                isVisited[i] = true;
                dfs(s + now.charAt(i), isVisited);
                isVisited[i] = false;

        }}


    }
        }


