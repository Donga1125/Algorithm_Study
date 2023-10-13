package 기초1.Day03.정동아;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        int[] data = new int[N]; //처음 입력받은 수만큼 배열 크기 설정

        StringTokenizer st = new StringTokenizer(br.readLine()); //문자를 분리해서 넣어줌
        for(int i = 0; i<N; i++)
            data[i] = Integer.parseInt(st.nextToken()); //배열에 입력받은 문자들 넣어줌

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<N; i++){

            /*
             * 스택이 비어있지 않으면서
             * 현재 원소가 스택의 맨 위 원소가 가리키는 원소보다 큰 경우
             * 해당 조건을 만족할 때 까지 stack의 원소를 pop하면서
             * 해당 인덱스의 값을 현재 원소로 바꿔준다.[]
             */
            while(!stack.isEmpty() && data[stack.peek()] < data[i]){
                data[stack.pop()] = data[i];
            }

            stack.add(i); //스택에 지금 인덱스값 넣어줌
        }

        //스택의 모든 원소를 빼면서 해당 인덱스의 value를 -1로 초기화한다.
        while(!stack.isEmpty())
            data[stack.pop()] = -1;

        for(int i = 0; i<N; i++)
            sb.append(data[i]).append(" ");

        System.out.println(sb);
    }
}
