package 알고리즘.leetcode.july;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodesAndReturnForest {

    // 1110. Delete Nodes And Return Forest

    //각각 다른 노드를 가진 이진트리가 주어지고, 트리의 노드를 지웠을 때 끊어서 반환

    //[1,2,3,4,5,6,7]                                                  3개의 트리가 생김 [1,2,null,4], [6],[7]
    //        1                                  1
    //     2     3    delete[3,5] ->         2
    //   4  5   6  7                      4          ,   6    , 7

    public static void main(String[] args) {

        TreeNode node = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5))
                , new TreeNode(3, new TreeNode(6), new TreeNode(7)));

        int[] delete = new int[]{3, 5};
        DeleteNodesAndReturnForest main = new DeleteNodesAndReturnForest();
        main.delNodes(node, delete);


    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        // 지울 노드를 찾아서 하나씩 지운다.
        // bfs로 찾으면서 하나씩 지우기 ?

        Set<Integer> toDeleteSet = new HashSet<>();
        for (int del : to_delete) {
            toDeleteSet.add(del);
        }
        List<TreeNode> forest = new ArrayList<>();
        deleteNode(root, toDeleteSet, forest, true);
        return forest;
    }

    private TreeNode deleteNode(TreeNode node, Set<Integer> toDeleteSet, List<TreeNode> forest, boolean isRoot) {

        if (node == null) return null;

        boolean deleted = toDeleteSet.contains(node.val);
        if (isRoot && !deleted) {
            forest.add(node);
        }

        node.left = deleteNode(node.left, toDeleteSet, forest, deleted);
        node.right = deleteNode(node.right, toDeleteSet, forest, deleted);

        return deleted ? null : node;
    }




        
        

}
