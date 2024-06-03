package 알고리즘.프로그래머스.항해99.이주차;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class reverseLevels {

    List<List<TreeNode>> levels = new ArrayList<>();
    traverse(root, 0, levels);

        for (int i = 1; i < levels.size(); i += 2) {
        List<TreeNode> level = levels.get(i);
        int left = 0, right = level.size() - 1;
        while (left < right) {
            int temp = level.get(left).val;
            level.get(left).val = level.get(right).val;
            level.get(right).val = temp;
            left++;
            right--;
        }
    }
}

    private void traverse(TreeNode node, int level, List<List<TreeNode>> levels) {
        if (node == null) return;

        if (levels.size() <= level) {
            levels.add(new ArrayList<>());
        }

        levels.get(level).add(node);

        traverse(node.left, level + 1, levels);
        traverse(node.right, level + 1, levels);
    }

    private void printTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                System.out.print(node.val + " ");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        System.out.println();
    }}

public  class TreeNode {
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
}

