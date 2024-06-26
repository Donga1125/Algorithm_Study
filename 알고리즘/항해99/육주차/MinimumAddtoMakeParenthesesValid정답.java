package 알고리즘.항해99.육주차;

import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid정답 {

    // 921. Minimum Add to Make Parentheses Valid

    //가능한 괄호는 아예 비었거나 짝이 맞으면 됨

    // "())"  스택에 넣는데, 닫는 게 나오면 pop해주고, 남은 것들의 갯수를 세어주면 끝 ?

    // )로 시작할 수도 있다. (로만 시작한단 말이 없음
    // )면 지운다는 개념으로 다가가면 안될듯 그러면 각각 카운트 세주고 차이 만큼 반환?

    //"()))((" 면 값은 맞는데 여는 게 2개 닫는게 2개 필요하기 떄문에 안되네

    public static void main(String[] args) {
        String s = "())";

        MinimumAddtoMakeParenthesesValid정답 main = new MinimumAddtoMakeParenthesesValid정답();
        System.out.println(main.minAddToMakeValid(s));

    }


    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();
        int anyCount = 0;



        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if(current == '(') {

                stack.push(current);

            } else {

                if (stack.size() != 00 && stack.peek() == '(') {

                stack.pop();
                } else
                    anyCount++;

            }
        }


        return stack.size() + anyCount;

    }


}
