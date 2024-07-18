package 알고리즘.leetcode.july;

public class NumberofGoodLeafNodesPairs {

    // 1530 Number of Good Leaf Nodes Pairs

    // 이진트리와 distance가 주어진다
    // 이진트리의 leefnode끼리의 거리가 dintance보다 작거나 같으면 좋은 노드라고 할 수 있는데
    // 좋은 노드의 갯수를 구해라

    public static void main(String[] args) {

    }

    public int countPairs(TreeNode root, int distance) {

        // 1. 이진트리의 리프 노드들의 위치를 저장
        // 2. 저장된 이진트리의 리프 노드들을 비교해가며, 거리를 구한다

        // 2-1 거리를 어떻게 구할 것인가 생각해보면  lowest common Ancestor(공통조상)로
        // 각 노드 두개끼리의 공통조상을 구한 뒤 거기서부터 둘다 탐색했을때 distance보다 작거나 같아야함
        // 근데 애초에 안되는 딱봐도 엄청 먼 것은 굳이 공통조상으로 확인도 안해도 될 거 같은데

    }


}
