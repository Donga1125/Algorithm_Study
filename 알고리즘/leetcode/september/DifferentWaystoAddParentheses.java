package 알고리즘.leetcode.september;

import javax.security.auth.callback.CallbackHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifferentWaystoAddParentheses {

    //241. Different Ways to Add Parentheses

    //식이 주어지면 일반적인 계산식이 아닌 순서에 따라 나올 수 있는 식의 답을
    // 다 리턴하면 될듯
    // 1. 플,마,곱만 들어오니까 들어온 순서에 따른 식을 일단 적자
    public static void main(String[] args) {

        String expression = "2-1-1";
        DifferentWaystoAddParentheses sol = new DifferentWaystoAddParentheses();
        System.out.println(sol.diffWaysToCompute(expression));


    }

    public List<Integer> diffWaysToCompute(String expression) {

        List<Integer> answerList = new ArrayList<>();
        int length = expression.length();

        int[] numCount = new int[length/2 +1];
        char[] operatorsCount = new char[length / 2];
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        int acount = 0;
        int bcount = 0;

        for (int i = 0; i < length; i++) { // 1,3,5,7
            Character now = expression.charAt(i);
            list.add(now);

            if (i % 2 == 1) {
                map.put(now, map.getOrDefault(now, 0) + 1);
                operatorsCount[acount++] = now;


            } else
                numCount[bcount++] = now - '0';

        }

        for (Character c : list) {
            System.out.println(c);
        }

        return answerList;



    }
}
