package 알고리즘.leetcode.august;

import java.util.Iterator;
import java.util.TreeSet;

public class UglyNumberII정답 {
    //264. Ugly Number II
    // 어글리 넘버는 2,3,5를 소인수를 가진 수이고,
    //

    //그러면 순서대로 수 중 소수를 뺴는 건 안될까?
    // 에라토스테네스의 체로 걸러서 1,2,3,5 순서는 포함하고 그 다음 소수부터 포함 안 시키면?
    // 실패 12도 소수인데 조합으로 가능하다 ㅔ


    public static void main(String[] args) {

        int uglyNumber = 10  ;

        UglyNumberII정답 sol = new UglyNumberII정답();
        System.out.println(sol.nthUglyNumber(uglyNumber));
//        sol.nthUglyNumber(uglyNumber);

    }

    public int nthUglyNumber(int n) {

        //dp로 해결

        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;  // 첫 번째 어글리 넘버는 1

        int p2 = 0, p3 = 0, p5 = 0;  // 2, 3, 5에 대한 포인터 초기화
        int next2 = 2, next3 = 3, next5 = 5;  // 다음 후보들

        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(next2, Math.min(next3, next5));
            uglyNumbers[i] = nextUgly;

            if (nextUgly == next2) {
                p2++;
                next2 = uglyNumbers[p2] * 2;
            }
            if (nextUgly == next3) {
                p3++;
                next3 = uglyNumbers[p3] * 3;
            }
            if (nextUgly == next5) {
                p5++;
                next5 = uglyNumbers[p5] * 5;
            }
        }

        return uglyNumbers[n - 1];  // n번째 어글리 넘버를 반환
    }


    }




