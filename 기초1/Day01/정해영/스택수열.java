package 기초1.Day01.정해영;

/*
push하는 순서는 오름차순. 임의의 수열이 주어졌을때 스택을 이용해 수열을 만들수 있는지
어떤순서로 수행해야하는지 보여준다.

push 연산 -> +
pop 연산 -> -
불가능 -> NO

순서 :

입력받기 -> push하기 -> 원하는 숫자면 POP -> 만약 해당 숫자가 못나오면 NO 출력 -> 모두 출력했다면 +-값 출력
 */

import java.util.Scanner;
import java.util.Stack;

public class 스택수열 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();

        int start = 0;

        for(int i=0; i<n; i++){

            int value = sc.nextInt();

            if(value > start){

                for(int j=start+1; j<=value; j++){
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                start = value;
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        sc.close();

        System.out.println(sb);
    }
}
