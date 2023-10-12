package 기초1.Day03.정해영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오등큰수 {

    /*
    등장횟수에 따라서..! 오른쪽에 있으면서 등장한 횟수가 An보다 큰수중에 가장왼쪽에 있는수를 찾는다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int[] data = new int[N];
        int[] count = new int[1000001]; //data 입력을 받은 후에 갯수를 확인 하여 count를 만들면 시간 초과가 나온다.
        int[] answer = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++){
            data[i] =Integer.parseInt(st.nextToken());
            count[data[i]]++;
        }

        for(int i=0; i<N; i++){
            while (!stack.isEmpty() && count[data[stack.peek()]] < count[data[i]]){
                answer[stack.pop()] = data[i];
            }
            stack.add(i);
        }

        while (!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }


        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            sb.append(answer[i]).append(" ");
        }

        System.out.println(sb);
    }
}
