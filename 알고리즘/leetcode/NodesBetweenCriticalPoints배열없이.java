package 알고리즘.leetcode;

import java.util.ArrayList;

public class NodesBetweenCriticalPoints배열없이 {

    //2058. Find the Minimum and Maximum Number of Nodes Between Critical Points

    // 노드 사이에서 임계점을 구해라
    //현재 노드가 이전 노드와 다음 노드보다 값이 크면 그 노드가 국소 최대 노드
    //현재 노드가 이전 노드와 다음 노드보다 값이 더 작으면 그 노드는 국소 최소입니다.

    // 국소 최대인지 최소인지는 중요하지 않다 둘 중 하나면 임계점 목록에 추가됨

    //연결리스트의 최소길이, 최대길이로 반환해라
    // 그렇게 구한 임계점들의 거리들을 재서 거리가 가장 작은 것이 최소거리, 거리가 가장 긴 것이 최대거리
    // 최소 거리는 두 개의 서로 다른 임계점 사이
    // 최대 거리 두 개의 서로 다른 임계점 사이
    // 임계점이 두 개 미만인 경우 [-1, -1]

    public static void main(String[] args) {

        ListNode node = new ListNode(5, new ListNode(3, new ListNode(1, new ListNode(2, new ListNode(5,
                new ListNode(1, new ListNode(2)))))));

                //5,3,1,2,5,1,2
        ListNode node1 = new ListNode(2, new ListNode(2, new ListNode(1, new ListNode(3))));
        //2,2,1,3


        NodesBetweenCriticalPoints배열없이 main = new NodesBetweenCriticalPoints배열없이();
        int[] r = main.nodesBetweenCriticalPoints(node1);
        System.out.println(r[0]);
        System.out.println(r[1]);

    }


    public int[] nodesBetweenCriticalPoints(ListNode head) {

        // 1. 임계점 찾아서 배열에 담아주기
        // 1-1 임계점을 찾기 위해 list 노드를 순회하는 ㄴ것 보다 일단 arr에 전체 node를 저장해주면 훨씬 편하겠다 전을 찾는 메서드는 없기에
        // 2. 찾은 임계점 사이에서 최소와 최대 거리 측정
        int[] answer = new int[2];
        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {

            arr.add(head.val);

            if (head.next == null) {
                break;
            }
            head = head.next;
        }
        ArrayList<Integer> dummy = new ArrayList<>();
        for (int i = 1; i < arr.size() -1; i++) {

            int current = arr.get(i);

            if (current < arr.get(i - 1) && current < arr.get(i + 1)) {
                dummy.add(i);

            }
            if (current > arr.get(i - 1) && current > arr.get(i + 1)) {
                dummy.add(i);
            }
        }

        int size = dummy.size();
        System.out.println(size);

        if (size <= 1) { // 임계점이 2개 미만이라면 바로 -1,-1 return
            answer[0] = -1;
            answer[1] = -1;
            return answer;
        }

        answer[1] = dummy.get(size - 1) - dummy.get(0);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size -1; i++) { // 인덱스로 저장하기에 최대 거리는 무조건 첫수와 마지막수다

            min = Math.min(min, dummy.get(i+1) - dummy.get(i));

            if (min == 1) { // 임계점은 index로 비교되어서 1이 최소이다.
                break;
            }

        }
        answer[0] = min;







        // 2. 임계점 사이에서 최소 값 및 최대 값을 지정
        // 3. 배열의 저장 및 반환






        return answer;

    }
}
