package 알고리즘.leetcode;

public class NodesBetweenCriticalPoints {

    //2058. Find the Minimum and Maximum Number of Nodes Between Critical Points

    public static void main(String[] args) {

        ListNode node = new ListNode(5, new ListNode(3, new ListNode(1, new ListNode(2, new ListNode(5,
                new ListNode(1, new ListNode(2)))))));

                //5,3,1,2,5,1,2

        NodesBetweenCriticalPoints main = new NodesBetweenCriticalPoints();
        main.nodesBetweenCriticalPoints(node);


    }


    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] arr = new int[5];


        return arr;

    }
}
