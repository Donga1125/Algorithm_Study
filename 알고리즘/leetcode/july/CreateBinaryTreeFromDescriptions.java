package 알고리즘.leetcode.july;

import java.util.HashSet;

public class CreateBinaryTreeFromDescriptions {

    //2196. Create Binary Tree From Descriptions

    // 주어진 description에 따른 이진트리를 만들어라
    // descriptions[i] = [parent[i], child[i], isLeft[i]]
    //parent[i]는 child[i]에 부모이고,
    // isLeft[i]의 1은 왼쪽 childNode, 0은 오른 쪽 childNode를 뜻함
    // return 값은 Tree를 쭉 반환


    public static void main(String[] args) {
        int[][] descriptions = new int[][]{{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        // inonder 방식을 preoder로 바꿔야하나 ?



        CreateBinaryTreeFromDescriptions main = new CreateBinaryTreeFromDescriptions();
        main.createBinaryTree(descriptions);
    }


    public TreeNode createBinaryTree(int[][] descriptions) {

        // 1. 배열이 들어오면 root를 찾는다.
        // 1-1 root는 child[i]번째에 없는 수
        // 근데 root별로 찾는 게 아니라 level 별로 기록해야 할 거 같은데
        // 그렇다면 현 시점에서 가장 root node를 (위가 더 없는) 찾아서 만들고 배열에서 뺴주고 이런 식으로 가야할듯

        // 2. 루트로부터 계속 자식 노드를 찾아서 만들며 반환

        HashSet<Integer> set = new HashSet<>();

        int length = descriptions.length;
        int root = 0;




        for (int i = 0; i < length; i++) {

            root += descriptions[i][1];

            for (int j = i+1; j < length; j++) {
                if (descriptions[i][0] == descriptions[j][1]) {
                    break;



                }
            }

        }


    }

}
