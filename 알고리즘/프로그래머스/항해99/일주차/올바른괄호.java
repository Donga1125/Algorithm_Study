package 알고리즘.프로그래머스.항해99.일주차;

import java.util.LinkedList;
import java.util.Queue;

public class 올바른괄호 {
    // 올바른 괄호를 만드는 건데 (로 시작했음 )로 닫혀야 한다
    // true or false로 반환 100,000

    // 시작은 무조건 (, 끝은 ), 짝수
    // 큐로 (면 넣고 )로 빼서 queue가 비었는 지 반환하면 될 거 같다

    public static void main(String[] args) {

        올바른괄호 main = new 올바른괄호();

        boolean answer = main.solution("))))()");

        System.out.println(answer);


    }

    private boolean solution(String s) {
        Queue<Character> queue = new LinkedList<>();


        System.out.println(s.length());



        if (s.length() % 2 != 0 || s.charAt(0) != '(' || s.charAt(s.length() - 1) != ')') {
            return false; // 기본 조건 짝수가 아니거나 (로 시작하지 않거나, )로 끝나지 않거나 바로 false
            // || s.charAt(s.length() - 1) != ')'
            // || s.charAt(0) != '('
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') { // (,) 둘 중 하나만 들어옴
                queue.offer(s.charAt(i));  //add, 와 offer , remove 과 poll는 실패시 false냐 오류냐 (add,remove을 쓰자 안정성)

            } else // 시작부터 닫는 괄호면 ? poll 했을 때 뺼 수 있는 게 없기에 에러가 날껀데

                queue.poll(); // 시작을 미리 걸렀기에 )부터 실행될 일은 없다.

        }


        return queue.isEmpty();

    }


}
