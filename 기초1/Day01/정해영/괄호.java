package 기초1.Day01.정해영;

/*
괄호 문자열 PS -> ( , ) 만으로 구성
괄호의 모양이 바르게 구성 VPS -> ( )
x가 VPS 이면 , (x) 도 VPS 이다.
VPS + VPS = VPS , VPS + VPS x = VPS x 이다.

입력데이터 개수 T

 */

import java.util.Scanner;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            System.out.println(solve(sc.next()));
        }
    }

    public static String solve(String s){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.push(c);
            }

            else if(stack.empty()){
                return "NO";
            }

            else {
                stack.pop();
            }

        }

        if(stack.empty()){
            return "YES";
        }
        else {
            return "NO";
        }

    }
}
