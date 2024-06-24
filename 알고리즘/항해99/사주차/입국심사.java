package 알고리즘.항해99.사주차;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 입국심사 {

    // 들어오는 수가 너무 많다;

    //FIFO = QUEUE
    //각각의 심사관 마다 line안에 집어넣는데 기다리는 순은
    // queue로 구현
    // 어딜 고를거냐 ? 무조건 times가 작은 곳이 아닌(누적x) , 사
    // 다 듣는 시간까지 고려 해야하기 때문에 현재 바로 듣는다고 해서 더 빨리 마치는 게 아니네
    // 그럼 고려할 사항이 다 들었을 때 짧은 시간을 계산해야한다
    // 매번 어느 것이 더 빨리 끝날 것인지 찾는

    // 고려 사항이 지금 현재 시간에서 아직 끝나지 않은 것도 몇분 후에 끝나는 지 + 심사관이 걸리는 시간
    // 이걸 근데 마지막 수만 생각하면 안되고, 그 어느 시점에 되면 다 고려해야할 것 깉다

    private static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {

        int n = 6;
        int[] times = new int[]{7, 10};

        입국심사 main = new 입국심사();
        System.out.println(main.solution(n, times));



    }

    public long solution(int n, int[] times) {

        long answer = 0;


        Arrays.sort(times);

        long left = times[0];

        long right = (long) times[times.length - 1] * (long) n; // 최악의 경우


        while (left <= right) {

            long mid = (left + right) / 2;
            long sum = 0;

            for (int time : times) {

                sum = sum + (mid / time);
            }

                if (sum >= n) {
                    answer = mid;
                    right = mid - 1;
                } else
                    left = mid + 1;
            }
        return answer;
    }




            // 고려할 게 마지막에 제일 큰 수가 아닌
            // 현재 선택 과정에서 (현재 시간에서 다른 심사대가 끝날 시간 + 실제 심사시간)이 가장 작을 경우를 선택
            // 사실 10과 7을 고르는 건 현재 시간이 7분이라면  0+7 or 3+10 중 더 적게 걸리는 거
            // 같다면 실제 심사시간이 더 적은거 골라라)



    }

