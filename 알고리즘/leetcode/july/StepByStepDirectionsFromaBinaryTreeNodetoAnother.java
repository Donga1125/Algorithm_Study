package 알고리즘.leetcode.july;

import java.util.LinkedList;
import java.util.Queue;

public class StepByStepDirectionsFromaBinaryTreeNodetoAnother {

    // 2096. Step-By-Step Directions From a Binary Tree Node to Another


    //n개의 노드를 가진 이진트리가 주어지고, 각자 고유한 번호를 1~n까지 부여
    // 시작 노드부터 도착 노드까지의 최단 거리로 움직이는데,
    // U = from node to parent node
    // R = from node to right child node
    // L = from node to left child node

    // return은 최단거리로 움직 였을 때의 사용된 String을 반환

    // 시작노드와 도착 노드는 같을 수 없다

    //dp를 활용하면 좋을 것 같은데 일단 dfs로 dp 구현보다는 bfs로 최단 거리를 찾는 게 더 좋아보인다

    //bfs 활용 depth가 1인 것 들 다 넣고 enqueue


    private static final char up = 'U';
    private static final char left = 'L';
    private static final char right = 'R';



    public static void main(String[] args) {

        TreeNode node = new TreeNode(5,
                new TreeNode(1,
                        new TreeNode(3), null),

                new TreeNode(2, new TreeNode(6), new TreeNode(4)));

        int startValue = 3;
        int destValue = 6;

        StepByStepDirectionsFromaBinaryTreeNodetoAnother main = new StepByStepDirectionsFromaBinaryTreeNodetoAnother();
        System.out.println(main.getDirections(node, startValue, destValue));

    }


    public String getDirections(TreeNode root, int startValue, int destValue) {

        StringBuilder sb = new StringBuilder();

        // 1. 트리를 순회하며 startValued의 위치를 찾아야함.. 트리 순서가 뒤집히니 하나를 복사해서 찾는 트리를 만들고 만들어진
        // path를 따로 트리에 담아 ?
        // 근데 이거 트리 순회하며 현재 수 찾는데..만약 찾다가 destvalue 나오면 개이득아님 ?
        // parent node를 어떻게 찾음 ?

        // 2. 찾은 startValue로 부터 depth가 1인 것부터 시작해서 (u,r,l 셋 가능하다면 depth가 1이라고 가정)

        // 3. destValue를 찾는다. 찾은 destValue까지의 path를 기록


        // 아니 최선의 시도는 startV 찾을 때 둘 다 dfs로 찾고, destvalue 있음 역 추적하면 될 거 같고
        // 없으면 그 자리에서 다시 dfs 돌려서 찾음 될듯

        // 틀림

        // lowest common Ancestor lca 최소공통조상 알고리즘

        while (true) {

            if (root.val == startValue) {
                break;

            }


           // 2개 분기 왼 쪽 가냐 오른 쪽 가냐





        }




        Queue<Integer> queue = new LinkedList<>();

        return "";

    }

    private boolean findPath(TreeNode node, int value) {
        if(node == null){

            return false;}

        if (node.val == value) {
            node.val = -1;
            return true;
        }

        if (findPath(node.left, value)) {
            return true;
        }

        if (findPath(node.right, value)) {
            return true;
        }

        return false;
    }


}
