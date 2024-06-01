package 알고리즘.프로그래머스.항해99.이주차;



public class DeepestLeavesSum {
    //1302 leetcode

    //이진 탐색트리의 가장 깊은 리프의 값들의 합을 반환

    //그림과 예제가 처음에 이해가지 않았다 내가 생각하는 이진탐색트리는 막연하게 완전이진트리로 생각해서
    //수가 들어가는 예제에서 헤맸지만, 그냥 각 노드에서 최대 2개까지 가지고 있는 기본 이진트리를 말하는 것
    // 들어온 input대로 그냥 채워주면 되는 것이다!

    // 먼저 채워진 트리에서 dfs나 bfs로 탐색해 제일 깊은 레벨의 수 세어주기 ( 어차피 끝까지 돌아야해서 아무거나 해도 될듯)


    int maxDepth = -1;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {

        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int depth) {

        if (root == null) {
            return 0;
        }
        if (maxDepth < depth) {
            maxDepth = depth;
            sum = root.val;

        } else if (maxDepth == depth) {
            sum += root.val;
        }
        if (root.left != null) {
            dfs(root.left, depth + 1);
        }

        if (root.right != null) {
            dfs(root.right, depth + 1);
        }
        return sum;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
      TreeNode() {

      }

        TreeNode(int val) {

            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {

            this.val = val;
            this.left = left;
            this.right = right;
        }
  }}
