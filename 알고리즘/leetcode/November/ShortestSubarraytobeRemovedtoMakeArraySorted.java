package 알고리즘.leetcode.November;

public class ShortestSubarraytobeRemovedtoMakeArraySorted {

    //1574. Shortest Subarray to be Removed to Make Array Sorted

    // 배열이 주어지는데 그 배열에서 가장 작게 제거하여 ASC를 만들어라.
    // 그 후 제거한 배열의 길이를 리턴

    // 제거를 안해도 된다
    // dp로 하면 될듯 ? x
    // 1,2,3,10,4,2,3,5 1,2,3 235

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 10, 4, 2, 3, 5};
        ShortestSubarraytobeRemovedtoMakeArraySorted sol = new ShortestSubarraytobeRemovedtoMakeArraySorted();
        System.out.println(sol.findLengthOfShortestSubarray(arr));

    }

    public int findLengthOfShortestSubarray(int[] arr) {

        int n = arr.length;

        int left = 0;



        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            // left+1이 배열의 길이를 초과하지 않고, asc로 되어있는 부분까지 확인하기 위해

            left++;
            // 정렬되어 있는 인덱스까지 찾아주기

        }

        if (left == n - 1) {//이미 정렬이 완료된 상태라면, 비교할 것도 없이 0 리턴
            return 0;
        }

        int right = n - 1;

        while (right > 0 && arr[right] >= arr[right - 1]) {
            //rihgt가 배열의 0인덱스를 벗어나지 않고 asc로 되어 있는지 현재수와 -1를 비교
            right--;
            //그 이후 right 값을 지정

        }

        int minLength = Math.min(n - left - 1, right);
        // 아~ 기본 제거 해야할 것을 정할 때 애초에 초기 값으로
        // 앞에서 제거하거나 뒤에서 제거하거나 하는 경우에서 더 작은 걸로 이미 세팅 후

        int i = 0, j = right;
        // 투 포인터로 찾아내기 right로 최소로 잡게 해주고,
        while (i <= left && j < n) {
            //  배열 범위 안에서 계속 찾아내기
            if (arr[i] <= arr[j]) {
                // 현재 수가 범위의끝수보다 작다면
                minLength = Math.min(minLength, j - i - 1);
                // 최소 값을 비교해줌 이미 다 지운 최소값과 현재 상황의 배열을 지울때 중 최소를 비교하고
                i++; // 왼쪽 포인터 늘리기
            } else {
                j++; // 현재 수가 ㄱ범위 끝 수보다 크다면 범위 right를 줄여주기
            }
            // 배열 범위 내에서 계속 반복
        }

        return minLength;
    }



}

