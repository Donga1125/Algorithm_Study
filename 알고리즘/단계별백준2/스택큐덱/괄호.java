package 알고리즘.단계별백준2.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.Stack;

public class 괄호 {

    //제대로 닫힌 괄호를 확인해서 yes or no 반환인데 이거 예전에 듣기로 스택으로 넣어서 반환이 제대로 되는 지 확인하랬다.
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack;




        for (int i = 0; i < t; i++) {

            stack = new Stack<>();

            String ps = br.readLine();

            for (int j = 0; j < ps.length(); j++) {
                if (ps.charAt(j) == '(') {
                    stack.push(ps.charAt(j));
                } else if (ps.charAt(j) == ')' && stack.size() != 0) {

                    stack.pop();
                } else if (ps.charAt(j) == ')' && stack.size() == 0) {

//                    sb.append("NO").append('\n');
                    stack.push(ps.charAt(j));
                    break;
                }

            }

            if (stack.size() == 0) {

                sb.append("YES").append('\n');

            }
            else
                sb.append("NO").append('\n');

        }

        System.out.println(sb);
            
    }
}
