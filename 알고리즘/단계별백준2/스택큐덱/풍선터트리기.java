package 알고리즘.단계별백준2.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 풍선터트리기 {

    ///원형으로 배열을 유지해서  그 값이 음수면 왼쪽으로 번호만큼 이동해서 제거 양수면 오른쪽으로 이동해서 제거 하는 방식
    // 덱을 쓰면 된단다..

    //구현 하려니 원으로 구현하는 게 어려웠다
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        Deque<int[]> dq = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        sb.append("1 ");
        int move = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= t; i++) { //애초 첫 데이터 빼고 계산

            dq.add(new int[]{i, Integer.parseInt(st.nextToken())});

        }

        while (!dq.isEmpty()) {
            if (move > 0) { // 양수일 경우

                for (int i = 1; i < move ; i++) { // 원형으로 만들어주기 위해 아닌 수는 앞에서 빼고 뒤로 추가
                    // 그 데이터 전까지 뽑혀야 하기 때문에 -1한 수까지 이동해주고
                    dq.add(dq.pollFirst());

                }
                int[] next = dq.removeFirst(); // 그 수를 직접 빼내서 출력
                move =next[1];
                sb.append(next[0]).append(" ");


            } else if (move < 0) { // 음수

                for (int i = move; i < -1; i++) { //원형으로 만들어주기 위해 아닌 수는 뒤에서빼고  앞으로 추가
                    dq.addFirst(dq.pollLast()); // 음수니까 앞으로 추
                    
                }
                int[] next = dq.removeLast();
                move = next[1];
                sb.append(next[0]).append(" ");

            }
        }

        System.out.println(sb);
            
    }
}
