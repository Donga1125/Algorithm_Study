package 알고리즘.leetcode.july;

import java.util.ArrayList;
import java.util.List;

public class NumberofGoodLeafNodesPairsDFS {

    // 1530 Number of Good Leaf Nodes Pairs

    // 이진트리와 distance가 주어진다
    // 이진트리의 leefnode끼리의 거리가 dintance보다 작거나 같으면 좋은 노드라고 할 수 있는데
    // 좋은 노드의 갯수를 구해라

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        int distance = 3;
        NumberofGoodLeafNodesPairsDFS main = new NumberofGoodLeafNodesPairsDFS();
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


        int[] count = new int[1];
        dfs(root, distance, count);
        return count[0];



    }

    private int[] dfs(TreeNode node, int distance, int[] count) {
        if (node == null)
            return new int[distance + 1];

        // 리프 노드인 경우
        if (node.left == null && node.right == null) {
            int[] leafDistance = new int[distance + 1];
            leafDistance[1] = 1;  // 리프 노드이므로 거리 1에 값 1
            return leafDistance;
        }

        int[] leftDistances = dfs(node.left, distance, count);
        int[] rightDistances = dfs(node.right, distance, count);

        // 각 리프 노드 쌍의 거리를 계산
        for (int i = 1; i <= distance; i++) {
            for (int j = 1; j <= distance - i; j++) {
                count[0] = count[0] + (leftDistances[i] * rightDistances[j]);


            }
        }

        // 현재 노드의 리프 노드 거리 정보를 업데이트
        int[] currentDistances = new int[distance + 1];
        for (int i = 1; i < distance; i++) {
            currentDistances[i + 1] = leftDistances[i] + rightDistances[i];

        }

        return currentDistances;
    }




}
