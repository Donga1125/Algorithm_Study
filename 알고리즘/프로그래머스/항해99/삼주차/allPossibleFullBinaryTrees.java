package 알고리즘.프로그래머스.항해99.삼주차;

import java.util.List;

public class allPossibleFullBinaryTrees {

    //894. All Possible Full Binary Trees

    //n이 주어지고, n개의 노드를 가진 완전이진트리 반환, 0을 노드를 가진 트리
    // 없거나 2개의 노드를 가진 완전이진트리 반환
    // 7개의 노드가 주어지면 그에 맞는 경우의 수의 노드들을 만들어 반환
    // 사실 상 짝수는 들어올 수가 없는데 ?..
    //경우의 수가 계속 0개이거나 2개인 경우를 호출해서 저장된 dp 반환하면 될듯 ?

    // 제한 1~20


    //dp로 트리 계속 호출일듯 ?

    private static int[] dp = new int[21];
    // 2차원 배열 ? 밑에 null이 오면 숫자가 못와서 1, 2,4,8 15 ? 개 중 7개만 가능

    public static void main(String[] args) {

    }

    public List<TreeNode> allPossibleFBT(int n) {

        //dp는 사실 7개의 배열( 가능한 경우의 수들을 다 반환인데
        //7 중 하나의 배열이 만들어지는 건 한 배열 중 0 or 2
        // 2차원 배열로 관리 ?







    }
}
