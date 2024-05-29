package 알고리즘.프로그래머스.항해99.이주차;

import java.util.HashMap;
import java.util.HashSet;

public class 소수찾기 {

    // String으로 문자열 받고 그 String으로 만들 수 이쓴ㄴ 숫자를 구한다음 에라스토테네스의 체로 거르면
    // 그럼 String으로 숫자들의 조합을 만들어야 하는데 중복 숫자는 못 담으니까 set으로 구성하자

    // 1. 만들 수 있는 수를 다 만들고 나서 그 이후 체로 거르기

    // numbers는 길이 1 이상 7 이하인 문자열입니다.

    // (다 들어와도 7자리 라는 뜻이네)
    //numbers는 0~9까지 숫자만으로 이루어져 있습니다.
    //"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.

    static private boolean isVisited[] = new boolean[7]; //
    static private HashSet<Integer> set = new HashSet<>();

    private static int dp[];



    private int solution(String numbers) {

        int answer = 0;

        dfs(numbers, "", 0);
        for (Integer i : set) {
            System.out.println(i);
        }

        return answer;
    }

    private int erasto() {
//        dp[]


        return 1;
    }

    private void dfs(String num, String str, int depth) {

        if (num.length() < depth) { // num을 다 탐색했다면 return;

            return;
        }

        for (int i = 0; i < num.length(); i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                set.add(Integer.parseInt(str + num.charAt(i)));
                dfs(num, str, depth + 1);
                isVisited[i] = false;

            }

        }

    }


    public static void main(String[] args) {

        소수찾기 main = new 소수찾기();
        main.solution("17");

    }
}
