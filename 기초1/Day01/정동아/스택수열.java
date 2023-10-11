package 기초1.Day01.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열 {
    //1부터 n까지의 수를 스택에 넣었다가 뽑아서 하나의 수열을 만드는 문데
    //push 숫자는 오름차순
    //push, pop 수를 체크
    static boolean result = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int t = Integer.parseInt(br.readLine());
        int index = 0;

        for (int i = 0; i<t; i++){
            int input = Integer.parseInt(br.readLine());
            if(input >= index){
                for (int j = index+1; j<=input; j++){
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                index = input;
            } else if (stack.peek() != input) {//peek는 가장 최근에 들어간 값이랑 비교한다.
                result = true;
            }

            stack.pop();
            sb.append('-').append('\n');

        }
        br.close();

        if (result){
            System.out.println("NO");
        }else {
            System.out.println(sb);
        }
    }
}
