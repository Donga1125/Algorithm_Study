package 알고리즘.단계별백준2.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class 도키도키간식드리미 {

    //기존 대기열은 앞에서부터 나가야하니 queue 추가로 만들어진 대기열에서는 먼저들어오고 마지막이 빠져야하니까 stack
    //그리고 간식 줄은 순서대로만 들어가게 됨 다 들어가면 nice 아님 sad 리턴하면 됨 추가로 만들어진 대기열에서
    // 기존 대기열로 옮기진 못함

    //기존 코드는 큐를 다 비워주고 스택에서 판별했는데 이럼 안된다 큐를 비우면서 스택의 수가 카운트랑 같으면 스택뺴주고 다시 큐 비워주고 해야함

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count = 1;

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(st.nextToken());

            queue.offer(n);

        }

        while (!queue.isEmpty()) {
            if (queue.peek() == count) {
                queue.poll();
                count++;
            } else if (!stack.isEmpty() && stack.peek() == count) {
                stack.pop();
                count++;

            } else {
                stack.push(queue.poll());

            }
        }

        while (!stack.isEmpty()) { // 큐가 다 비워지면서 작동함 ( 중요한건 큐에서 싹다 비우면 실행하면 안되고 상황에 맞게 비워야함)
            if (stack.peek() == count) {
                stack.pop();
                count++;
            } else {
                System.out.println("Sad");
                return; // 멍청하게 뒤에 조건 걸어놓고 break를 써서 계속 틀렸다.
            }
        }

        System.out.println("Nice");





    }
}
