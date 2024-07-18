package 알고리즘.leetcode.july;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NumberofGoodLeafNodesPairs {

    // 1530 Number of Good Leaf Nodes Pairs

    // 이진트리와 distance가 주어진다
    // 이진트리의 leefnode끼리의 거리가 dintance보다 작거나 같으면 좋은 노드라고 할 수 있는데
    // 좋은 노드의 갯수를 구해라

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        int distance = 3;
        NumberofGoodLeafNodesPairs main = new NumberofGoodLeafNodesPairs();
        main.countPairs(treeNode, distance);

    }

    public int countPairs(TreeNode root, int distance) {

        // 1. 이진트리의 리프 노드들의 위치를 찾기
        // 2. 저장된 이진트리의 리프 노드들을 비교해가며, 거리를 구한다

        // 2-1 거리를 어떻게 구할 것인가 생각해보면  lowest common Ancestor(공통조상)로
        // 각 노드 두개끼리의 공통조상을 구한 뒤 거기서부터 둘다 탐색했을때 distance보다 작거나 같아야함
        // 근데 애초에 안되는 딱봐도 엄청 먼 것은 굳이 공통조상으로 확인도 안해도 될 거 같은데
        // 이거 실패 최대 가까울경우 O(n^3) 까지 걸리는데
        // 노드의 갯수는 2^10 1024면 리프노드는 최대 512 들어오고
        //512^3 = 134,217,728라 좀 더 효율적인 코드를 짜야함


        List<TreeNode> leafNodes = new ArrayList<>();
        findLeefNodes(root, leafNodes);

        return 1;

    }

    private void findLeefNodes(TreeNode root,  List<TreeNode> leafNodes) {

        if (root == null) {
            return;

        }
        if (root.left == null && root.right == null) {

            leafNodes.add(root);
        }

            findLeefNodes(root.right, leafNodes);
            findLeefNodes(root.left, leafNodes);


    }


}
