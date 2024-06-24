package 알고리즘.항해99.삼주차;

import java.util.*;

public class allPossibleFullBinaryTrees {

    //894. All Possible Full Binary Trees

    //n이 주어지고, n개의 노드를 가진 정이진트리 반환, 0을 노드를 가진 트리
    // 없거나 2개의 노드를 가진 완전이진트리 반환
    // 7개의 노드가 주어지면 그에 맞는 경우의 수의 노드들을 만들어 반환
    // 사실 상 짝수는 들어올 수가 없는데 ?..
    //경우의 수가 계속 0개이거나 2개인 경우를 호출해서 저장된 dp 반환하면 될듯 ?
    //dp의 리스트형태로 호출하고, 저장하고 treenode형태로 저장이 직관적이지 않다
    private static Map<Integer, List<TreeNode>> memo = new HashMap<>();

    // 제한 1~20

//    private static Integer[] dp = new Integer[21];


    public static void main(String[] args) {

    }
    public List<TreeNode> allPossibleFBT(int n) {

        //짝수는 올 수 없다
        if (n % 2 == 0) return new ArrayList<>();

        // 이미 계산된 값이 있으면 반환
        // dp 의 핵심
        if (memo.containsKey(n)) return memo.get(n);

        List<TreeNode> result = new ArrayList<>();

        // n이 1이면 하나의 노드만 있는 트리 반환
        if (n == 1) {
            result.add(new TreeNode(0));
        } else {
            // 모든 가능한 좌우 서브트리의 조합을 생성
            for (int leftNodes = 1; leftNodes < n; leftNodes += 2) {
                int rightNodes = n - 1 - leftNodes;
                List<TreeNode> leftTrees = allPossibleFBT(leftNodes);
                // 재귀적으로 leftnode를 호출
                List<TreeNode> rightTrees = allPossibleFBT(rightNodes);
                // 재귀적으로 rightnode를 호출

                for (TreeNode left : leftTrees) {
                    // 트리 노드 만들어주기
                    for (TreeNode right : rightTrees) {
                        TreeNode root = new TreeNode(0);
                        root.left = left;
                        root.right = right;
                        result.add(root);
                    }
                }
            }
        }

        // 결과를 메모이제이션에 저장
        memo.put(n, result);
        //마지막 result 리턴
        return result;
    }
}
