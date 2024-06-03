package 알고리즘.프로그래머스.항해99.이주차;

public class reverseOddLevelsofBinaryTree {

    //2415 RoLObT
    //binaryTree, 완전 이진탐색트리인듯 (홀수 level의 경우만 reverse
    // 2- 2^14(16384) levels 수 0~10^5
    // k level의 노드들은 2^k-1 만큼의 노드를 가지고, 총 n개의 노드를 가진다면 log2(n+1)의 level을 가짐


    //그러면 list에 저장된 level을 파악 후 홀수 여부 판별 -> 왼 오 교환 하는 형태로 재귀 호출

    //The number of nodes in the tree is in the range [1, 214].
    //0 <= Node.val <= 105
    //root is a perfect binary tree.

    public static void main(String[] args) {
        reverseOddLevelsofBinaryTree main = new reverseOddLevelsofBinaryTree();
        int[] arr = new int[]{2, 3, 5, 8, 13, 21, 34};
        TreeNode
        main.reverseOddLevels(arr);

    }
    public TreeNode reverseOddLevels(TreeNode root) {
        TreeNode answer = new TreeNode();
        return

    }

    private void dfs(int index, int[] arr) { // level 별로 인덱스 관ㄹ ㅣ? 배열로 들어오면

        if(index)
    }




    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode()
      {}
      TreeNode(int val)

      { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}}
