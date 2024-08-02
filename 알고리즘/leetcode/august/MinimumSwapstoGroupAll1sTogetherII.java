package 알고리즘.leetcode.august;

import java.util.LinkedList;

public class MinimumSwapstoGroupAll1sTogetherII {

    // 2134. Minimum Swaps to Group All 1's Together II

    // 원형 배열에서 swap으로 1이 그룹되기 만들자

    // 연결되어 있는 1의 길이가 있는데, 앞 뒤로도 원형이라 가능하니
    // 앞으로 원형유지해야하나 뒤로 원형 유지 해야하나를 판별 후에 swap해야할듯?
    // 판별을 슬라이딩 윈도를 사용하는듯

    public static void main(String[] args) {

        int arr[] = new int[]{0, 1, 0, 1, 1, 0, 0};
        MinimumSwapstoGroupAll1sTogetherII sol = new MinimumSwapstoGroupAll1sTogetherII();
        sol.minSwaps(arr);


    }

    public int minSwaps(int[] nums) {

        int length = nums.length;
        int countOne = 0;



        for (int i = 0; i < length; i++) { // 6개 중 3개

            if (nums[i] == 1) {
                countOne++;
            }
        }
        //[0, 1, 0, 1, 1, 0, 0] // 어떤 기준으로 슬라이딩 ?


        int maxOnesInWindow;
        int currentOnes = 0;


        for (int i = 0; i < countOne; i++) {
            if (nums[i] == 1) currentOnes++;
        }



        maxOnesInWindow = currentOnes;


        for (int i = 1; i < length; i++) {
            int endIndex = (i + countOne - 1) % length; // 새로 포함될 요소의 인덱스
            int startIndex = (i - 1) % length; // 윈도우에서 제외될 요소의 인덱스

            //현재 인덱스에서 바로 다음 꺼 추가 이전꺼 빼는 작업을 하면서 Current를 구함
            // [0,1,0]을 계산하는 게 아니라 이걸로 위에서 잡고 바로 [1,0,1]을 계산이 첫번째임


            // [0, 1, 0, 1, 1, 0, 0]
            if (nums[endIndex] == 1) currentOnes++;  //첫번째 0,1,0은 이미 구했고,
            // 1,0,1으로 잡았을때 currentOne만 구하면 되기에 0번째 인덱스가 1이면 빼주고 아니면 그냥냅둠
            // 그리고 마지막인덱스가 1이면 +1
            if (nums[startIndex] == 1) currentOnes--;

            maxOnesInWindow = Math.max(maxOnesInWindow, currentOnes);
        }


        return countOne - maxOnesInWindow;
        // 1의 갯수에서 지금 윈도우에서 최대로 포함된 1의 갯수를 빼주면 0이 몇개 포함여부를 알 수 있으니
        // 그걸 스왑해준다고 가정하면 뺸 값이 정답


    }
}
