package 알고리즘.leetcode.august;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class UglyNumberII {
    //264. Ugly Number II
    // 어글리 넘버는 2,3,5를 소인수를 가진 수이고,
    //

    //그러면 순서대로 수 중 소수를 뺴는 건 안될까?
    // 에라토스테네스의 체로 걸러서 1,2,3,5 순서는 포함하고 그 다음 소수부터 포함 안 시키면?
    // 실패 12도 소수인데 조합으로 가능하다 ㅔ


    public static void main(String[] args) {

        int uglyNumber = 10;

        UglyNumberII sol = new UglyNumberII();
        System.out.println(sol.nthUglyNumber(uglyNumber));

    }

    public int nthUglyNumber(int n) {

        // 10이라고 하면 index라는 수를 활용해 배수를 저장할 때 마다, ++해서 세어보자
        // 막 추가하고 정렬해서 반환?
        int index = 1;
        int x = 1;
        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        list.add(1);
        set.add(1);

        while (index < n + 1) {


            list.add(2 * x);
            set.add(2 * x);

            list.add(3 * x);
            set.add(3 * x);

            list.add(5 * x);
            set.add(5 * x);;
            index += 3; // 중간에 인덱스를 넘을 수 있지만 상관 x
            x++;

        }

        Collections.sort(list);
        for (Integer i : set) {

        }

        return list.get(n);



    }






    private void isPrime(int n) {

        boolean prime[] = new boolean[1691];


        prime[0] = prime[1] = true;


        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (!prime[i]) {
                for (int j = i * i; j <= n ; j = j + i) {

                    prime[j] = true;

                }

            }
        }

        for (int i = 0; i < prime.length; i++) {
            if (!prime[i]) {

                System.out.println(i);
            }

        }

    }


}
