package 알고리즘.leetcode.july;

import java.util.Arrays;
import java.util.Comparator;

public class MinDifference {

    //1509. Minimum Difference Between Largest and Smallest Value in Three Moves

    // 배열이 주어지면, 그 배열에서 3번의 움직임으로 배열 속 최소 값과 최대 값의 차이가
    // 가장 작게 만들어라
    // 배열의 요소를 거의 다 같게 만드는 게 제일 좋을 것 같은데
    // 고정된 배열이니 슬라이딩 윈도우로 수를 조정해나가야하나 ?
    // 고정된 배열 속에서 최대 최소의 위치도 모르니 투포인터로 ?
    // 최소 값으로 다 바꿀 수 있다면 그 값으로 바꾸면 될 것 같고
    // 최소 값으로 다 바꾸지 못한다면 그 다음 작은 수?

    // 차이가 가장 작은 수로 남겨야 한다 즉  차이가 중요한거지 수 자체가 작은건 상관 x
    // 그럼 배열이 3개보다 작으면, 그냥 0 반환 (같은수로 다 바꾸면 되니까) 같은 수 도 바꾸지말란 말은 없다
    //
    //

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 0, 10, 14};
        int[] nums1 = new int[]{1,4,5,11,20};
        int[] nums2 = new int[]{6,6,0,1,1,4,6};
        MinDifference main = new MinDifference();
        System.out.println(main.minDifference(nums2));

    }

    public int minDifference(int[] nums) {


        int size = nums.length;

        // 1. 예외처리
        if (size <= 4) { // 4보다 작거나 깉으면 같은수를 바꾸거나, 하나씩 바꾸면 되니까 0 return

            return 0;
        }

        // 2. comparator를 쓰기 위해 int를 integer로 바꿔주기 (쓰고 싶어서)

        Integer[] numInteger = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        // int 타입을 stream을 사용해서 Stream<Integer>로 box해주고 바꿔주기

        // 2. 주요로직 5개의 배열을 정렬하고 그 사이의 수의 차이가 가장 큰 3개를 제거하면 될 것 같은데 ?
        Arrays.sort(numInteger,
                new Comparator<Integer>() {



                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }

                });
        nums = Arrays.stream(numInteger).mapToInt(Integer::intValue).toArray();
        // 다시 Integer배열을 int형태의 배열로 바꿔주기


        // 3. 정렬된 수의 i번째와 i+1 번쨰와 비교해서 간극이 가장 큰 값들 찾아주기
        int[] between = new int[size - 1];

        for (int i = 0; i < size-1; i++) {

            between[i] = nums[i] - nums[i + 1];
            System.out.println("between " + i +" = "+ between[i]);


        }
        Arrays.sort(between);

        // 4. 간극이 큰 3개를 빼고 그 중에서 가장 작은 값 반환하면 도
        return between[(between.length-1) - 3];

    }
}
