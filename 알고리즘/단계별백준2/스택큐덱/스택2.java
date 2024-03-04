package 알고리즘.단계별백준2.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택2 {
    //1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
    //2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    //3: 스택에 들어있는 정수의 개수를 출력한다.
    //4: 스택이 비어있으면 1, 아니면 0을 출력한다.
    //5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
    public static StringBuilder sb = new StringBuilder();




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;

        arrayStack stack = new arrayStack();

        for (int i = 0; i < t; i++) {



            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "1" :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    stack.size();
                    break;
                case "4":
                    stack.empty();
                    break;
                case "5":
                    stack.peek();
                    break;

            }

        }
        System.out.println(sb);



    }



    public static class arrayStack {


        int top;
        int[] stack;


        public arrayStack() {

            stack = new int[1000001];
            top = 0;
        }

        public void push(int item) {
            stack[top++] = item;
        }

        public void pop() {

            if(top > 0) {
                sb.append(stack[--top]).append("\n");
            } else
                sb.append(-1).append("\n");

        }

        public void size() {

            sb.append(top).append('\n');
        }

        public void empty() {
            if (top == 0) {
                sb.append(1).append('\n');
            } else sb.append(0).append('\n');
        }

        public void peek() {
            if (top == 0) {
                sb.append(-1).append('\n');
            } else
                sb.append(stack[top - 1]).append('\n');
        }


        }
    }


