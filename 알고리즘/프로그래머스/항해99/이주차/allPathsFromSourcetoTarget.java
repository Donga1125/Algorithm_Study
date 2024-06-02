package 알고리즘.프로그래머스.항해99.이주차;

public class allPathsFromSourcetoTarget {

    //leetcode
    // 797. All Paths From Source to Target
    // DAG, (방향이 있고사이클이 없는 비순환 알고리즘이란 뜻)
    //방향을 가진 노드들로 0부터n-1까지 갈 수 있는 방법을  return
    //배열이 주어지면 index가 그 수가 되고, 값이 갈 수 있는 방향의 수를 나타냄

    public static void main(String[] args) {
        int[][] graph = new int[][]
                {{1, 2},
                 {3},
                 {3},
                  {}};

        for (int[] ints : graph) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();

        }
    }
}
