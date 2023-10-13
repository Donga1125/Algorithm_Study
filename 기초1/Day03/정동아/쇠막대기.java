package 기초1.Day03.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        String input = br.readLine();
        Stack<Character> stack  = new Stack<>();
        int result = 0;

        for (int i = 0; i< input.length(); i++){
            //( 면 스택에 추가
            if (input.charAt(i) == '('){
                stack.push(input.charAt(i));
                continue;
            }
            //)면 스택에서 제거
            else if (input.charAt(i) == ')') {
                stack.pop();
                //그전 괄호가 (이면 레이저
                if(input.charAt(i -1) == '('){
                    result += stack.size(); //현재 스택의 사이즈만큼 더해줌
                }else {
                    // 그전 괄호가 )이면 레이저가 아니니까 단순히 1을 더해줌
                    result++;
                }
            }
        }

        System.out.println(result);
    }

}
