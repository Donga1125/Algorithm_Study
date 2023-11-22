package 기초1.Day03.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){

            //스택이 비어있지 않으면서, 현재의 원소(seq[i])가 스택의 맨위 원소보다 큰경우,
            //해당조건을 만족할때까지 stack의 원소를 pop 하면서 해당인덱스의 값을 현재의 원소로 바꿔준다.
            while (!stack.isEmpty() && seq[stack.peek()] <seq[i]){
                seq[stack.pop()] = seq[i];
            }
            stack.push(i); //인덱스를 넣어준다.
        }

        /*
        스택의 모든원소를 pop 하면서 해당 인덱스의 value를 -1로 초기화한다.
         */
        while (!stack.isEmpty()){
            seq[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(seq[i]).append(' ');
        }

        System.out.println(sb);
    }
}
