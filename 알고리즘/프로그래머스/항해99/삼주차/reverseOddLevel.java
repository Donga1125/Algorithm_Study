package 알고리즘.프로그래머스.항해99.삼주차;

public class reverseOddLevel {

    public TreeNode reverseOddLevels(TreeNode root) {

        if (root == null) {

            return root;
        }


        dfs(root.left, root.right, 1);
        return root;

    }

    private void dfs(TreeNode node1, TreeNode node2, int level) {

        if (node1 == null || node2 == null) {
            return;
        }

        if (level % 2 != 0) {
//            swap(node1.val, node2.val);

            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }

        dfs(node1.left, node2.right, level + 1);
        dfs(node2.left, node1.right, level + 1);

    }

//    private void swap(int left, int right) {
//        int temp = left;
//        left = right;
//        right = temp;
//    }


}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
    TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;

     }}
