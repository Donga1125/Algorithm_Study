package 알고리즘.항해99.일주차;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 더맵게 {
    private static int[] arr;
    private static int k;
//    private static  PriorityQueue<Integer> minHeap;

    // 모든 음식을 k 수만큼 만들고 싶어한다. (스코빌 지수를 k만큼)
    // 그래서 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)로 만든다
    // 다 넘을 때 까지 반복하는데 최소로 반복하고 싶음

    //scoville의 길이는 2 이상 1,000,000 이하입니다.
    //K는 0 이상 1,000,000,000 이하입니다.
    //scoville의 원소는 각각 0 이상 1,000,000 이하입니다.
    //모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.


    // 문제 풀이
    // 우선 배열 정렬 후 작은 수를 반복해서 정렬로 풀려고 했는데, n2이라면 시간 복잡도가 너무 크다.
    // 문제 유형을 보니 heap이고 우선순위 큐를 위해 최소 힙과 최대 힙에 자세히 알아보고 최소 힙 구현하기
    // 근데 젤낮은건 k가 안되고 두번째로 낮은건 k 이상이면 조합 가능한가 ? 일단 된다고 생각하고 짜자

    public static void main(String[] args) {

        arr = new int[]{1, 2, 3, 9, 10, 12};
        k = 7;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            { return - Integer.compare(o1,o2); } });




        더맵게 main = new 더맵게();


        System.out.println( main.solution(arr, k));
    }

    private int solution(int[] scoville, int K) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            minHeap.add(scoville[i]);
        }
        int answer = 0;



        while (minHeap.peek() != null && minHeap.peek() < K) {
            // peek 했을 때 null 체크 해주기

            if (minHeap.size() < 2) {
                return -1; // 결합할 충분한 요소가 없음
            } // size가 하나 남았다면 불가능하다는 것!

            int a = minHeap.poll();
            int b = minHeap.poll();

            minHeap.add(b + (a * 2));
            answer++;


        }

        return answer;

        }
    }

