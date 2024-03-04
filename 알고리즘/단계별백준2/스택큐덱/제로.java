package 알고리즘.단계별백준2.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 제로 {

    // 0 이 나오면 가장 최근 수를 지워라! 스택에서 빼고 남은 수 다 더해서 반환

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        arrayStack stack = new arrayStack(t);

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n != 0) {
                stack.push(n);

            } else
                stack.pop();

        }

        System.out.println(stack.sum);

    }


    private static class arrayStack {

        static int[] stack;
        static int top;

        int sum;


        public arrayStack(int size) {

            stack = new int[size + 1];
            top = 0;
            sum = 0;
        }


        public void push(int item) {
            stack[top++] = item;
            sum = sum + item;


        }

        public void pop() {

            sum = sum - stack[--top];

        }


    }


}
