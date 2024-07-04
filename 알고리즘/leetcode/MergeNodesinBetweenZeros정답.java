package 알고리즘.leetcode;

public class MergeNodesinBetweenZeros {

    //2181. Merge Nodes in Between Zeros

    //0과 0 사이의 수를 반환

    //3, 2* 10^5 20만까지 들어온다

    //그냥 수로 저장하고, 0만나면 count에 sumArr -> 0 나오면 배열에 저장 후 초기화

    //Constraints:
    //
    //The number of nodes in the list is in the range [3, 2 * 105].
    //0 <= Node.val <= 1000
    //There are no two consecutive nodes with Node.val == 0.
    //The beginning and end of the linked list have Node.val == 0.

    // 10^5 x2
    // consecutive한 노드는 없다
    // between start end == 0 abs


    /**
     * You are given the head of a linked list, which contains
     * a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.
     * <p>
     * For every two consecutive 0's,
     * merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes.
     * The modified list should not contain any 0's.
     * <p>
     * Return the head of the modified linked list.
     */


    public static void main(String[] args) {

        //0,3,1,0,4,5,2,0]


        ListNode node = new ListNode
                (0, new ListNode(3, new ListNode(1, new ListNode
                        (0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0))))))));


        MergeNodesinBetweenZeros main = new MergeNodesinBetweenZeros();
        main.mergeNodes(node);



    }

    public ListNode mergeNodes(ListNode head) {

        int notFirst = 0;
        int nowCount = 0;

        ListNode answer = new ListNode();

        while (true) { // 마지막 0은 ?
            // 다시 잘 생각해보면 3가지 동작
            // 현재 수가 0이고, 다음 수가 있으면  nowCount를  초기화

            // 현재 수가 0이고, 다음 수가 없으면  break ?

            // 다음 수가 0일 때 현재까지의 NowCount를 answer의 next에 넣어준다. (이때 초기화해도 되고, 더해줘도 된다)


            if (head.val == 0 && head.next.val != 0) { // 자료 구조의 값을

                nowCount = 0; // 현재 수가 0이고, 다음 수가 있으면  nowCount를  초기화 // 첫0 시작의 0의 경우


            } else if (head.val == 0 && head.next == null) { // 현재 수가 0이고, 다음 수가 아예 없음 break;

                break;

            } else if (head.next.val == 0) { // 다음 수가 0이면 nowCOunt를 answer에 넣어주기
                nowCount = nowCount + head.val;

                answer.next = new ListNode(nowCount);
                answer = answer.next;
                // 다음 주소 값 연결을 어떻게 하지 ?
                //answr[


            }


        }


        return answer;

    }

}