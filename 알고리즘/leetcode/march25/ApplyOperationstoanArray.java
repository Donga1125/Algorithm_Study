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
        swap(nums,length);


        return nums;

    }

    private void swap(int[] nums, int size) {
        // 투포인터
        int left = 0;

        for (int i = 0; i <size; i++) {
            //현재 수가 일반 숫자라면 그 자리에 원래 수를 넣고 left를 +1
            if (nums[i] != 0) {
                nums[left] = nums[i];
                left += 1;

            }
            // 0이 나온다면 left는 그대로고 i는 늘어나기에
            // 0인 자리에 뒤에 오는 i를 넣을 수 있음

        }


        for (int i = left; i <size ; i++) {
            nums[i] = 0;
            // 그후 마지막 수는 0이여야 하는데 위 동작대로는 아니니까 바꿔주기 위해
            // left부터 끝까지 0으로 밀기

        }

    }
}
