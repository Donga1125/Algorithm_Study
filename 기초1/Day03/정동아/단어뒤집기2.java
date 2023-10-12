package 기초1.Day03.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 단어뒤집기2 {
    //문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집어서 출력한다.
    //알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
    //문자열의 시작과 끝은 공백이 아니다.
    //'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String input = br.readLine();

        //< 와 >를 판별하기 위해 사용
        boolean flag = false;

        for (int i=0; i<input.length(); i++){
            //<를 만났을 때 스택이 비어있지 않다면 모두 꺼냄. 두번째 <> 전에 작성된 글자 출력하기 위함.
            if (input.charAt(i) == '<'){
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                flag = true;
            }//>를 만났으면 false로 바꾸고 >기호 저장
            else if (input.charAt(i) == '>') {
                flag = false;
                sb.append(input.charAt(i));
                continue;
            }

            //true (<를 만난경우) 일경우 다시 false (>를 만나는경우) 가 되기 전까지 그대로 입력
            if (flag == true){
                sb.append(input.charAt(i));
            }
            //false일 경우 괄호 이외의 문자 stack에 넣어줌
            else if (flag == false) {
                //i번째 문자가 공백이면 모든 원소 빼고 공백 추가
                if (input.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                }
                else {
                    stack.push(input.charAt(i));
                }
            }


            //반복문 마지막 횟수일 때, 스택이 비어있지 않으면 원소 추가
            //<int><max>2147483647<long long><max>9223372036854775807 같은 경우 처리를 위함
            if (i == input.length()-1){
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }


        System.out.println(sb);
    }
}
