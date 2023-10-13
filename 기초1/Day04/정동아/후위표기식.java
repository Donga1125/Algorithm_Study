package 기초1.Day04.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위표기식 {
    //중위 표기식 -> 후위표기식으로 변환
    //우선순위 지정
    static int priority (char c){
        if (c == '('){
            return 0;
        } else if (c == '+' || c == '-') {
            return 1;
        }else {
            return 2;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String input = br.readLine(); //문자 넣어줌
        Stack<Character> operator = new Stack<>(); //연산자 담을 스택


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c>= 'A' && c<= 'z') {//A ~Z 사이 알파벳이면
               sb.append(c); //바로 출력
            }
            else if (c == '(') {//( 여는 괄호이면
                operator.push(c); //스택에 넣어줌
            } else if (c == ')') {//) 닫는 괄호이면
                while (!operator.isEmpty()){ //스택이 비기전까지
                    if(operator.peek() == '('){//여는 괄호를 만나면
                        operator.pop();
                        break; //스택에서 괄호 빼고, 중지
                    }
                    sb.append(operator.pop()); //여는 괄호 나오기 전까지 스택에 들어간거 출력
                }
            }
            else {//스택에 연산자 넣으려고할 때 들어가려는거보다 우선순위 높은게 이미 있다면 스택에서 빼주고, 현재꺼를 스택에 넣어줌
                while (!operator.isEmpty() && priority(operator.peek())>= priority(c)){
                    sb.append(operator.pop()); //스택에서 빼줌
                }
                operator.push(c);

            }
        }
        //남은 스택 처리
        while (!operator.isEmpty()){
            sb.append(operator.pop());
        }
        System.out.println(sb);
    }
}
