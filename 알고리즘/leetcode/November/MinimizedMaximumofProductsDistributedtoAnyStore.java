package 알고리즘.leetcode.November;

public class MinimizedMaximumofProductsDistributedtoAnyStore {

    //2064. Minimized Maximum of Products Distributed to Any Store

    // n은 나눠줘야할 소매점의 갯수이고, 배열은 각 제품 별 총 량이다.
    // 소매점 별로 최대로 나눠받는 수를 최소해서 그 수를 리턴하자.
    // 11,6을 6개의 소매점으로 나눈다면
    //1,1,1,1,1,1         5,6
    //2,2,2,2,2,1         0,6
    //3,3,3,3,3,2


    //7개 , 15,10,10
    // 2,2,2,2,2,2,2    1 10 10
    // 3,2,2,2,2,2,2    0 10 10
    // 4,3,3,3,3,3,3    0  3 10
    // 4,4,4,4,3,3,3    0  0 10
    // 5,5,5,5,4,4,4    0  0 3
    // 5,5,5,5,5,5,5

    // 먼저 첫번째를 다 나눠서 쓰기, 나머지 활용

    public static void main(String[] args) {

        MinimizedMaximumofProductsDistributedtoAnyStore sol = new MinimizedMaximumofProductsDistributedtoAnyStore();

        int[] arr = new int[]{11, 6};
        sol.minimizedMaximum(6, arr);
    }


    public int minimizedMaximum(int n, int[] quantities) {
        int max = 0;
        int capa[] = new int[n];

        for (int i = 0; i < quantities.length; i++) {
            int now = quantities[i];

            while (now != 0) {



                now = now % n;

            }
            }



        return 1;

    }
}

