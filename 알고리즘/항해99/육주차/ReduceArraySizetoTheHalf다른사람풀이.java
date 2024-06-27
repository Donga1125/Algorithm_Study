package 알고리즘.항해99.육주차;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReduceArraySizetoTheHalf다른사람풀이 {

    //1338. Reduce Array Size to The Half

    //배열이 주어지면 배열 안에 있는 수 중 하나를 골라 그 수를 다 없앨 수 있다.
    //그럴 때 반이 상 줄일 수 있는 최소의 갯수를 반환

    //arr = [3,3,3,3,5,5,5,2,2,7]
    // set을 사용해서 하나씩 담는데, 조합되는 수 를 찾는ㄷ ㅏ?
    // map으로 찾고, 그 수를 돌면서 반 이상되면 바로 리턴 ? 3 =4 5=3 2=2 7=1
    // 키 값은 상관 없음 번호로 부여하고, 몇개인지가 중요

    public static void main(String[] args) {
        int arr[] = new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        int arr1[] = new int[]{1, 9};
        ReduceArraySizetoTheHalf다른사람풀이 main = new ReduceArraySizetoTheHalf다른사람풀이();
        System.out.println(main.minSetSize(arr));
    }


    public int minSetSize(int[] arr) {

        int mx = 0;
        for (int x : arr) {
            mx = Math.max(mx, x);
        }
        int[] cnt = new int[mx + 1];
        for (int x : arr) {
            ++cnt[x];
        }
        System.out.println("cnt = " + Arrays.toString(cnt));

        Arrays.sort(cnt);
        int ans = 0;
        int m = 0;
        for (int i = mx;; --i) {
            if (cnt[i] > 0) {
                m += cnt[i];
                ++ans;
                if (m * 2 >= arr.length) {
                    return ans;
                }
            }
        }
    }
}
