package 기초1.Day10.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaseConversion {
    //입력으로 주어진 A진법으로 나타낸 수를 B진법으로 변환하여 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Stack<Integer> stack = new Stack<>();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        int sum = 0;
        br.close();
        //A진법 -> 10진법으로 변환
        for (int i =t-1; i>=0; i--){
            int N = Integer.parseInt(st.nextToken());
            sum += N * Math.pow(A,i); //Math.pow는 특정값의 제곱을 구해준다.
        }

        //10진법 -> A진법으로 변환
        while (sum != 0){
            stack.push(sum % B);
            sum /= B;
        }

        //stack 값 출력
        while (!stack.isEmpty()){
           sb.append(stack.pop()).append(" ");
        }
        System.out.println(sb);
    }
}
