package 알고리즘.프로그래머스.항해99.일주차.리트코드;

import java.util.*;

public class SmallestNumberInfiniteSet {

    // 모든 양수를 포함하는 집합이 있고, 메서드들이 들어오는대로 실행하기
    // pop은 현재 배열 중 가장 작은 것을 제거하고 반환
    // addBack은 들어온 수를 배열의 맨 앞에 추가, 삭제도 맨 앞으로
    // 우선순위 큐로 구현하면 될 거 같은데 중복이 허용 안되니 그냥 set으로 하자
    // 순서가 중요하니 linkedList로 구현 ? 애매하다 이게 더 빠를ㄲ ㅏ아님
    // linkedList 와 treeset으로 구현하는 걸 고민해보자 어차피 오름차순 정렬한다면, 트리셋도 좋을듯 ?
    // 1000개라고 하니까 1~1000까지 넣어주면 될듯

//    private static PriorityQueue<Integer> minHeap;
    SmallestNumberInfiniteSet obj = new SmallestNumberInfiniteSet();
    TreeSet<Integer> set;






    public SmallestNumberInfiniteSet() {
//        minHeap = new PriorityQueue<Integer>();
//        set = new LinkedHashSet<>(); // 생성자 호출 시 초기화 및 1000까지 세팅
        set = new TreeSet<>();

        for (int i = 1; i <= 1000; i++) {
            set.add(i);

        }


    }

    public int popSmallest() {



//        int min = set.stream()
//                .min(Comparator.comparing(x -> x))
//                .orElseThrow(NoSuchElementException::new);
        int min = set.first();
        set.remove(min);

        return min;
    }

    public void addBack(int num) {

        set.add(num);

    }
}
