package 알고리즘.leetcode.march25;

public class ApplyOperationstoanArray {

    //2460. Apply Operations to an Array

    // [i] == [i+1]이라면 현재 수 곱2 후 i+1을 0으로 바꾼 후
    // 0을 뒤로 다 미룬 후 반환

    public static void main(String[] args) {

        int nums[] = new int[]{1, 2, 2, 1, 1, 0};
        ApplyOperationstoanArray main = new ApplyOperationstoanArray();
        main.applyOperations(nums);


    }
    // 0을 미룰 때 0이 아닌 수만 저장하고 뒤에 0으로 다 초기화? or 조건으로 정렬

    public int[] applyOperations(int[] nums) {

        int length = nums.length;

        for (int i = 0; i < length -1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;

            }
        }
        for (int num : nums) {
            System.out.println("num = " + num);
        }

        return nums;

    }
}
