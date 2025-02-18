package 알고리즘.leetcode.february25;

import java.util.Stack;

public class ConstructSmallestNumberFromDIString {

    //2375. Construct Smallest Number From DI String
    // 1~9까지의 숫자를 쓸 수 있고 pattern이 주어진다.
    // i는 증가 d는 감소, 각 숫자는 한번씩 쓸 수 있고 만족시키는 가장작은 수를 반환


    public static void main(String[] args) {
        String pattern = "IDID";

        ConstructSmallestNumberFromDIString main = new ConstructSmallestNumberFromDIString();
        main.smallestNumber(pattern);

    }


    // 현재 수를 결정하는 것은 뒤에서 뭐가 있냐에 따라 결정될 듯
    // i는 작은 수로 바로 뽑이내고 d는 보류
    // dp 인줄 알았으나, 가장작은 수를 반환해야한다.
    // 그러므로 그리디처럼 현재 작은 수를 바로 바로 채워 넣으면 됨!


    public String smallestNumber(String pattern) {

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1;

        for (int i = 0; i <=pattern.length() ; i++) {

            stack.push(num++);

            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                // 마지막에 추가해주려다 문제
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());

                }

            }

        }


        return sb.toString();
    }

    }




