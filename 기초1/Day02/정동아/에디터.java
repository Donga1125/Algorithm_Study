package 기초1.Day02.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        //첫 문장 입력받음
        String str = br.readLine();
        //left에 처음 문장 넣어줌
        for(int i = 0; i< str.length(); i++){
            left.push(str.charAt(i));
        }

        //테스트 숫자 입력받음
        int t = Integer.parseInt(br.readLine());

        //입력받은 문자(L,D,B,P)별로 처리함
        for (int i = 0; i<t; i++){
            String input = br.readLine();

            switch (input.charAt(0)){ //L,D,B,P만 받으려고
                case 'L':
                    if (!left.isEmpty()){
                        right.push(left.pop());
                    }
                    break;

                case 'D':
                    if (!right.isEmpty()){
                        left.push(right.pop());
                    }
                    break;

                case 'B':
                    if (!left.isEmpty()){
                        left.pop();
                    }
                    break;

                case 'P':
                    left.push(input.charAt(2));
                    break;
            }
        }

        //입력이 끝나면 왼쪽 -> 오른쪽으로 옮겨줌
        while (!left.isEmpty()){
            right.push(left.pop());;
        }

        //오른쪽꺼를 StringBuilder를 이용해서 출력해줌
        while (!right.isEmpty()){
            sb.append(right.pop());
        }

        br.close();
        System.out.println(sb);
    }

}
