package 기초1.Day03.정해영;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
1. < > 태그를 기준으로 나눈다.
2. ' ' 공백을 기준으로 나눈다.
 */

public class 단어뒤집기2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        StringBuilder sb = new StringBuilder();

        boolean tag = false; //꺽쇠가 얼렸는지 닫혔는지 판별

        Stack<Character> stack = new Stack<>(); //후입선출

        for (int i = 0; i < S.length(); i++) {
            //꺽쇠를 만나면 stack이 비어있지 않으면 모든 원소를 꺼내고 tag를 true로
            if (S.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                tag = true;
            } else if (S.charAt(i) == '>') {
                tag = false;
                sb.append(S.charAt(i));
                continue;
            }

            //tag가 true인 경우
            if (tag) {
                sb.append(S.charAt(i));

                //tag가 false인 경우
            } else if (!tag) {
                if (S.charAt(i) == ' ') { //공백을 만나면 모든 원소를 pop한 후에 공백을 추가한다.
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    stack.push(S.charAt(i));
                }
            }
            if (i == S.length() - 1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }
        System.out.println(sb);
    }
}
