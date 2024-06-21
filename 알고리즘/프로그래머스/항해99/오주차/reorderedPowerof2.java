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
    // 2^30승이 10억쯤 되니 int형 최대치인 31승까지만 그냥 담자

    // 먼저 들어온 숫자를 String으로 바꾸고, 순열을 재귀로 만들기
    // 만들어진 수열
    private static String now;
    private static HashSet<String> set;

    public static void main(String[] args) {
        int n = 10;


        reorderedPowerof2 main = new reorderedPowerof2();
        System.out.println(main.reorderedPowerOf2(n));
    }

    public boolean reorderedPowerOf2(int n) {

        set = new HashSet<>();
        now = String.valueOf(n);


        dfs("", new boolean[now.length()]);

        int[] powerOf2 = new int[31];
        int now = 2;
        powerOf2[0] = 1;
        powerOf2[1] = 2;


        for (int i = 2; i < 31; i++) {

            now = now * 2;

            powerOf2[i] = now;

            System.out.println("powerOf2[ "+ i + " ] = " + powerOf2[i]);


            }



        for (String s : set) {

            if (s.charAt(0) != '0') {

            int check = Integer.valueOf(s);

            for (int i : powerOf2) {

                if (check == i) {

                    return true;
                }
            }
            }
        }

        return false;

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
            }
        }
    }

}


