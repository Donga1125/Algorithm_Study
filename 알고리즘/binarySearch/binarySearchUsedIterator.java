package 알고리즘.binarySearch;

public class binarySearchUsedIterator {

    public int bs(int[] arr, int target) {
        int left = 0, right = arr.length - 1, mid,  answer = -1;
//        int mid = (right + left) / 2; 멍청하게 밖에서 미드를 나눴다 개별마다 미드는 계속 다시 정해져야함

        // while문은 점점 범위가 반으로 줄어들면서 left와 right가 만날 것이다.
        while (left <= right) { // 0과 20이 만나거나 left가 더 작아지면 종료하고 return -1
            mid = (right + left) / 2; // 10
            if (arr[mid] == target) { //1번째 수가 target이면 그 값 리턴
                answer = arr[mid];
                return answer;}

            if (arr[mid] < target) { //10번쨰 인덱스가 타겟보다 작다면 왼쪽을 다 버리고 왼쪽 인덱스를 다시 설정해주고 탐색 시작
                left = mid + 1;
            } else right = mid - 1;}


        //1 왼쪽과 중간 을 나눠서 mid를 정하고 그 미드랑 target이랑 비교 후
        // mid < target이면 left 값을 mid로 바꿔주고 다시 탐색
        // mid < target이면 rigth 값을 mid로 바꿔주고 다시 탐색


        return answer;}

    public static void main(String[] args) {
        binarySearchUsedIterator bs = new binarySearchUsedIterator();
        int[] arr = {0, 1, 3, 5, 6, 7, 9, 11, 23, 24, 27, 28, 32, 33, 36, 38, 40, 44, 51, 55, 60};
        int target = 10;
        System.out.println(bs.bs(arr, target));

    }
}
