package 기초1.Day04.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위표기식 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        Stack<Character> stack = new Stack<>(); //스택을 선언(연산자를 담는다)  - 뒤에서 부터

        for(int i=0; i < str.length(); i++){
            char now = str.charAt(i);

            switch (now){
                case '+':
                case '-':
                case '*':
                case '/':
                    //(반복) 스택의 최상위 우선순위가 현재의 우선순위보다 크거나 같을때,
                    //스택에서 값을 출력큐로 옮겨준다. 그리고 현재 연산자를 스택에 넣는다.
                    while (!stack.isEmpty() && priority(stack.peek()) >= priority(now)){
                        sb.append(stack.pop());
                    }
                    stack.add(now);
                    break;
                case '(':
                    //여는 괄호를 만나면, 스택에 넣어준다.
                    stack.add(now);
                    break;
                case ')':
                    //닫는 괄호가 나오면 여는 괄호가 나올때까지 출력큐에 넣어주고, 여는 큐를 삭제한다.
                    while (!stack.isEmpty() && stack.peek() != '('){
                        sb.append(stack.pop());
                    }
                    stack.pop(); //여는큐 삭제
                    break;
                default:
                    sb.append(now); //문자가 나오면 바로 출력큐로 넣어준다.
            }
        }

        while (!stack.isEmpty()) { //상단의 for문이 돌고 스택에 남아있는 연산자를 출력큐로 옮겨준다.
            sb.append(stack.pop());
        }

        System.out.println(sb);
        br.close();

    }
    public static int priority(char op){ //우선순위를 정해준다.
        if(op == '(' || op == ')'){
            return 0;
        }else if (op == '+' || op == '-'){
            return 1;
        }else if (op == '*' || op == '/'){
            return 2;
        }
        return -1;
    }
}
