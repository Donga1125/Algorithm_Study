package 기초1.Day04.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class 후위표기식2 {
    //후위 표기식과 각 피연산자에 대응하는 값들이 주어져 있을 때, 그 식을 계산
    //계산 결과를 소숫점 둘째 자리까지 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double>stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int[] data = new int[N]; //처음 입력받은 수만큼 배열 크기 설정

        String input = br.readLine(); //문자 넣어줌

        for(int i = 0; i<N; i++) {
            data[i] = Integer.parseInt(br.readLine()); //배열에 입력받은 숫자들 넣어줌
        }

        for (int i =0; i< input.length(); i++){
            char c = input.charAt(i); //둘째줄에 입력받은 문자를 잘라서 넣어줌
            if (c>= 'A' && c<= 'z') {//A ~Z 사이 알파벳이면
                double d = data[c - 'A']; //
                stack.push(d); //스택에 입력받은 수 넣어줌
            }else {
                double d1 = stack.pop();
                double d2 = stack.pop(); //스택에서 숫자 두개 뺌
                double d3 = 0.0; //연산 결과

                switch (c){
                    case '+':
                        d3 = d2 + d1;
                        break;
                    case '-':
                        d3 = d2 - d1;
                        break;
                    case '*':
                        d3 = d2 * d1;
                        break;
                    case '/':
                        d3 = d2/d1;
                        break;
                }
                stack.push(d3);

            }
        }

        System.out.printf("%.2f",stack.pop()); //소수점 둘째자리까지 출력. stack에 남아있는건 최종 연산 결과값
    }

}
