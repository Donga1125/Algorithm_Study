package 알고리즘.단계별백준2.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2 {

    // queue 문제 맨 위 제거 후  다음 수도 제거하고 그 수 그대로 맨 다시 넣기 반복했을 떄 제일 마지막에 있는 수가 뭔지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

//        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();


        for (int i = 1; i <= t; i++) {


            q.add(i);

        }



        while (q.size() > 1) {

            q.poll();
            Integer w = q.poll();;
            q.offer(w);

        }

        System.out.println(q.peek());


    }
}
