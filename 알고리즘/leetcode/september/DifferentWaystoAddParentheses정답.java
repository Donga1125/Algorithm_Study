package 알고리즘.leetcode.september;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DifferentWaystoAddParentheses정답 {

    //241. Different Ways to Add Parentheses

    //식이 주어지면 일반적인 계산식이 아닌 순서에 따라 나올 수 있는 식의 답을
    // 다 리턴하면 될듯
    // 1. 플,마,곱만 들어오니까 들어온 순서에 따른 식을 일단 적자
    public static void main(String[] args) {

        String expression = "2-1-1";
        DifferentWaystoAddParentheses정답 sol = new DifferentWaystoAddParentheses정답();
        System.out.println(sol.diffWaysToCompute(expression));
        System.out.printf("값은 :%f", 3.26);




    }

    public List<Integer> diffWaysToCompute(String expression) {

        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < expression.length(); i++) {
            char now = expression.charAt(i);

            if (now == '-' || now == '*' || now == '+') {

                List<Integer> leftPart = diffWaysToCompute(expression.substring(0, i));
                List<Integer> rightPart = diffWaysToCompute(expression.substring(i + 1));

                // Combine results from left and right parts using the operator
                for (int left : leftPart) {
                    for (int right : rightPart) {
                        int res = 0;
                        switch (now) {
                            case '+':
                                res = left + right;
                                break;
                            case '-':
                                res = left - right;
                                break;
                            case '*':
                                res = left * right;
                                break;
                        }
                        result.add(res);
                    }
                }
            }

        }
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }




        return result;





    }
}
