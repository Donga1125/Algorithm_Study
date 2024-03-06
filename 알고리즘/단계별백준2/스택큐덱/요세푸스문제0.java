package 알고리즘.단계별백준2.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제0 {
    //문제 이해가 어려웠는데; k가 번째 수가 나오기 위에 앞에 껄 계속 뒤로 넣어주고 빠지면 그때부터 또 k번째 수를 나오게 하는 거
    //FIFO queue

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);

        }

        while (count != n) {


            for (int i = 0; i < k -1; i++) {
                q.add(q.poll());
            }
            count++;

            sb.append(q.poll()).append(", ");
        }


        sb.delete(sb.length() - 2, sb.length());


        System.out.println(sb.append(">"));



    }
}
