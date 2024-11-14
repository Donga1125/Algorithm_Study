package 알고리즘.leetcode.November;

import java.util.Arrays;

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

//        int[] arr = new int[]{11, 6};
        int[] arr1 = new int[]{9, 6,5};
//        System.out.println(sol.minimizedMaximum(6, arr));
        System.out.println(sol.minimizedMaximum(3, arr1));
    }


//    public int minimizedMaximum(int n, int[] quantities) {
//        int max = 0;
//        int capa[] = new int[n];
//
//        for (int i = 0; i < quantities.length; i++) {
//            int now = quantities[i];
//
//            while (now != 0) {
//
//
//
//                now = now % n;
//
//            }
//            }
//
//
//
//        return 1;
//


    public int minimizedMaximum(int n, int[] quantities) {

            int left = 1;
            int right = Arrays.stream(quantities).max().getAsInt();

            // 이진 탐색으로 최소 최대값을 찾습니다.
            while (left < right) {
                int mid = left + (right - left) / 2;

                // 현재 mid 값으로 각 제품을 배분할 수 있는지 확인합니다.
                if (canDistribute(n, quantities, mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            return left;
        }

        // 주어진 maxProductsPerStore(= mid 값)로 각 소매점에 제품을 나눌 수 있는지 체크합니다.
        private boolean canDistribute(int stores, int[] quantities, int maxProductsPerStore) {
            int requiredStores = 0;

            for (int quantity : quantities) {
                // 각 제품의 수량을 maxProductsPerStore 값으로 나누어 필요한 소매점 수를 구합니다.
                requiredStores += (quantity + maxProductsPerStore - 1) / maxProductsPerStore;

                if (requiredStores > stores) {
                    return false;
                }
            }

            return requiredStores <= stores;
        }

}

