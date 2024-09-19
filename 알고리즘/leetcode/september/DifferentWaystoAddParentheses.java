package 알고리즘.leetcode.september;

import java.util.ArrayList;
import java.util.List;

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

    }
}
