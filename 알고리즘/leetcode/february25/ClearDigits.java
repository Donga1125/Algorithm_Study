package 알고리즘.leetcode.february25;

import java.util.Stack;

public class ClearDigits {

    //3174. Clear Digits

    // 첫번째로 등장하는 숫자를 지우고, 그 숫자에서 가장 가까운 왼쪽에 있는 숫자가 아닌 것을 지움
    // 반복 후 남은 것을 리턴

    public static void main(String[] args) {

        String s = "cb34";
        ClearDigits main = new ClearDigits();

        System.out.println( main.clearDigits(s));
    }

    public String clearDigits(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) { // 숫자는 무조건 지워지니 스택엔 문자만 담기


                if (!stack.isEmpty()) {
                    stack.pop();
                }

        } else {
                stack.push(c);
            }
        }
        String answer = "";
        for (Character c : stack) {
            answer = answer + c;

        }
        return answer;
        }

}








