package 알고리즘.leetcode;

public class MergeNodesinBetweenZeros정답 {

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


        MergeNodesinBetweenZeros정답 main = new MergeNodesinBetweenZeros정답();
        ListNode listNode = main.mergeNodes(node);
        printList(listNode);



    }

    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int sum = 0;

        while (head.next != null) {

            if (head.val == 0 && sum != 0) {
                current.next = new ListNode(sum);
                current = current.next; //
                sum = 0;

            } else {
                sum = sum + head.val;}

            head = head.next;
        }


        return dummy;


    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
            if (head != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

}